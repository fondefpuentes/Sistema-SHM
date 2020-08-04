/**
 */
package vis4bridge.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vis4bridge.AreaChart;
import vis4bridge.BasicSensor;
import vis4bridge.BoxPlot;
import vis4bridge.Card;
import vis4bridge.CardType;
import vis4bridge.CompoundSensor;
import vis4bridge.Date;
import vis4bridge.Filter;
import vis4bridge.Graph;
import vis4bridge.GraphCategory;
import vis4bridge.Histogram;
import vis4bridge.Inclinometer;
import vis4bridge.LineChart;
import vis4bridge.Scatter;
import vis4bridge.Sensor;
import vis4bridge.StrainGauge;
import vis4bridge.Table;
import vis4bridge.Temperature;
import vis4bridge.TimeRange;
import vis4bridge.TriAxisAccelerometer;
import vis4bridge.UserGroup;
import vis4bridge.View;
import vis4bridge.Vis4bridge;
import vis4bridge.Vis4bridgeFactory;
import vis4bridge.Vis4bridgePackage;
import vis4bridge.Visualization;
import vis4bridge.WeatherStation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vis4bridgePackageImpl extends EPackageImpl implements Vis4bridgePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vis4bridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triAxisAccelerometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherStationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strainGaugeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldvtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclinometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ohlcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeRangeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum graphCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vis4bridge.Vis4bridgePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Vis4bridgePackageImpl() {
		super(eNS_URI, Vis4bridgeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Vis4bridgePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Vis4bridgePackage init() {
		if (isInited)
			return (Vis4bridgePackage) EPackage.Registry.INSTANCE.getEPackage(Vis4bridgePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVis4bridgePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Vis4bridgePackageImpl theVis4bridgePackage = registeredVis4bridgePackage instanceof Vis4bridgePackageImpl
				? (Vis4bridgePackageImpl) registeredVis4bridgePackage
				: new Vis4bridgePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVis4bridgePackage.createPackageContents();

		// Initialize created meta-data
		theVis4bridgePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVis4bridgePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Vis4bridgePackage.eNS_URI, theVis4bridgePackage);
		return theVis4bridgePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVis4bridge() {
		return vis4bridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVis4bridge_Name() {
		return (EAttribute) vis4bridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVis4bridge_Visualization() {
		return (EReference) vis4bridgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVis4bridge_View() {
		return (EReference) vis4bridgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVis4bridge_Sensor() {
		return (EReference) vis4bridgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVis4bridge_Daq() {
		return (EReference) vis4bridgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVis4bridge_Usergroup() {
		return (EReference) vis4bridgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualization() {
		return visualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Name() {
		return (EAttribute) visualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSensor() {
		return basicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicSensor_Graph() {
		return (EReference) basicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicSensor_Card() {
		return (EReference) basicSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriAxisAccelerometer() {
		return triAxisAccelerometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriAxisAccelerometer_Model() {
		return (EAttribute) triAxisAccelerometerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriAxisAccelerometer_X() {
		return (EAttribute) triAxisAccelerometerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriAxisAccelerometer_Y() {
		return (EAttribute) triAxisAccelerometerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriAxisAccelerometer_Z() {
		return (EAttribute) triAxisAccelerometerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperature() {
		return temperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperature_Model() {
		return (EAttribute) temperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperature_Temperature() {
		return (EAttribute) temperatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineChart() {
		return lineChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaChart() {
		return areaChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Graph() {
		return (EReference) viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Table() {
		return (EReference) viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Id() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Card() {
		return (EReference) viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Filter() {
		return (EReference) viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Compoundsensor() {
		return (EReference) viewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_TimeRange() {
		return (EAttribute) viewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogram() {
		return histogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogram_Bis() {
		return (EAttribute) histogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogram_BisAuto() {
		return (EAttribute) histogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScatter() {
		return scatterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Name() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Sensor() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Id() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Category() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Usergroup() {
		return (EReference) graphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Id() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeatherStation() {
		return weatherStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrainGauge() {
		return strainGaugeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrainGauge_Volt() {
		return (EAttribute) strainGaugeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Name() {
		return (EAttribute) cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Id() {
		return (EAttribute) cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Type() {
		return (EAttribute) cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Basicsensor() {
		return (EReference) cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Min() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Max() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFFT() {
		return fftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFFT_LowPass() {
		return (EAttribute) fftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFFT_HighPass() {
		return (EAttribute) fftEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFFT_BandPass() {
		return (EAttribute) fftEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Name() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Id() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundSensor() {
		return compoundSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSensor_Basicsensor() {
		return (EReference) compoundSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundSensor_Length() {
		return (EAttribute) compoundSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSensor_View() {
		return (EReference) compoundSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Name() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Id() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAQ() {
		return daqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAQ_Id() {
		return (EAttribute) daqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAQ_Name() {
		return (EAttribute) daqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAQ_Sensor() {
		return (EReference) daqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDVT() {
		return ldvtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDVT_Data() {
		return (EAttribute) ldvtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclinometer() {
		return inclinometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclinometer_Data() {
		return (EAttribute) inclinometerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoxPlot() {
		return boxPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOHLC() {
		return ohlcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGroup() {
		return userGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Basicsensor() {
		return (EReference) userGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserGroup_Name() {
		return (EAttribute) userGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserGroup_Id() {
		return (EAttribute) userGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Graph() {
		return (EReference) userGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardType() {
		return cardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeRange() {
		return timeRangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGraphCategory() {
		return graphCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridgeFactory getVis4bridgeFactory() {
		return (Vis4bridgeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		vis4bridgeEClass = createEClass(VIS4BRIDGE);
		createEAttribute(vis4bridgeEClass, VIS4BRIDGE__NAME);
		createEReference(vis4bridgeEClass, VIS4BRIDGE__VISUALIZATION);
		createEReference(vis4bridgeEClass, VIS4BRIDGE__VIEW);
		createEReference(vis4bridgeEClass, VIS4BRIDGE__SENSOR);
		createEReference(vis4bridgeEClass, VIS4BRIDGE__DAQ);
		createEReference(vis4bridgeEClass, VIS4BRIDGE__USERGROUP);

		visualizationEClass = createEClass(VISUALIZATION);
		createEAttribute(visualizationEClass, VISUALIZATION__NAME);

		basicSensorEClass = createEClass(BASIC_SENSOR);
		createEReference(basicSensorEClass, BASIC_SENSOR__GRAPH);
		createEReference(basicSensorEClass, BASIC_SENSOR__CARD);

		triAxisAccelerometerEClass = createEClass(TRI_AXIS_ACCELEROMETER);
		createEAttribute(triAxisAccelerometerEClass, TRI_AXIS_ACCELEROMETER__MODEL);
		createEAttribute(triAxisAccelerometerEClass, TRI_AXIS_ACCELEROMETER__X);
		createEAttribute(triAxisAccelerometerEClass, TRI_AXIS_ACCELEROMETER__Y);
		createEAttribute(triAxisAccelerometerEClass, TRI_AXIS_ACCELEROMETER__Z);

		temperatureEClass = createEClass(TEMPERATURE);
		createEAttribute(temperatureEClass, TEMPERATURE__MODEL);
		createEAttribute(temperatureEClass, TEMPERATURE__TEMPERATURE);

		lineChartEClass = createEClass(LINE_CHART);

		areaChartEClass = createEClass(AREA_CHART);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__GRAPH);
		createEReference(viewEClass, VIEW__TABLE);
		createEAttribute(viewEClass, VIEW__ID);
		createEReference(viewEClass, VIEW__CARD);
		createEReference(viewEClass, VIEW__FILTER);
		createEReference(viewEClass, VIEW__COMPOUNDSENSOR);
		createEAttribute(viewEClass, VIEW__TIME_RANGE);

		histogramEClass = createEClass(HISTOGRAM);
		createEAttribute(histogramEClass, HISTOGRAM__BIS);
		createEAttribute(histogramEClass, HISTOGRAM__BIS_AUTO);

		scatterEClass = createEClass(SCATTER);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__NAME);
		createEReference(graphEClass, GRAPH__SENSOR);
		createEAttribute(graphEClass, GRAPH__ID);
		createEAttribute(graphEClass, GRAPH__CATEGORY);
		createEReference(graphEClass, GRAPH__USERGROUP);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEAttribute(tableEClass, TABLE__ID);

		weatherStationEClass = createEClass(WEATHER_STATION);

		strainGaugeEClass = createEClass(STRAIN_GAUGE);
		createEAttribute(strainGaugeEClass, STRAIN_GAUGE__VOLT);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__NAME);
		createEAttribute(cardEClass, CARD__ID);
		createEAttribute(cardEClass, CARD__TYPE);
		createEReference(cardEClass, CARD__BASICSENSOR);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__MIN);
		createEAttribute(dateEClass, DATE__MAX);

		fftEClass = createEClass(FFT);
		createEAttribute(fftEClass, FFT__LOW_PASS);
		createEAttribute(fftEClass, FFT__HIGH_PASS);
		createEAttribute(fftEClass, FFT__BAND_PASS);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__NAME);
		createEAttribute(filterEClass, FILTER__ID);

		compoundSensorEClass = createEClass(COMPOUND_SENSOR);
		createEReference(compoundSensorEClass, COMPOUND_SENSOR__BASICSENSOR);
		createEAttribute(compoundSensorEClass, COMPOUND_SENSOR__LENGTH);
		createEReference(compoundSensorEClass, COMPOUND_SENSOR__VIEW);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);
		createEAttribute(sensorEClass, SENSOR__ID);

		daqEClass = createEClass(DAQ);
		createEAttribute(daqEClass, DAQ__ID);
		createEAttribute(daqEClass, DAQ__NAME);
		createEReference(daqEClass, DAQ__SENSOR);

		ldvtEClass = createEClass(LDVT);
		createEAttribute(ldvtEClass, LDVT__DATA);

		inclinometerEClass = createEClass(INCLINOMETER);
		createEAttribute(inclinometerEClass, INCLINOMETER__DATA);

		boxPlotEClass = createEClass(BOX_PLOT);

		ohlcEClass = createEClass(OHLC);

		userGroupEClass = createEClass(USER_GROUP);
		createEReference(userGroupEClass, USER_GROUP__BASICSENSOR);
		createEAttribute(userGroupEClass, USER_GROUP__NAME);
		createEAttribute(userGroupEClass, USER_GROUP__ID);
		createEReference(userGroupEClass, USER_GROUP__GRAPH);

		// Create enums
		cardTypeEEnum = createEEnum(CARD_TYPE);
		timeRangeEEnum = createEEnum(TIME_RANGE);
		graphCategoryEEnum = createEEnum(GRAPH_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		basicSensorEClass.getESuperTypes().add(this.getSensor());
		triAxisAccelerometerEClass.getESuperTypes().add(this.getBasicSensor());
		temperatureEClass.getESuperTypes().add(this.getBasicSensor());
		lineChartEClass.getESuperTypes().add(this.getGraph());
		areaChartEClass.getESuperTypes().add(this.getGraph());
		histogramEClass.getESuperTypes().add(this.getGraph());
		scatterEClass.getESuperTypes().add(this.getGraph());
		weatherStationEClass.getESuperTypes().add(this.getCompoundSensor());
		strainGaugeEClass.getESuperTypes().add(this.getBasicSensor());
		dateEClass.getESuperTypes().add(this.getFilter());
		fftEClass.getESuperTypes().add(this.getFilter());
		compoundSensorEClass.getESuperTypes().add(this.getSensor());
		ldvtEClass.getESuperTypes().add(this.getBasicSensor());
		inclinometerEClass.getESuperTypes().add(this.getBasicSensor());
		boxPlotEClass.getESuperTypes().add(this.getGraph());
		ohlcEClass.getESuperTypes().add(this.getGraph());

		// Initialize classes, features, and operations; add parameters
		initEClass(vis4bridgeEClass, Vis4bridge.class, "Vis4bridge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVis4bridge_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vis4bridge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVis4bridge_Visualization(), this.getVisualization(), null, "visualization", null, 0, -1,
				Vis4bridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVis4bridge_View(), this.getView(), null, "view", null, 0, -1, Vis4bridge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVis4bridge_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, Vis4bridge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVis4bridge_Daq(), this.getDAQ(), null, "daq", null, 0, -1, Vis4bridge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVis4bridge_Usergroup(), this.getUserGroup(), null, "usergroup", null, 0, -1, Vis4bridge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Visualization.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicSensorEClass, BasicSensor.class, "BasicSensor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicSensor_Graph(), this.getGraph(), this.getGraph_Sensor(), "graph", null, 0, -1,
				BasicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicSensor_Card(), this.getCard(), this.getCard_Basicsensor(), "card", null, 0, -1,
				BasicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triAxisAccelerometerEClass, TriAxisAccelerometer.class, "TriAxisAccelerometer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriAxisAccelerometer_Model(), ecorePackage.getEString(), "model", null, 0, 1,
				TriAxisAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriAxisAccelerometer_X(), ecorePackage.getEBoolean(), "x", null, 0, 1,
				TriAxisAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriAxisAccelerometer_Y(), ecorePackage.getEBoolean(), "y", null, 0, 1,
				TriAxisAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriAxisAccelerometer_Z(), ecorePackage.getEBoolean(), "z", "true", 0, 1,
				TriAxisAccelerometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureEClass, Temperature.class, "Temperature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperature_Model(), ecorePackage.getEString(), "model", null, 0, 1, Temperature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperature_Temperature(), ecorePackage.getEBoolean(), "temperature", null, 0, 1,
				Temperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lineChartEClass, LineChart.class, "LineChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaChartEClass, AreaChart.class, "AreaChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Graph(), this.getGraph(), null, "graph", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Table(), this.getTable(), null, "table", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getView_Id(), ecorePackage.getEString(), "id", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Card(), this.getCard(), null, "card", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Filter(), this.getFilter(), null, "filter", null, 0, -1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getView_Compoundsensor(), this.getCompoundSensor(), this.getCompoundSensor_View(),
				"compoundsensor", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_TimeRange(), this.getTimeRange(), "timeRange", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramEClass, Histogram.class, "Histogram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistogram_Bis(), ecorePackage.getEFloat(), "bis", null, 0, 1, Histogram.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogram_BisAuto(), ecorePackage.getEBoolean(), "bisAuto", "true", 0, 1, Histogram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scatterEClass, Scatter.class, "Scatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphEClass, Graph.class, "Graph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Sensor(), this.getBasicSensor(), this.getBasicSensor_Graph(), "sensor", null, 0, -1,
				Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Id(), ecorePackage.getEString(), "id", null, 0, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Category(), this.getGraphCategory(), "category", null, 0, -1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Usergroup(), this.getUserGroup(), this.getUserGroup_Graph(), "usergroup", null, 0, 1,
				Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weatherStationEClass, WeatherStation.class, "WeatherStation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(strainGaugeEClass, StrainGauge.class, "StrainGauge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrainGauge_Volt(), ecorePackage.getEBoolean(), "Volt", null, 0, 1, StrainGauge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Name(), ecorePackage.getEString(), "name", null, 0, 1, Card.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Id(), ecorePackage.getEString(), "id", null, 0, 1, Card.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Type(), this.getCardType(), "Type", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Basicsensor(), this.getBasicSensor(), this.getBasicSensor_Card(), "basicsensor", null, 0,
				1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Min(), ecorePackage.getEDoubleObject(), "min", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Max(), ecorePackage.getEDoubleObject(), "max", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fftEClass, vis4bridge.FFT.class, "FFT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFFT_LowPass(), ecorePackage.getEBoolean(), "LowPass", null, 0, 1, vis4bridge.FFT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFFT_HighPass(), ecorePackage.getEBoolean(), "HighPass", null, 0, 1, vis4bridge.FFT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFFT_BandPass(), ecorePackage.getEBoolean(), "BandPass", null, 0, 1, vis4bridge.FFT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Filter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_Id(), ecorePackage.getEString(), "id", null, 0, 1, Filter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundSensorEClass, CompoundSensor.class, "CompoundSensor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundSensor_Basicsensor(), this.getBasicSensor(), null, "basicsensor", null, 0, -1,
				CompoundSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundSensor_Length(), ecorePackage.getEInt(), "length", null, 0, 1, CompoundSensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundSensor_View(), this.getView(), this.getView_Compoundsensor(), "view", null, 0, 1,
				CompoundSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Id(), ecorePackage.getEString(), "id", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daqEClass, vis4bridge.DAQ.class, "DAQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAQ_Id(), ecorePackage.getEString(), "id", null, 0, 1, vis4bridge.DAQ.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAQ_Name(), ecorePackage.getEString(), "name", null, 0, 1, vis4bridge.DAQ.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAQ_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, vis4bridge.DAQ.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldvtEClass, vis4bridge.LDVT.class, "LDVT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDVT_Data(), ecorePackage.getEBoolean(), "data", null, 0, 1, vis4bridge.LDVT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inclinometerEClass, Inclinometer.class, "Inclinometer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclinometer_Data(), ecorePackage.getEBoolean(), "data", null, 0, 1, Inclinometer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxPlotEClass, BoxPlot.class, "BoxPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ohlcEClass, vis4bridge.OHLC.class, "OHLC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userGroupEClass, UserGroup.class, "UserGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserGroup_Basicsensor(), this.getBasicSensor(), null, "basicsensor", null, 0, -1,
				UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserGroup_Id(), ecorePackage.getEString(), "id", null, 0, 1, UserGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserGroup_Graph(), this.getGraph(), this.getGraph_Usergroup(), "graph", null, 0, 1,
				UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardTypeEEnum, CardType.class, "CardType");
		addEEnumLiteral(cardTypeEEnum, CardType.AVERAGE);
		addEEnumLiteral(cardTypeEEnum, CardType.MIN);
		addEEnumLiteral(cardTypeEEnum, CardType.MAX);
		addEEnumLiteral(cardTypeEEnum, CardType.ALERT_COUNT);

		initEEnum(timeRangeEEnum, TimeRange.class, "TimeRange");
		addEEnumLiteral(timeRangeEEnum, TimeRange.ONE_HOUR);
		addEEnumLiteral(timeRangeEEnum, TimeRange.TWELVE_HOURS);
		addEEnumLiteral(timeRangeEEnum, TimeRange.ONE_DAY);
		addEEnumLiteral(timeRangeEEnum, TimeRange.SEVEN_DAYS);
		addEEnumLiteral(timeRangeEEnum, TimeRange.FOURTEEN_DAYS);

		initEEnum(graphCategoryEEnum, GraphCategory.class, "GraphCategory");
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.COMPARISON);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.PROPORTION);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.RELATIONSHIP);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.HIERARCHY);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.CONCEPT);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.LOCATION);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.PART_TO_AWHOLE);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.DISTRIBUTION);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.HOW_THINGS_WORK);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.PROCESSES_AND_METHODS);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.MOVEMENT_OR_FLOW);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.PATTERNS);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.RANGE);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.DATE_OVER_TIME);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.ANALISYNG_TEXT);
		addEEnumLiteral(graphCategoryEEnum, GraphCategory.REFERENCE_TOOL);

		// Create resource
		createResource(eNS_URI);
	}

} //Vis4bridgePackageImpl
