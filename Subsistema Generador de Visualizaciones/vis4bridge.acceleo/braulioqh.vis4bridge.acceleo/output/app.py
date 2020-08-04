    # -*- coding: utf-8 -*-
# ---------- Libraries --------------
# base library for dash
import dash
import dash_core_components as dcc #contains base dash components
import dash_html_components as html #Contains the html tags
import plotly.express as px
import plotly.graph_objs as go
import pandas as pd #For data management
from dash.dependencies import Input, Output #For callbacks
import numpy as np #For data processing. ex: To pass data from matlab to pandas
from scipy.io import loadmat as lm #To load matlab data
import calendar #For handling dates
import psycopg2 #For connection to the database
import psycopg2.extras
import getpass #For entering passwords


# ---------- EXTERNAL CSS --------------
# external css
external_stylesheets = ['https://codepen.io/chriddyp/pen/bWLwgP.css']

#------------ LOADING DATA-------------
#The data that will be processed with pandas is loaded
#mat = lm('/home/braulio/Documentos/workspace/python/pruebasDash/d_08_2_1_1.mat')
#df = pd.DataFrame(np.stack((mat['Data'])))
#df['time']= pd.to_datetime(df['time'], format='%Y%m%d%H%M%S')

# connection to the database

pw = getpass.getpass();
# establish connection
conn = psycopg2.connect(dbname='tutorial', user='postgres', password=pw, host='localhost')

# cursor object allows querying of database
# server-side cursor is created to prevent records to be downloaded until explicitly fetched
cursor_datasetBridge = conn.cursor('datasetBridge', cursor_factory=psycopg2.extras.DictCursor)
cursor_datasetBridge.execute("SELECT * FROM datasetPuente WHERE time BETWEEN '2008-03-31 23:00' and '2008-03-31 23:59'")

# fetch records from database
ride_length_datasetBridge = cursor_datasetBridge.fetchall()

df = pd.DataFrame(np.array(ride_length_datasetBridge),
 columns = ['time', 'sensor_01','sensor_02','sensor_03','sensor_04','sensor_05','sensor_06','sensor_07','sensor_08','sensor_09','sensor_10','sensor_11','sensor_12','sensor_13','sensor_14','sensor_15','sensor_16'])


daterange = pd.date_range(start=df['time'].min(),end=df['time'].max(),freq='T')
sensor=list(df)[1:]
time_zone = 'Etc/GMT+4'

#------------- INIT APP ----------------
# The app is initialized
app = dash.Dash(__name__, external_stylesheets=external_stylesheets)

#---------- LOCAL FUNCTIONS ------------
#general functions
def unixTimeMillis(dt):
    ''' Convert datetime to unix timestamp '''
    return calendar.timegm(dt.timetuple())

def unixToDatetime(unix):
    ''' Convert unix timestamp to datetime. '''
    return pd.to_datetime(unix,unit='s',origin='unix')

def getMarks(start, end, Nth=100):
    ''' Returns the marks for labeling.
        Every Nth value will be used.
    '''

    result = {}
    for i, date in enumerate(daterange):
        if(i%Nth == 1):
            # Append value to dict
            result[unixTimeMillis(date)] = str(date.strftime('%Y-%m-%d'))

    return result

