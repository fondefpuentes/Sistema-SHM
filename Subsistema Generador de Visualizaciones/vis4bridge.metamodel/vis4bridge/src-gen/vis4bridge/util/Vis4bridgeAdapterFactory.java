/**
 */
package vis4bridge.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vis4bridge.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgePackage
 * @generated
 */
public class Vis4bridgeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Vis4bridgePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridgeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Vis4bridgePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vis4bridgeSwitch<Adapter> modelSwitch = new Vis4bridgeSwitch<Adapter>() {
		@Override
		public Adapter caseVis4bridge(Vis4bridge object) {
			return createVis4bridgeAdapter();
		}

		@Override
		public Adapter caseVisualization(Visualization object) {
			return createVisualizationAdapter();
		}

		@Override
		public Adapter caseBasicSensor(BasicSensor object) {
			return createBasicSensorAdapter();
		}

		@Override
		public Adapter caseTriAxisAccelerometer(TriAxisAccelerometer object) {
			return createTriAxisAccelerometerAdapter();
		}

		@Override
		public Adapter caseTemperature(Temperature object) {
			return createTemperatureAdapter();
		}

		@Override
		public Adapter caseLineChart(LineChart object) {
			return createLineChartAdapter();
		}

		@Override
		public Adapter caseAreaChart(AreaChart object) {
			return createAreaChartAdapter();
		}

		@Override
		public Adapter caseView(View object) {
			return createViewAdapter();
		}

		@Override
		public Adapter caseHistogram(Histogram object) {
			return createHistogramAdapter();
		}

		@Override
		public Adapter caseScatter(Scatter object) {
			return createScatterAdapter();
		}

		@Override
		public Adapter caseGraph(Graph object) {
			return createGraphAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseWeatherStation(WeatherStation object) {
			return createWeatherStationAdapter();
		}

		@Override
		public Adapter caseStrainGauge(StrainGauge object) {
			return createStrainGaugeAdapter();
		}

		@Override
		public Adapter caseCard(Card object) {
			return createCardAdapter();
		}

		@Override
		public Adapter caseDate(Date object) {
			return createDateAdapter();
		}

		@Override
		public Adapter caseFFT(FFT object) {
			return createFFTAdapter();
		}

		@Override
		public Adapter caseFilter(Filter object) {
			return createFilterAdapter();
		}

		@Override
		public Adapter caseCompoundSensor(CompoundSensor object) {
			return createCompoundSensorAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseDAQ(DAQ object) {
			return createDAQAdapter();
		}

		@Override
		public Adapter caseLDVT(LDVT object) {
			return createLDVTAdapter();
		}

		@Override
		public Adapter caseInclinometer(Inclinometer object) {
			return createInclinometerAdapter();
		}

		@Override
		public Adapter caseBoxPlot(BoxPlot object) {
			return createBoxPlotAdapter();
		}

		@Override
		public Adapter caseOHLC(OHLC object) {
			return createOHLCAdapter();
		}

		@Override
		public Adapter caseUserGroup(UserGroup object) {
			return createUserGroupAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Vis4bridge <em>Vis4bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Vis4bridge
	 * @generated
	 */
	public Adapter createVis4bridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.BasicSensor <em>Basic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.BasicSensor
	 * @generated
	 */
	public Adapter createBasicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.TriAxisAccelerometer <em>Tri Axis Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.TriAxisAccelerometer
	 * @generated
	 */
	public Adapter createTriAxisAccelerometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Temperature
	 * @generated
	 */
	public Adapter createTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.LineChart <em>Line Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.LineChart
	 * @generated
	 */
	public Adapter createLineChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.AreaChart <em>Area Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.AreaChart
	 * @generated
	 */
	public Adapter createAreaChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Histogram
	 * @generated
	 */
	public Adapter createHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Scatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Scatter
	 * @generated
	 */
	public Adapter createScatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.WeatherStation <em>Weather Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.WeatherStation
	 * @generated
	 */
	public Adapter createWeatherStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.StrainGauge <em>Strain Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.StrainGauge
	 * @generated
	 */
	public Adapter createStrainGaugeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.DAQ <em>DAQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.DAQ
	 * @generated
	 */
	public Adapter createDAQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.LDVT <em>LDVT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.LDVT
	 * @generated
	 */
	public Adapter createLDVTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Inclinometer <em>Inclinometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Inclinometer
	 * @generated
	 */
	public Adapter createInclinometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.BoxPlot <em>Box Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.BoxPlot
	 * @generated
	 */
	public Adapter createBoxPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.OHLC <em>OHLC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.OHLC
	 * @generated
	 */
	public Adapter createOHLCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.UserGroup
	 * @generated
	 */
	public Adapter createUserGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.FFT <em>FFT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.FFT
	 * @generated
	 */
	public Adapter createFFTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vis4bridge.CompoundSensor <em>Compound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vis4bridge.CompoundSensor
	 * @generated
	 */
	public Adapter createCompoundSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Vis4bridgeAdapterFactory
