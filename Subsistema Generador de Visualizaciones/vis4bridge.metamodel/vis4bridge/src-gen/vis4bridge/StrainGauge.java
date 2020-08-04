/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strain Gauge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.StrainGauge#isVolt <em>Volt</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getStrainGauge()
 * @model
 * @generated
 */
public interface StrainGauge extends BasicSensor {
	/**
	 * Returns the value of the '<em><b>Volt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volt</em>' attribute.
	 * @see #setVolt(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getStrainGauge_Volt()
	 * @model
	 * @generated
	 */
	boolean isVolt();

	/**
	 * Sets the value of the '{@link vis4bridge.StrainGauge#isVolt <em>Volt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volt</em>' attribute.
	 * @see #isVolt()
	 * @generated
	 */
	void setVolt(boolean value);

} // StrainGauge
