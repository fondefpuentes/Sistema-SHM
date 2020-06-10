import paho.mqtt.client as mqtt
import time,json,csv
from random import randrange
from time import sleep
import scipy.io as sc
import os
# Esto es de mqtt
def on_log(client, userdata, level, buf):
   print(buf) 
def on_connect(client, userdata, flags, rc):
    if rc==0:
        client.connected_flag=True #set flag
        print("connected OK")
    else:
        print("Bad connection Returned code=",rc)
        client.loop_stop()  
def on_disconnect(client, userdata, rc):
   print("client disconnected ok")
def on_publish(client, userdata, mid):
    print("In on_pub callback mid= "  ,mid)

mqtt.Client.connected_flag=False#create flag in class
mqtt.Client.suppress_puback_flag=False
client = mqtt.Client("python1")             #create new instance 
#client.on_log=on_log
client.on_connect = on_connect
client.on_disconnect = on_disconnect
client.on_publish = on_publish

#Aca esta puesta la ip local, pero supongo que habra que cambiarla
broker="127.0.0.1"
port =1883

#topic al gateway, no se puede cambiar, este se utiliza para enviar las telemetrias o publicaciones
topic="v1/gateway/telemetry"
#topic que se usa para conectar al gateway los devices que seran publicados
devices="v1/gateway/connect"

#el username es el token que se saca de thingsboard, cuando estemos listos lo envio
#password en blanco
username="N3zdNpCdeLCdoxutgNYX"
password=""
if username !="":
   pass
client.username_pw_set(username, password)
client.connect(broker,port)
while not client.connected_flag:
   client.loop()
   time.sleep(1)
time.sleep(1)

#esta funcion es solo de parseo para el archivo
def time_pre_analysis(data):
    first_row = str(data[0][0])
    actual_second = int(first_row[12:14])
    x = 0
    for i in data:
        timestamp = str(i[0])
        second = int(timestamp[12:14])
        if( second > actual_second):
            break
        x = x+1
    return x
#esta lee el archivo y se encarga de publicar
def read_mat_file(name):
    
    content = sc.loadmat(name)
    data = content['Data']
    desfase = time_pre_analysis(data)
    ms = 100-desfase
    counter = 0

    for i in data:
        counter=counter+1
        timestamp = str(i[0])
        fechayhora = timestamp[0:14]
        if(ms < 10):
            tiempomedicion = int(fechayhora+'0'+str(ms))
        else:
            tiempomedicion = int(fechayhora+str(ms))
        ms = ms+1
        if(ms >= 100):
            ms = 0

        randoms = randrange(15,35)
        humedad = randrange(40,99)
        velocidad = randrange(5,20)
        tiempofalso = int(round(time.time()*1000))

        # aca es necesario estructurar el mensaje igual que como esta aqui, requisito de la api
        # si no tiene timestamp no funciona!
        mensaje = {
            "AC1": [{
                "ts": tiempofalso,
                "values": {
                    "dato": i[1]
                }
            }],
            "AC2": [{
                "ts": tiempofalso,
                "values": {
                    "dato": i[2]
                }
            }],
            "AC3": [{
                "ts": tiempofalso,
                "values": {
                    "dato": i[3]
                }
            }],
            "AC4": [{
                "ts": tiempofalso,
                "values": {
                    "dato": i[4]
                }
            }],
            "Weather Station": [{
                "ts": tiempofalso,
                "values": {
                    "temperatura": randoms,
                    "humedad": humedad,
                    "velocidad": velocidad
                }
            }]
        }
        #se hace json y se publica al topic de telemetria
        data_out = json.dumps(mensaje)
        print("Mensaje= ",data_out)
        ret = client.publish(topic,data_out,0)
        time.sleep(1)
        client.loop()

#Se crean los JSON
ac1 = json.dumps({"device":"AC1"})
ac2 = json.dumps({"device":"AC2"})
ac3 = json.dumps({"device":"AC3"})
ac4 = json.dumps({"device":"AC4"})
wst = json.dumps({"device":"Weather Station"})

#Se publican los JSON al topic connect, todo esto antes de empezar a publicar
ret = client.publish(devices,ac1,0)
ret = client.publish(devices,ac2,0)
ret = client.publish(devices,ac3,0)
ret = client.publish(devices,ac4,0)
ret = client.publish(devices,wst,0)

#Aca esta el loop que llama a la funcion que se encarga de todo, toma como entrada el archivo.mat
while(1):
    read_mat_file('d_08_1_1_1.mat')
client.disconnect()