# The component tree is defined using app.layout
app.layout = html.Div(children=[
    html.H1(children='Bridge DashBoard'),

    #A Div is generated for each view
    html.Div([
        html.H2(children='''
            Accelerometer
        '''),
        html.Div([
        
        #A div is generated for the card card-1(contains the card and associated widget)
                html.Div([
            #            html.Div([
                            # A Div is generated for the selection of sensors
                            html.Div([
                                #Se genera un Dropdown por cada sensor
                                html.Div([
                                    dcc.Dropdown(
                                    id='dropdown-card-1',
                                    options=[{'label':str(i),'value': i} for i in sensor],
                                    value='sensor_01'
                                    ),
                                ],
                                id='div-sensor-card-1',
                                className='sensor'),
                            ],
                            id='div-group-card-1',
                            className='group'),
                            html.Div([
                                html.H3(['MAX']),
                                html.P(['']),
                            ],id='card-1',className='card'),
            #            ],className='Card'),
                ],
                className='column',
                id='div-card-1'),
        
        #A div is generated for the card card-2(contains the card and associated widget)
                html.Div([
            #            html.Div([
                            # A Div is generated for the selection of sensors
                            html.Div([
                                #Se genera un Dropdown por cada sensor
                                html.Div([
                                    dcc.Dropdown(
                                    id='dropdown-card-2',
                                    options=[{'label':str(i),'value': i} for i in sensor],
                                    value='sensor_01'
                                    ),
                                ],
                                id='div-sensor-card-2',
                                className='sensor'),
                            ],
                            id='div-group-card-2',
                            className='group'),
                            html.Div([
                                html.H3(['MIN']),
                                html.P(['']),
                            ],id='card-2',className='card'),
            #            ],className='Card'),
                ],
                className='column',
                id='div-card-2'),
        
        #A div is generated for the card card-3(contains the card and associated widget)
                html.Div([
            #            html.Div([
                            # A Div is generated for the selection of sensors
                            html.Div([
                                #Se genera un Dropdown por cada sensor
                                html.Div([
                                    dcc.Dropdown(
                                    id='dropdown-card-3',
                                    options=[{'label':str(i),'value': i} for i in sensor],
                                    value='sensor_01'
                                    ),
                                ],
                                id='div-sensor-card-3',
                                className='sensor'),
                            ],
                            id='div-group-card-3',
                            className='group'),
                            html.Div([
                                html.H3(['AVERAGE']),
                                html.P(['']),
                            ],id='card-3',className='card'),
            #            ],className='Card'),
                ],
                className='column',
                id='div-card-3'),
        
        #A div is generated for the card card-7(contains the card and associated widget)
                html.Div([
            #            html.Div([
                            # A Div is generated for the selection of sensors
                            html.Div([
                                #Se genera un Dropdown por cada sensor
                                html.Div([
                                    dcc.Dropdown(
                                    id='dropdown-card-7',
                                    options=[{'label':str(i),'value': i} for i in sensor],
                                    value='sensor_01'
                                    ),
                                ],
                                id='div-sensor-card-7',
                                className='sensor'),
                            ],
                            id='div-group-card-7',
                            className='group'),
                            html.Div([
                                html.H3(['AVERAGE']),
                                html.P(['']),
                            ],id='card-7',className='card'),
            #            ],className='Card'),
                ],
                className='column',
                id='div-card-7'),
        ],
        className='view-card row',
        id='card-view-14'),

        html.Div([
        
        #A div is generated for the chart histogram-18(contains the chart and associated widget)
                html.Div([
                                # A Div is generated for the selection of sensors
                                html.Div([
                                    #Se genera un Dropdown por cada sensor
                                    html.Div([
                                        dcc.Dropdown(
                                        id='dropdown-accelerometer-26',
                                        options=[{'label':str(i),'value': i} for i in sensor],
                                        value='sensor_01'
                                        ),
                                    ],
                                    id='div-accelerometer-26',
                                    className='sensor'),
                                    #Se genera un Dropdown por cada sensor
                                    html.Div([
                                        dcc.Dropdown(
                                        id='dropdown-accelerometer-27',
                                        options=[{'label':str(i),'value': i} for i in sensor],
                                        value='sensor_02'
                                        ),
                                    ],
                                    id='div-accelerometer-27',
                                    className='sensor'),
                                ],
                                id='div-group-25',
                                className='group'),
                    
                        html.Div([
                            html.Div([
                                dcc.Slider(
                                    id='bin-slider-histogram-18',
                                    min=1,
                                    max=40,
                                    step=1,
                                    value=12,
                                    updatemode='drag',
                                    marks={
                                        10:{'label': '10'},
                                        20:{'label': '20'},
                                        30:{'label': '30'},
                                        40:{'label': '40'},
                                    },
                                ),
                            ]),
                            html.Div([
                                dcc.Checklist(
                                    id='bin-auto-histogram-18',
                                    options=[
                                        {'label':'Auto','value':'Auto'}
                                    ],
                                    value=['Auto'],
                                    inputClassName='auto__checkbox',
                                    labelClassName='auto__label',
                                ),
                                html.P(
                                        '# of Bins: Auto',
                                        id='bin-size-histogram-18',
                                        className='auto__p',
                                        ),
                            ],style={'display':'inline'}),
                            html.Div([
                                dcc.Graph(
                                    id='histogram-18',
                                    config=dict(responsive=False),
                                ),
                                dcc.RangeSlider(
                                                count=1,
                                                min = unixTimeMillis(daterange.min()),#unix_time_millis(time.min()),
                                                max = unixTimeMillis(daterange.max()),#unix_time_millis(time.max()),
                                                value=[unixTimeMillis(daterange.min()),unixTimeMillis(daterange.max())],
                                                marks=getMarks(daterange.min(),daterange.max()),
                                                id='rangeSlider-histogram-18'
                                            ),
                            ]),
                        ],className='Div-slider',
                        style={'display':'block'}),
                ],
                className='Histogram graph',
                id='div-histogram-18'),
        
        #A div is generated for the chart lineChart-6(contains the chart and associated widget)
                html.Div([
                                # A Div is generated for the selection of sensors
                                html.Div([
                                    #Se genera un Dropdown por cada sensor
                                    html.Div([
                                        dcc.Dropdown(
                                        id='dropdown-accelerometer-3',
                                        options=[{'label':str(i),'value': i} for i in sensor],
                                        value='sensor_01'
                                        ),
                                    ],
                                    id='div-accelerometer-3',
                                    className='sensor'),
                                    #Se genera un Dropdown por cada sensor
                                    html.Div([
                                        dcc.Dropdown(
                                        id='dropdown-accelerometer-4',
                                        options=[{'label':str(i),'value': i} for i in sensor],
                                        value='sensor_02'
                                        ),
                                    ],
                                    id='div-accelerometer-4',
                                    className='sensor'),
                                ],
                                id='div-group-2',
                                className='group'),
                    
                    # Div to generate chart and range selection bar
                    html.Div([
                        dcc.Graph(
                            id='lineChart-6',
                            config=dict(responsive=False),
                        ),
                        dcc.RangeSlider(
                            count=1,
                            min = unixTimeMillis(daterange.min()),#unix_time_millis(time.min()),
                            max = unixTimeMillis(daterange.max()),#unix_time_millis(time.max()),
                            value=[unixTimeMillis(daterange.min()),unixTimeMillis(daterange.max())],
                            marks=getMarks(daterange.min(),daterange.max()),
                            id='rangeSlider-lineChart-6'
                        ),
                    ]),
                ],
                className='LineChart graph',
                id='div-lineChart-6'),
        ],
        className='view-graph',
        id='graph-view-14'),
    ],
    className='view',
    id='div-view-14'),
],
id='visualization')


