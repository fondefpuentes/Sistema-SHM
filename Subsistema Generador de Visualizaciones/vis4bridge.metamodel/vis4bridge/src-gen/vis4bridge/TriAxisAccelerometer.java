/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tri Axis Accelerometer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TriAxisAccelerometer representa un acelerometro de 3 ejes, también puede usarse para representar un acelerometro de 1 o 2 ejes.
 * x: Indica que se considerarán los datos del eje x.
 * y: Indica que se considerarán los datos del eje y.
 * z: Indica que se considerarán los datos del eje z.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.TriAxisAccelerometer#getModel <em>Model</em>}</li>
 *   <li>{@link vis4bridge.TriAxisAccelerometer#isX <em>X</em>}</li>
 *   <li>{@link vis4bridge.TriAxisAccelerometer#isY <em>Y</em>}</li>
 *   <li>{@link vis4bridge.TriAxisAccelerometer#isZ <em>Z</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getTriAxisAccelerometer()
 * @model
 * @generated
 */
public interface TriAxisAccelerometer extends BasicSensor {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see vis4bridge.Vis4bridgePackage#getTriAxisAccelerometer_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link vis4bridge.TriAxisAccelerometer#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getTriAxisAccelerometer_X()
	 * @model
	 * @generated
	 */
	boolean isX();

	/**
	 * Sets the value of the '{@link vis4bridge.TriAxisAccelerometer#isX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isX()
	 * @generated
	 */
	void setX(boolean value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getTriAxisAccelerometer_Y()
	 * @model
	 * @generated
	 */
	boolean isY();

	/**
	 * Sets the value of the '{@link vis4bridge.TriAxisAccelerometer#isY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isY()
	 * @generated
	 */
	void setY(boolean value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getTriAxisAccelerometer_Z()
	 * @model default="true"
	 * @generated
	 */
	boolean isZ();

	/**
	 * Sets the value of the '{@link vis4bridge.TriAxisAccelerometer#isZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #isZ()
	 * @generated
	 */
	void setZ(boolean value);

} // TriAxisAccelerometer
