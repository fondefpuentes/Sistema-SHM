/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representa un acelerómetro de 3 ejes. (si se quiere representar un accelerometro de 1 o 2 ejes solo omita las coordenadas correspondientes).
 * 
 * x: Indica que se considerarán los datos del eje x.
 * y: Indica que se considerarán los datos del eje y.
 * z: Indica que se considerarán los datos del eje z.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.BasicSensor#getGraph <em>Graph</em>}</li>
 *   <li>{@link vis4bridge.BasicSensor#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getBasicSensor()
 * @model abstract="true"
 * @generated
 */
public interface BasicSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference list.
	 * The list contents are of type {@link vis4bridge.Graph}.
	 * It is bidirectional and its opposite is '{@link vis4bridge.Graph#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference list.
	 * @see vis4bridge.Vis4bridgePackage#getBasicSensor_Graph()
	 * @see vis4bridge.Graph#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<Graph> getGraph();

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference list.
	 * The list contents are of type {@link vis4bridge.Card}.
	 * It is bidirectional and its opposite is '{@link vis4bridge.Card#getBasicsensor <em>Basicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference list.
	 * @see vis4bridge.Vis4bridgePackage#getBasicSensor_Card()
	 * @see vis4bridge.Card#getBasicsensor
	 * @model opposite="basicsensor"
	 * @generated
	 */
	EList<Card> getCard();

} // BasicSensor
