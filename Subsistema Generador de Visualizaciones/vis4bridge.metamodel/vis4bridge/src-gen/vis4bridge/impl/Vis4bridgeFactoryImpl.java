/**
 */
package vis4bridge.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vis4bridge.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vis4bridgeFactoryImpl extends EFactoryImpl implements Vis4bridgeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Vis4bridgeFactory init() {
		try {
			Vis4bridgeFactory theVis4bridgeFactory = (Vis4bridgeFactory) EPackage.Registry.INSTANCE
					.getEFactory(Vis4bridgePackage.eNS_URI);
			if (theVis4bridgeFactory != null) {
				return theVis4bridgeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Vis4bridgeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Vis4bridgePackage.VIS4BRIDGE:
			return createVis4bridge();
		case Vis4bridgePackage.VISUALIZATION:
			return createVisualization();
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER:
			return createTriAxisAccelerometer();
		case Vis4bridgePackage.TEMPERATURE:
			return createTemperature();
		case Vis4bridgePackage.LINE_CHART:
			return createLineChart();
		case Vis4bridgePackage.AREA_CHART:
			return createAreaChart();
		case Vis4bridgePackage.VIEW:
			return createView();
		case Vis4bridgePackage.HISTOGRAM:
			return createHistogram();
		case Vis4bridgePackage.SCATTER:
			return createScatter();
		case Vis4bridgePackage.TABLE:
			return createTable();
		case Vis4bridgePackage.WEATHER_STATION:
			return createWeatherStation();
		case Vis4bridgePackage.STRAIN_GAUGE:
			return createStrainGauge();
		case Vis4bridgePackage.CARD:
			return createCard();
		case Vis4bridgePackage.DATE:
			return createDate();
		case Vis4bridgePackage.FFT:
			return createFFT();
		case Vis4bridgePackage.DAQ:
			return createDAQ();
		case Vis4bridgePackage.LDVT:
			return createLDVT();
		case Vis4bridgePackage.INCLINOMETER:
			return createInclinometer();
		case Vis4bridgePackage.BOX_PLOT:
			return createBoxPlot();
		case Vis4bridgePackage.OHLC:
			return createOHLC();
		case Vis4bridgePackage.USER_GROUP:
			return createUserGroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Vis4bridgePackage.CARD_TYPE:
			return createCardTypeFromString(eDataType, initialValue);
		case Vis4bridgePackage.TIME_RANGE:
			return createTimeRangeFromString(eDataType, initialValue);
		case Vis4bridgePackage.GRAPH_CATEGORY:
			return createGraphCategoryFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Vis4bridgePackage.CARD_TYPE:
			return convertCardTypeToString(eDataType, instanceValue);
		case Vis4bridgePackage.TIME_RANGE:
			return convertTimeRangeToString(eDataType, instanceValue);
		case Vis4bridgePackage.GRAPH_CATEGORY:
			return convertGraphCategoryToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridge createVis4bridge() {
		Vis4bridgeImpl vis4bridge = new Vis4bridgeImpl();
		return vis4bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriAxisAccelerometer createTriAxisAccelerometer() {
		TriAxisAccelerometerImpl triAxisAccelerometer = new TriAxisAccelerometerImpl();
		return triAxisAccelerometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature createTemperature() {
		TemperatureImpl temperature = new TemperatureImpl();
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineChart createLineChart() {
		LineChartImpl lineChart = new LineChartImpl();
		return lineChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaChart createAreaChart() {
		AreaChartImpl areaChart = new AreaChartImpl();
		return areaChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scatter createScatter() {
		ScatterImpl scatter = new ScatterImpl();
		return scatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherStation createWeatherStation() {
		WeatherStationImpl weatherStation = new WeatherStationImpl();
		return weatherStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrainGauge createStrainGauge() {
		StrainGaugeImpl strainGauge = new StrainGaugeImpl();
		return strainGauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FFT createFFT() {
		FFTImpl fft = new FFTImpl();
		return fft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAQ createDAQ() {
		DAQImpl daq = new DAQImpl();
		return daq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDVT createLDVT() {
		LDVTImpl ldvt = new LDVTImpl();
		return ldvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclinometer createInclinometer() {
		InclinometerImpl inclinometer = new InclinometerImpl();
		return inclinometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxPlot createBoxPlot() {
		BoxPlotImpl boxPlot = new BoxPlotImpl();
		return boxPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OHLC createOHLC() {
		OHLCImpl ohlc = new OHLCImpl();
		return ohlc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup createUserGroup() {
		UserGroupImpl userGroup = new UserGroupImpl();
		return userGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType createCardTypeFromString(EDataType eDataType, String initialValue) {
		CardType result = CardType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRange createTimeRangeFromString(EDataType eDataType, String initialValue) {
		TimeRange result = TimeRange.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeRangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphCategory createGraphCategoryFromString(EDataType eDataType, String initialValue) {
		GraphCategory result = GraphCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vis4bridgePackage getVis4bridgePackage() {
		return (Vis4bridgePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Vis4bridgePackage getPackage() {
		return Vis4bridgePackage.eINSTANCE;
	}

} //Vis4bridgeFactoryImpl
