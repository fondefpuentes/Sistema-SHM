/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.UserGroup#getBasicsensor <em>Basicsensor</em>}</li>
 *   <li>{@link vis4bridge.UserGroup#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.UserGroup#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.UserGroup#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getUserGroup()
 * @model
 * @generated
 */
public interface UserGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Basicsensor</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.BasicSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basicsensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basicsensor</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getUserGroup_Basicsensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicSensor> getBasicsensor();

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
	 * @see vis4bridge.Vis4bridgePackage#getUserGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vis4bridge.UserGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see vis4bridge.Vis4bridgePackage#getUserGroup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link vis4bridge.UserGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vis4bridge.Graph#getUsergroup <em>Usergroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see vis4bridge.Vis4bridgePackage#getUserGroup_Graph()
	 * @see vis4bridge.Graph#getUsergroup
	 * @model opposite="usergroup"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link vis4bridge.UserGroup#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

} // UserGroup
