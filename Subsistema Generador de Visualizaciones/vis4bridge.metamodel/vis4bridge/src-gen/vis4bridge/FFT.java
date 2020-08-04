/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FFT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.FFT#isLowPass <em>Low Pass</em>}</li>
 *   <li>{@link vis4bridge.FFT#isHighPass <em>High Pass</em>}</li>
 *   <li>{@link vis4bridge.FFT#isBandPass <em>Band Pass</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getFFT()
 * @model
 * @generated
 */
public interface FFT extends Filter {
	/**
	 * Returns the value of the '<em><b>Low Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Pass</em>' attribute.
	 * @see #setLowPass(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getFFT_LowPass()
	 * @model
	 * @generated
	 */
	boolean isLowPass();

	/**
	 * Sets the value of the '{@link vis4bridge.FFT#isLowPass <em>Low Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Pass</em>' attribute.
	 * @see #isLowPass()
	 * @generated
	 */
	void setLowPass(boolean value);

	/**
	 * Returns the value of the '<em><b>High Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Pass</em>' attribute.
	 * @see #setHighPass(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getFFT_HighPass()
	 * @model
	 * @generated
	 */
	boolean isHighPass();

	/**
	 * Sets the value of the '{@link vis4bridge.FFT#isHighPass <em>High Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Pass</em>' attribute.
	 * @see #isHighPass()
	 * @generated
	 */
	void setHighPass(boolean value);

	/**
	 * Returns the value of the '<em><b>Band Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Pass</em>' attribute.
	 * @see #setBandPass(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getFFT_BandPass()
	 * @model
	 * @generated
	 */
	boolean isBandPass();

	/**
	 * Sets the value of the '{@link vis4bridge.FFT#isBandPass <em>Band Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band Pass</em>' attribute.
	 * @see #isBandPass()
	 * @generated
	 */
	void setBandPass(boolean value);

} // FFT
