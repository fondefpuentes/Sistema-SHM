/**
 */
package vis4bridge.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import vis4bridge.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgePackage
 * @generated
 */
public class Vis4bridgeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Vis4bridgePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridgeSwitch() {
		if (modelPackage == null) {
			modelPackage = Vis4bridgePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Vis4bridgePackage.VIS4BRIDGE: {
			Vis4bridge vis4bridge = (Vis4bridge) theEObject;
			T result = caseVis4bridge(vis4bridge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.VISUALIZATION: {
			Visualization visualization = (Visualization) theEObject;
			T result = caseVisualization(visualization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.BASIC_SENSOR: {
			BasicSensor basicSensor = (BasicSensor) theEObject;
			T result = caseBasicSensor(basicSensor);
			if (result == null)
				result = caseSensor(basicSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER: {
			TriAxisAccelerometer triAxisAccelerometer = (TriAxisAccelerometer) theEObject;
			T result = caseTriAxisAccelerometer(triAxisAccelerometer);
			if (result == null)
				result = caseBasicSensor(triAxisAccelerometer);
			if (result == null)
				result = caseSensor(triAxisAccelerometer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.TEMPERATURE: {
			Temperature temperature = (Temperature) theEObject;
			T result = caseTemperature(temperature);
			if (result == null)
				result = caseBasicSensor(temperature);
			if (result == null)
				result = caseSensor(temperature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.LINE_CHART: {
			LineChart lineChart = (LineChart) theEObject;
			T result = caseLineChart(lineChart);
			if (result == null)
				result = caseGraph(lineChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.AREA_CHART: {
			AreaChart areaChart = (AreaChart) theEObject;
			T result = caseAreaChart(areaChart);
			if (result == null)
				result = caseGraph(areaChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.VIEW: {
			View view = (View) theEObject;
			T result = caseView(view);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.HISTOGRAM: {
			Histogram histogram = (Histogram) theEObject;
			T result = caseHistogram(histogram);
			if (result == null)
				result = caseGraph(histogram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.SCATTER: {
			Scatter scatter = (Scatter) theEObject;
			T result = caseScatter(scatter);
			if (result == null)
				result = caseGraph(scatter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.GRAPH: {
			Graph graph = (Graph) theEObject;
			T result = caseGraph(graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.WEATHER_STATION: {
			WeatherStation weatherStation = (WeatherStation) theEObject;
			T result = caseWeatherStation(weatherStation);
			if (result == null)
				result = caseCompoundSensor(weatherStation);
			if (result == null)
				result = caseSensor(weatherStation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.STRAIN_GAUGE: {
			StrainGauge strainGauge = (StrainGauge) theEObject;
			T result = caseStrainGauge(strainGauge);
			if (result == null)
				result = caseBasicSensor(strainGauge);
			if (result == null)
				result = caseSensor(strainGauge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.CARD: {
			Card card = (Card) theEObject;
			T result = caseCard(card);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.DATE: {
			Date date = (Date) theEObject;
			T result = caseDate(date);
			if (result == null)
				result = caseFilter(date);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.FFT: {
			FFT fft = (FFT) theEObject;
			T result = caseFFT(fft);
			if (result == null)
				result = caseFilter(fft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.FILTER: {
			Filter filter = (Filter) theEObject;
			T result = caseFilter(filter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.COMPOUND_SENSOR: {
			CompoundSensor compoundSensor = (CompoundSensor) theEObject;
			T result = caseCompoundSensor(compoundSensor);
			if (result == null)
				result = caseSensor(compoundSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.DAQ: {
			DAQ daq = (DAQ) theEObject;
			T result = caseDAQ(daq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.LDVT: {
			LDVT ldvt = (LDVT) theEObject;
			T result = caseLDVT(ldvt);
			if (result == null)
				result = caseBasicSensor(ldvt);
			if (result == null)
				result = caseSensor(ldvt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.INCLINOMETER: {
			Inclinometer inclinometer = (Inclinometer) theEObject;
			T result = caseInclinometer(inclinometer);
			if (result == null)
				result = caseBasicSensor(inclinometer);
			if (result == null)
				result = caseSensor(inclinometer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.BOX_PLOT: {
			BoxPlot boxPlot = (BoxPlot) theEObject;
			T result = caseBoxPlot(boxPlot);
			if (result == null)
				result = caseGraph(boxPlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.OHLC: {
			OHLC ohlc = (OHLC) theEObject;
			T result = caseOHLC(ohlc);
			if (result == null)
				result = caseGraph(ohlc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Vis4bridgePackage.USER_GROUP: {
			UserGroup userGroup = (UserGroup) theEObject;
			T result = caseUserGroup(userGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vis4bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vis4bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVis4bridge(Vis4bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualization(Visualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSensor(BasicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tri Axis Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tri Axis Accelerometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriAxisAccelerometer(TriAxisAccelerometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperature(Temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineChart(LineChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaChart(AreaChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Histogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistogram(Histogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scatter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scatter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScatter(Scatter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weather Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weather Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeatherStation(WeatherStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strain Gauge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strain Gauge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrainGauge(StrainGauge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAQ(DAQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LDVT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LDVT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDVT(LDVT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclinometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclinometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclinometer(Inclinometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoxPlot(BoxPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OHLC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OHLC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOHLC(OHLC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserGroup(UserGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FFT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FFT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFFT(FFT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundSensor(CompoundSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Vis4bridgeSwitch