@app.callback(
    Output(component_id='card-1',component_property='children'),
    [
     Input(component_id='dropdown-card-1', component_property='value')
    ]
)
def update_card(_sensor_card_1):
    #mask=(df['time']>= unixToDatetime(df['time'].min().tz_localize(time_zone)) & (df['time']<=unixToDatetime(df['time'].max().tz_localize(time_zone)))
    mask=(df['time']>=df['time'].min())& (df['time']<=df['time'].max())
    myData=df.loc[mask]
    xaxis=myData['time']
    y1axis=myData[_sensor_card_1]
    my_max=max(myData[_sensor_card_1])
    return [
        html.H3('MAX'),
        html.P(my_max),
    ]



@app.callback(
    Output(component_id='card-2',component_property='children'),
    [
     Input(component_id='dropdown-card-2', component_property='value')
    ]
)
def update_card(_sensor_card_2):
    #mask=(df['time']>= unixToDatetime(df['time'].min().tz_localize(time_zone)) & (df['time']<=unixToDatetime(df['time'].max().tz_localize(time_zone)))
    mask=(df['time']>=df['time'].min())& (df['time']<=df['time'].max())
    myData=df.loc[mask]
    xaxis=myData['time']
    y1axis=myData[_sensor_card_2]
    my_min=min(myData[_sensor_card_2])
    return [
        html.H3('MIN'),
        html.P(my_min),
    ]



@app.callback(
    Output(component_id='card-3',component_property='children'),
    [
     Input(component_id='dropdown-card-3', component_property='value')
    ]
)
def update_card(_sensor_card_3):
    #mask=(df['time']>= unixToDatetime(df['time'].min().tz_localize(time_zone)) & (df['time']<=unixToDatetime(df['time'].max().tz_localize(time_zone)))
    mask=(df['time']>=df['time'].min())& (df['time']<=df['time'].max())
    myData=df.loc[mask]
    xaxis=myData['time']
    y1axis=myData[_sensor_card_3]
    my_average=myData[_sensor_card_3].mean()
    return [
        html.H3('MEAN'),
        html.P(my_average),
    ]



