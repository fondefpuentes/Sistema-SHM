/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.CompoundSensor#getBasicsensor <em>Basicsensor</em>}</li>
 *   <li>{@link vis4bridge.CompoundSensor#getLength <em>Length</em>}</li>
 *   <li>{@link vis4bridge.CompoundSensor#getView <em>View</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getCompoundSensor()
 * @model abstract="true"
 * @generated
 */
public interface CompoundSensor extends Sensor {
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
	 * @see vis4bridge.Vis4bridgePackage#getCompoundSensor_Basicsensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicSensor> getBasicsensor();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see vis4bridge.Vis4bridgePackage#getCompoundSensor_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link vis4bridge.CompoundSensor#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vis4bridge.View#getCompoundsensor <em>Compoundsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see vis4bridge.Vis4bridgePackage#getCompoundSensor_View()
	 * @see vis4bridge.View#getCompoundsensor
	 * @model opposite="compoundsensor"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link vis4bridge.CompoundSensor#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // CompoundSensor
