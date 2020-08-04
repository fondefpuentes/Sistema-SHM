/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDVT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.LDVT#isData <em>Data</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getLDVT()
 * @model
 * @generated
 */
public interface LDVT extends BasicSensor {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getLDVT_Data()
	 * @model
	 * @generated
	 */
	boolean isData();

	/**
	 * Sets the value of the '{@link vis4bridge.LDVT#isData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #isData()
	 * @generated
	 */
	void setData(boolean value);

} // LDVT
