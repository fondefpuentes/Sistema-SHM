/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.Graph#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.Graph#getSensor <em>Sensor</em>}</li>
 *   <li>{@link vis4bridge.Graph#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.Graph#getCategory <em>Category</em>}</li>
 *   <li>{@link vis4bridge.Graph#getUsergroup <em>Usergroup</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getGraph()
 * @model abstract="true"
 * @generated
 */
public interface Graph extends EObject {
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
	 * @see vis4bridge.Vis4bridgePackage#getGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vis4bridge.Graph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference list.
	 * The list contents are of type {@link vis4bridge.BasicSensor}.
	 * It is bidirectional and its opposite is '{@link vis4bridge.BasicSensor#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference list.
	 * @see vis4bridge.Vis4bridgePackage#getGraph_Sensor()
	 * @see vis4bridge.BasicSensor#getGraph
	 * @model opposite="graph"
	 * @generated
	 */
	EList<BasicSensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see vis4bridge.Vis4bridgePackage#getGraph_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link vis4bridge.Graph#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute list.
	 * The list contents are of type {@link vis4bridge.GraphCategory}.
	 * The literals are from the enumeration {@link vis4bridge.GraphCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute list.
	 * @see vis4bridge.GraphCategory
	 * @see vis4bridge.Vis4bridgePackage#getGraph_Category()
	 * @model
	 * @generated
	 */
	EList<GraphCategory> getCategory();

	/**
	 * Returns the value of the '<em><b>Usergroup</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vis4bridge.UserGroup#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usergroup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usergroup</em>' reference.
	 * @see #setUsergroup(UserGroup)
	 * @see vis4bridge.Vis4bridgePackage#getGraph_Usergroup()
	 * @see vis4bridge.UserGroup#getGraph
	 * @model opposite="graph"
	 * @generated
	 */
	UserGroup getUsergroup();

	/**
	 * Sets the value of the '{@link vis4bridge.Graph#getUsergroup <em>Usergroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usergroup</em>' reference.
	 * @see #getUsergroup()
	 * @generated
	 */
	void setUsergroup(UserGroup value);

} // Graph