@app.callback(
    Output(component_id='card-7',component_property='children'),
    [
     Input(component_id='dropdown-card-7', component_property='value')
    ]
)
def update_card(_sensor_card_7):
    #mask=(df['time']>= unixToDatetime(df['time'].min().tz_localize(time_zone)) & (df['time']<=unixToDatetime(df['time'].max().tz_localize(time_zone)))
    mask=(df['time']>=df['time'].min())& (df['time']<=df['time'].max())
    myData=df.loc[mask]
    xaxis=myData['time']
    y1axis=myData[_sensor_card_7]
    my_average=myData[_sensor_card_7].mean()
    return [
        html.H3('MEAN'),
        html.P(my_average),
    ]


@app.callback(
    Output(component_id='histogram-18', component_property='figure'),
    [
     Input(component_id='dropdown-accelerometer-26', component_property='value'),
     Input(component_id='dropdown-accelerometer-27', component_property='value'),
     Input(component_id='rangeSlider-histogram-18', component_property='value'),
     Input(component_id='bin-slider-histogram-18', component_property='value'),
     Input(component_id='bin-auto-histogram-18', component_property='value'),]
)
def update_graph(_accelerometer_26,_accelerometer_27,_histogram_18,bin_value,auto_state):

    mask=(df['time']>=unixToDatetime(_histogram_18[0]).tz_localize(time_zone)) & (df['time']<=unixToDatetime(_histogram_18[1]).tz_localize(time_zone))
    myData=df.loc[mask]

    xaxis=myData['time']
    y1axis=myData[_accelerometer_26]
    if "Auto" in auto_state:
        hist1,bins1=np.histogram(myData[_accelerometer_26],range(int(round(min(myData[_accelerometer_26]))), int(round(max(myData[_accelerometer_26])))))
    else:
        hist1,bins1=np.histogram(myData[_accelerometer_26], bins=bin_value)

    y2axis=myData[_accelerometer_27]
    if "Auto" in auto_state:
        hist2,bins2=np.histogram(myData[_accelerometer_27],range(int(round(min(myData[_accelerometer_27]))), int(round(max(myData[_accelerometer_27])))))
    else:
        hist2,bins2=np.histogram(myData[_accelerometer_27], bins=bin_value)


    return dict(
        data=[
            dict(
                x=bins1,
                y=hist1,
                name=str(_accelerometer_26),
                type='bar',
            ),
            dict(
                x=bins2,
                y=hist2,
                name=str(_accelerometer_27),
                type='bar',
            ),
        ],
        layout=dict(
            title='Histogram1',
            barmode='stack',
            showlegend=True,
            legend=dict(
                x=0,
                y=1.0
            ),
            margin=dict(l=40, r=0, t=40, b=30),
            transition = {'duration': 500},
        )
    )



@app.callback(
    Output(component_id='lineChart-6', component_property='figure'),
    [
     Input(component_id='dropdown-accelerometer-3', component_property='value'),
     Input(component_id='dropdown-accelerometer-4', component_property='value'),
     Input(component_id='rangeSlider-lineChart-6', component_property='value')]
)
def update_grahp( _accelerometer_3,_accelerometer_4,_lineChart_6):

    mask=(df['time']>=unixToDatetime(_lineChart_6[0]).tz_localize(time_zone)) & (df['time']<=unixToDatetime(_lineChart_6[1]).tz_localize(time_zone))
    myData=df.loc[mask]
    xaxis=myData['time']
    y1axis=myData[_accelerometer_3]
    y2axis=myData[_accelerometer_4]
    return dict(
    data=[
        dict(
            x=xaxis,
            y=y1axis,
            name=str(_accelerometer_3),
            type='line',
        ),
        dict(
            x=xaxis,
            y=y2axis,
            name=str(_accelerometer_4),
            type='line',
        ),
    ],
    layout=dict(
        title='LineChart1',
        showlegend=True,
        legend=dict(
            x=0,
            y=1.0
        ),
        margin=dict(l=40, r=0, t=40, b=30),
        transition = {'duration': 500},
    )
)





# Allows to run the application
if __name__ == '__main__':
    app.run_server(debug=True)
