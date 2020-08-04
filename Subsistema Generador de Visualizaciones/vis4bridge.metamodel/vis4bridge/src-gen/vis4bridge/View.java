/**
 */
package vis4bridge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.View#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.View#getGraph <em>Graph</em>}</li>
 *   <li>{@link vis4bridge.View#getTable <em>Table</em>}</li>
 *   <li>{@link vis4bridge.View#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.View#getCard <em>Card</em>}</li>
 *   <li>{@link vis4bridge.View#getFilter <em>Filter</em>}</li>
 *   <li>{@link vis4bridge.View#getCompoundsensor <em>Compoundsensor</em>}</li>
 *   <li>{@link vis4bridge.View#getTimeRange <em>Time Range</em>}</li>
 * </ul>
 *
 * @see vis4bridge.Vis4bridgePackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vis4bridge es la clase raíz del metamodelo.
	 * Esta clase esta compuesta por los elementos del dominio.
	 * Por una parte se encuentran los sensores (sensors conectados al puente y grupos de sensores. Por otro lado, se encuentran 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vis4bridge.Vis4bridgePackage#getView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vis4bridge.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Graph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getView_Graph()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graph> getGraph();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getView_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

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
	 * @see vis4bridge.Vis4bridgePackage#getView_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link vis4bridge.View#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getView_Card()
	 * @model containment="true"
	 * @generated
	 */
	EList<Card> getCard();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link vis4bridge.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see vis4bridge.Vis4bridgePackage#getView_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilter();

	/**
	 * Returns the value of the '<em><b>Compoundsensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vis4bridge.CompoundSensor#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compoundsensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compoundsensor</em>' reference.
	 * @see #setCompoundsensor(CompoundSensor)
	 * @see vis4bridge.Vis4bridgePackage#getView_Compoundsensor()
	 * @see vis4bridge.CompoundSensor#getView
	 * @model opposite="view"
	 * @generated
	 */
	CompoundSensor getCompoundsensor();

	/**
	 * Sets the value of the '{@link vis4bridge.View#getCompoundsensor <em>Compoundsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compoundsensor</em>' reference.
	 * @see #getCompoundsensor()
	 * @generated
	 */
	void setCompoundsensor(CompoundSensor value);

	/**
	 * Returns the value of the '<em><b>Time Range</b></em>' attribute.
	 * The literals are from the enumeration {@link vis4bridge.TimeRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Range</em>' attribute.
	 * @see vis4bridge.TimeRange
	 * @see #setTimeRange(TimeRange)
	 * @see vis4bridge.Vis4bridgePackage#getView_TimeRange()
	 * @model
	 * @generated
	 */
	TimeRange getTimeRange();

	/**
	 * Sets the value of the '{@link vis4bridge.View#getTimeRange <em>Time Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Range</em>' attribute.
	 * @see vis4bridge.TimeRange
	 * @see #getTimeRange()
	 * @generated
	 */
	void setTimeRange(TimeRange value);

} // View
