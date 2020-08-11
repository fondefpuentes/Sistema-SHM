/**
 */
package vis4bridge;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgePackage
 * @generated
 */
public interface Vis4bridgeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Vis4bridgeFactory eINSTANCE = vis4bridge.impl.Vis4bridgeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vis4bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vis4bridge</em>'.
	 * @generated
	 */
	Vis4bridge createVis4bridge();

	/**
	 * Returns a new object of class '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization</em>'.
	 * @generated
	 */
	Visualization createVisualization();

	/**
	 * Returns a new object of class '<em>Tri Axis Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tri Axis Accelerometer</em>'.
	 * @generated
	 */
	TriAxisAccelerometer createTriAxisAccelerometer();

	/**
	 * Returns a new object of class '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature</em>'.
	 * @generated
	 */
	Temperature createTemperature();

	/**
	 * Returns a new object of class '<em>Line Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Chart</em>'.
	 * @generated
	 */
	LineChart createLineChart();

	/**
	 * Returns a new object of class '<em>Area Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Chart</em>'.
	 * @generated
	 */
	AreaChart createAreaChart();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram</em>'.
	 * @generated
	 */
	Histogram createHistogram();

	/**
	 * Returns a new object of class '<em>Scatter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter</em>'.
	 * @generated
	 */
	Scatter createScatter();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Weather Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weather Station</em>'.
	 * @generated
	 */
	WeatherStation createWeatherStation();

	/**
	 * Returns a new object of class '<em>Strain Gauge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strain Gauge</em>'.
	 * @generated
	 */
	StrainGauge createStrainGauge();

	/**
	 * Returns a new object of class '<em>DAQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAQ</em>'.
	 * @generated
	 */
	DAQ createDAQ();

	/**
	 * Returns a new object of class '<em>LDVT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDVT</em>'.
	 * @generated
	 */
	LDVT createLDVT();

	/**
	 * Returns a new object of class '<em>Inclinometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclinometer</em>'.
	 * @generated
	 */
	Inclinometer createInclinometer();

	/**
	 * Returns a new object of class '<em>Box Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box Plot</em>'.
	 * @generated
	 */
	BoxPlot createBoxPlot();

	/**
	 * Returns a new object of class '<em>OHLC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OHLC</em>'.
	 * @generated
	 */
	OHLC createOHLC();

	/**
	 * Returns a new object of class '<em>User Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Group</em>'.
	 * @generated
	 */
	UserGroup createUserGroup();

	/**
	 * Returns a new object of class '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card</em>'.
	 * @generated
	 */
	Card createCard();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>FFT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FFT</em>'.
	 * @generated
	 */
	FFT createFFT();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Vis4bridgePackage getVis4bridgePackage();

} //Vis4bridgeFactory
