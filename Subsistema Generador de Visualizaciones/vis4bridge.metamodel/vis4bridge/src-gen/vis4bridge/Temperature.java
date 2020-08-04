/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.Temperature#getModel <em>Model</em>}</li>
 *   <li>{@link vis4bridge.Temperature#isTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getTemperature()
 * @model
 * @generated
 */
public interface Temperature extends BasicSensor {
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
	 * @see vis4bridge.Vis4bridgePackage#getTemperature_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link vis4bridge.Temperature#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getTemperature_Temperature()
	 * @model
	 * @generated
	 */
	boolean isTemperature();

	/**
	 * Sets the value of the '{@link vis4bridge.Temperature#isTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #isTemperature()
	 * @generated
	 */
	void setTemperature(boolean value);

} // Temperature
