/**
 */
package vis4bridge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.Histogram#getBis <em>Bis</em>}</li>
 *   <li>{@link vis4bridge.Histogram#isBisAuto <em>Bis Auto</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getHistogram()
 * @model
 * @generated
 */
public interface Histogram extends Graph {
	/**
	 * Returns the value of the '<em><b>Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bis</em>' attribute.
	 * @see #setBis(float)
	 * @see vis4bridge.Vis4bridgePackage#getHistogram_Bis()
	 * @model
	 * @generated
	 */
	float getBis();

	/**
	 * Sets the value of the '{@link vis4bridge.Histogram#getBis <em>Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bis</em>' attribute.
	 * @see #getBis()
	 * @generated
	 */
	void setBis(float value);

	/**
	 * Returns the value of the '<em><b>Bis Auto</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bis Auto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bis Auto</em>' attribute.
	 * @see #setBisAuto(boolean)
	 * @see vis4bridge.Vis4bridgePackage#getHistogram_BisAuto()
	 * @model default="true"
	 * @generated
	 */
	boolean isBisAuto();

	/**
	 * Sets the value of the '{@link vis4bridge.Histogram#isBisAuto <em>Bis Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bis Auto</em>' attribute.
	 * @see #isBisAuto()
	 * @generated
	 */
	void setBisAuto(boolean value);

} // Histogram
