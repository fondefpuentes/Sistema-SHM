/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vis4bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Vis4bridge es la clase raíz del meta-modelo, esta clase está compuesta por los principales elementos del modelos. Los elementos estan divididos en dos grandes grupos.
 * 
 * Por un lado están los elementos que entregan información, como sensores, estación del clima u otros grupos de sensores. Por otro lado, están los elementos visuales que serán generados a partir de esta información. Dentro de los elementos visuales se encuentran las vistas (view), los graficos (Graph aka chart)  tablas y tarjetas.
 * 
 * Esta clase contiene un atributo llamado name, que es el nombre de la app. Este nombre es definido mediante la herramienta gráfica y dependerá del contexto de la transformación. ( De momento el nombre dado en sirius es  'app.py') 
 * 
 * Todas las clases poseen un atributo llamado name. este atributo es utilizado por sirius para dar un nombre por defecto a la etiqueda de las clases.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.Vis4bridge#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.Vis4bridge#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link vis4bridge.Vis4bridge#getView <em>View</em>}</li>
 *   <li>{@link vis4bridge.Vis4bridge#getSensor <em>Sensor</em>}</li>
 *   <li>{@link vis4bridge.Vis4bridge#getDaq <em>Daq</em>}</li>
 *   <li>{@link vis4bridge.Vis4bridge#getUsergroup <em>Usergroup</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getVis4bridge()
 * @model
 * @generated
 */
public interface Vis4bridge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vis4bridge.Vis4bridge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Daq</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.DAQ}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daq</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daq</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_Daq()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAQ> getDaq();

	/**
	 * Returns the value of the '<em><b>Usergroup</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.UserGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usergroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usergroup</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_Usergroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserGroup> getUsergroup();

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Visualization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_Visualization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visualization> getVisualization();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getVis4bridge_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getView();

} // Vis4bridge
