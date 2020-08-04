/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.Sensors#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.Sensors#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getSensors()
 * @model abstract="true"
 * @generated
 */
public interface Sensors extends EObject {
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
	 * @see vis4bridge.Vis4bridgePackage#getSensors_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vis4bridge.Sensors#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference list.
	 * The list contents are of type {@link vis4bridge.Graph}.
	 * It is bidirectional and its opposite is '{@link vis4bridge.Graph#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference list.
	 * @see vis4bridge.Vis4bridgePackage#getSensors_Graph()
	 * @see vis4bridge.Graph#getSensors
	 * @model opposite="sensors"
	 * @generated
	 */
	EList<Graph> getGraph();

} // Sensors
