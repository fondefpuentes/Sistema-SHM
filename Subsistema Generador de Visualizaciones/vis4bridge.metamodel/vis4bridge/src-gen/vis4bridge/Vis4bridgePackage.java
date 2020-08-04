/**
 */
package vis4bridge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgeFactory
 * @model kind="package"
 * @generated
 */
public interface Vis4bridgePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vis4bridge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/braulioqh/vis4bridge.git";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vis4bridge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Vis4bridgePackage eINSTANCE = vis4bridge.impl.Vis4bridgePackageImpl.init();

	/**
	 * The meta object id for the '{@link vis4bridge.impl.Vis4bridgeImpl <em>Vis4bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.Vis4bridgeImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getVis4bridge()
	 * @generated
	 */
	int VIS4BRIDGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__VIEW = 2;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Daq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__DAQ = 4;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE__USERGROUP = 5;

	/**
	 * The number of structural features of the '<em>Vis4bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vis4bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIS4BRIDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.VisualizationImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.SensorImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.BasicSensorImpl <em>Basic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.BasicSensorImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getBasicSensor()
	 * @generated
	 */
	int BASIC_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR__GRAPH = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR__CARD = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.TriAxisAccelerometerImpl <em>Tri Axis Accelerometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.TriAxisAccelerometerImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTriAxisAccelerometer()
	 * @generated
	 */
	int TRI_AXIS_ACCELEROMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__NAME = BASIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__ID = BASIC_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__GRAPH = BASIC_SENSOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__CARD = BASIC_SENSOR__CARD;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__MODEL = BASIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__X = BASIC_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__Y = BASIC_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER__Z = BASIC_SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tri Axis Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER_FEATURE_COUNT = BASIC_SENSOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tri Axis Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_AXIS_ACCELEROMETER_OPERATION_COUNT = BASIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.TemperatureImpl <em>Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.TemperatureImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__NAME = BASIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__ID = BASIC_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__GRAPH = BASIC_SENSOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__CARD = BASIC_SENSOR__CARD;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__MODEL = BASIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__TEMPERATURE = BASIC_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_FEATURE_COUNT = BASIC_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_OPERATION_COUNT = BASIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.GraphImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__USERGROUP = 4;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.LineChartImpl <em>Line Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.LineChartImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getLineChart()
	 * @generated
	 */
	int LINE_CHART = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The number of structural features of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.AreaChartImpl <em>Area Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.AreaChartImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getAreaChart()
	 * @generated
	 */
	int AREA_CHART = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The number of structural features of the '<em>Area Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.ViewImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 3;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CARD = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__FILTER = 5;

	/**
	 * The feature id for the '<em><b>Compoundsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COMPOUNDSENSOR = 6;

	/**
	 * The feature id for the '<em><b>Time Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TIME_RANGE = 7;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.HistogramImpl <em>Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.HistogramImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getHistogram()
	 * @generated
	 */
	int HISTOGRAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The feature id for the '<em><b>Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__BIS = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bis Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__BIS_AUTO = GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.ScatterImpl <em>Scatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.ScatterImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getScatter()
	 * @generated
	 */
	int SCATTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The number of structural features of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.TableImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.CompoundSensorImpl <em>Compound Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.CompoundSensorImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCompoundSensor()
	 * @generated
	 */
	int COMPOUND_SENSOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR__ID = SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Basicsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR__BASICSENSOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR__LENGTH = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR__VIEW = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compound Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.WeatherStationImpl <em>Weather Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.WeatherStationImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getWeatherStation()
	 * @generated
	 */
	int WEATHER_STATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION__NAME = COMPOUND_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION__ID = COMPOUND_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Basicsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION__BASICSENSOR = COMPOUND_SENSOR__BASICSENSOR;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION__LENGTH = COMPOUND_SENSOR__LENGTH;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION__VIEW = COMPOUND_SENSOR__VIEW;

	/**
	 * The number of structural features of the '<em>Weather Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION_FEATURE_COUNT = COMPOUND_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weather Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_STATION_OPERATION_COUNT = COMPOUND_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.StrainGaugeImpl <em>Strain Gauge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.StrainGaugeImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getStrainGauge()
	 * @generated
	 */
	int STRAIN_GAUGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE__NAME = BASIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE__ID = BASIC_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE__GRAPH = BASIC_SENSOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE__CARD = BASIC_SENSOR__CARD;

	/**
	 * The feature id for the '<em><b>Volt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE__VOLT = BASIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strain Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE_FEATURE_COUNT = BASIC_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strain Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIN_GAUGE_OPERATION_COUNT = BASIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.DAQImpl <em>DAQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.DAQImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getDAQ()
	 * @generated
	 */
	int DAQ = 20;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.LDVTImpl <em>LDVT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.LDVTImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getLDVT()
	 * @generated
	 */
	int LDVT = 21;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.InclinometerImpl <em>Inclinometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.InclinometerImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getInclinometer()
	 * @generated
	 */
	int INCLINOMETER = 22;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.CardImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCard()
	 * @generated
	 */
	int CARD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Basicsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BASICSENSOR = 3;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.FilterImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ID = 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.DateImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ID = FILTER__ID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MIN = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MAX = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.FFTImpl <em>FFT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.FFTImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getFFT()
	 * @generated
	 */
	int FFT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT__NAME = FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT__ID = FILTER__ID;

	/**
	 * The feature id for the '<em><b>Low Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT__LOW_PASS = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT__HIGH_PASS = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Band Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT__BAND_PASS = FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FFT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT_FEATURE_COUNT = FILTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FFT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFT_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAQ__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAQ__NAME = 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAQ__SENSOR = 2;

	/**
	 * The number of structural features of the '<em>DAQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAQ_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DAQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAQ_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT__NAME = BASIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT__ID = BASIC_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT__GRAPH = BASIC_SENSOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT__CARD = BASIC_SENSOR__CARD;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT__DATA = BASIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDVT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT_FEATURE_COUNT = BASIC_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LDVT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDVT_OPERATION_COUNT = BASIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER__NAME = BASIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER__ID = BASIC_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER__GRAPH = BASIC_SENSOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER__CARD = BASIC_SENSOR__CARD;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER__DATA = BASIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclinometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER_FEATURE_COUNT = BASIC_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inclinometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLINOMETER_OPERATION_COUNT = BASIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.BoxPlotImpl <em>Box Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.BoxPlotImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getBoxPlot()
	 * @generated
	 */
	int BOX_PLOT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The number of structural features of the '<em>Box Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Box Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_PLOT_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.OHLCImpl <em>OHLC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.OHLCImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getOHLC()
	 * @generated
	 */
	int OHLC = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC__NAME = GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC__SENSOR = GRAPH__SENSOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC__ID = GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC__CATEGORY = GRAPH__CATEGORY;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC__USERGROUP = GRAPH__USERGROUP;

	/**
	 * The number of structural features of the '<em>OHLC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OHLC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OHLC_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vis4bridge.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.impl.UserGroupImpl
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Basicsensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__BASICSENSOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__ID = 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__GRAPH = 3;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vis4bridge.CardType <em>Card Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.CardType
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 26;

	/**
	 * The meta object id for the '{@link vis4bridge.TimeRange <em>Time Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.TimeRange
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 27;

	/**
	 * The meta object id for the '{@link vis4bridge.GraphCategory <em>Graph Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vis4bridge.GraphCategory
	 * @see vis4bridge.impl.Vis4bridgePackageImpl#getGraphCategory()
	 * @generated
	 */
	int GRAPH_CATEGORY = 28;

	/**
	 * Returns the meta object for class '{@link vis4bridge.Vis4bridge <em>Vis4bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vis4bridge</em>'.
	 * @see vis4bridge.Vis4bridge
	 * @generated
	 */
	EClass getVis4bridge();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Vis4bridge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Vis4bridge#getName()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EAttribute getVis4bridge_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.Vis4bridge#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see vis4bridge.Vis4bridge#getSensor()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EReference getVis4bridge_Sensor();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.Vis4bridge#getDaq <em>Daq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daq</em>'.
	 * @see vis4bridge.Vis4bridge#getDaq()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EReference getVis4bridge_Daq();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.Vis4bridge#getUsergroup <em>Usergroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usergroup</em>'.
	 * @see vis4bridge.Vis4bridge#getUsergroup()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EReference getVis4bridge_Usergroup();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.Vis4bridge#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization</em>'.
	 * @see vis4bridge.Vis4bridge#getVisualization()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EReference getVis4bridge_Visualization();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.Vis4bridge#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see vis4bridge.Vis4bridge#getView()
	 * @see #getVis4bridge()
	 * @generated
	 */
	EReference getVis4bridge_View();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see vis4bridge.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Visualization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Visualization#getName()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Name();

	/**
	 * Returns the meta object for class '{@link vis4bridge.BasicSensor <em>Basic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Sensor</em>'.
	 * @see vis4bridge.BasicSensor
	 * @generated
	 */
	EClass getBasicSensor();

	/**
	 * Returns the meta object for the reference list '{@link vis4bridge.BasicSensor#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graph</em>'.
	 * @see vis4bridge.BasicSensor#getGraph()
	 * @see #getBasicSensor()
	 * @generated
	 */
	EReference getBasicSensor_Graph();

	/**
	 * Returns the meta object for the reference list '{@link vis4bridge.BasicSensor#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Card</em>'.
	 * @see vis4bridge.BasicSensor#getCard()
	 * @see #getBasicSensor()
	 * @generated
	 */
	EReference getBasicSensor_Card();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see vis4bridge.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Sensor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.Sensor#getId()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Id();

	/**
	 * Returns the meta object for class '{@link vis4bridge.TriAxisAccelerometer <em>Tri Axis Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tri Axis Accelerometer</em>'.
	 * @see vis4bridge.TriAxisAccelerometer
	 * @generated
	 */
	EClass getTriAxisAccelerometer();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.TriAxisAccelerometer#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see vis4bridge.TriAxisAccelerometer#getModel()
	 * @see #getTriAxisAccelerometer()
	 * @generated
	 */
	EAttribute getTriAxisAccelerometer_Model();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.TriAxisAccelerometer#isX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see vis4bridge.TriAxisAccelerometer#isX()
	 * @see #getTriAxisAccelerometer()
	 * @generated
	 */
	EAttribute getTriAxisAccelerometer_X();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.TriAxisAccelerometer#isY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see vis4bridge.TriAxisAccelerometer#isY()
	 * @see #getTriAxisAccelerometer()
	 * @generated
	 */
	EAttribute getTriAxisAccelerometer_Y();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.TriAxisAccelerometer#isZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see vis4bridge.TriAxisAccelerometer#isZ()
	 * @see #getTriAxisAccelerometer()
	 * @generated
	 */
	EAttribute getTriAxisAccelerometer_Z();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature</em>'.
	 * @see vis4bridge.Temperature
	 * @generated
	 */
	EClass getTemperature();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Temperature#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see vis4bridge.Temperature#getModel()
	 * @see #getTemperature()
	 * @generated
	 */
	EAttribute getTemperature_Model();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Temperature#isTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see vis4bridge.Temperature#isTemperature()
	 * @see #getTemperature()
	 * @generated
	 */
	EAttribute getTemperature_Temperature();

	/**
	 * Returns the meta object for class '{@link vis4bridge.LineChart <em>Line Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Chart</em>'.
	 * @see vis4bridge.LineChart
	 * @generated
	 */
	EClass getLineChart();

	/**
	 * Returns the meta object for class '{@link vis4bridge.AreaChart <em>Area Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Chart</em>'.
	 * @see vis4bridge.AreaChart
	 * @generated
	 */
	EClass getAreaChart();

	/**
	 * Returns the meta object for class '{@link vis4bridge.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see vis4bridge.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.View#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph</em>'.
	 * @see vis4bridge.View#getGraph()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Graph();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.View#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see vis4bridge.View#getTable()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Table();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.View#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.View#getId()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.View#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card</em>'.
	 * @see vis4bridge.View#getCard()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Card();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.View#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see vis4bridge.View#getFilter()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Filter();

	/**
	 * Returns the meta object for the reference '{@link vis4bridge.View#getCompoundsensor <em>Compoundsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compoundsensor</em>'.
	 * @see vis4bridge.View#getCompoundsensor()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Compoundsensor();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.View#getTimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Range</em>'.
	 * @see vis4bridge.View#getTimeRange()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_TimeRange();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram</em>'.
	 * @see vis4bridge.Histogram
	 * @generated
	 */
	EClass getHistogram();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Histogram#getBis <em>Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bis</em>'.
	 * @see vis4bridge.Histogram#getBis()
	 * @see #getHistogram()
	 * @generated
	 */
	EAttribute getHistogram_Bis();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Histogram#isBisAuto <em>Bis Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bis Auto</em>'.
	 * @see vis4bridge.Histogram#isBisAuto()
	 * @see #getHistogram()
	 * @generated
	 */
	EAttribute getHistogram_BisAuto();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Scatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter</em>'.
	 * @see vis4bridge.Scatter
	 * @generated
	 */
	EClass getScatter();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see vis4bridge.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Graph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Graph#getName()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Name();

	/**
	 * Returns the meta object for the reference list '{@link vis4bridge.Graph#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor</em>'.
	 * @see vis4bridge.Graph#getSensor()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Graph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.Graph#getId()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Id();

	/**
	 * Returns the meta object for the attribute list '{@link vis4bridge.Graph#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Category</em>'.
	 * @see vis4bridge.Graph#getCategory()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Category();

	/**
	 * Returns the meta object for the reference '{@link vis4bridge.Graph#getUsergroup <em>Usergroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usergroup</em>'.
	 * @see vis4bridge.Graph#getUsergroup()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Usergroup();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see vis4bridge.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Table#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.Table#getId()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Id();

	/**
	 * Returns the meta object for class '{@link vis4bridge.WeatherStation <em>Weather Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weather Station</em>'.
	 * @see vis4bridge.WeatherStation
	 * @generated
	 */
	EClass getWeatherStation();

	/**
	 * Returns the meta object for class '{@link vis4bridge.StrainGauge <em>Strain Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strain Gauge</em>'.
	 * @see vis4bridge.StrainGauge
	 * @generated
	 */
	EClass getStrainGauge();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.StrainGauge#isVolt <em>Volt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volt</em>'.
	 * @see vis4bridge.StrainGauge#isVolt()
	 * @see #getStrainGauge()
	 * @generated
	 */
	EAttribute getStrainGauge_Volt();

	/**
	 * Returns the meta object for class '{@link vis4bridge.DAQ <em>DAQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAQ</em>'.
	 * @see vis4bridge.DAQ
	 * @generated
	 */
	EClass getDAQ();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.DAQ#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.DAQ#getId()
	 * @see #getDAQ()
	 * @generated
	 */
	EAttribute getDAQ_Id();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.DAQ#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.DAQ#getName()
	 * @see #getDAQ()
	 * @generated
	 */
	EAttribute getDAQ_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.DAQ#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see vis4bridge.DAQ#getSensor()
	 * @see #getDAQ()
	 * @generated
	 */
	EReference getDAQ_Sensor();

	/**
	 * Returns the meta object for class '{@link vis4bridge.LDVT <em>LDVT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDVT</em>'.
	 * @see vis4bridge.LDVT
	 * @generated
	 */
	EClass getLDVT();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.LDVT#isData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see vis4bridge.LDVT#isData()
	 * @see #getLDVT()
	 * @generated
	 */
	EAttribute getLDVT_Data();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Inclinometer <em>Inclinometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclinometer</em>'.
	 * @see vis4bridge.Inclinometer
	 * @generated
	 */
	EClass getInclinometer();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Inclinometer#isData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see vis4bridge.Inclinometer#isData()
	 * @see #getInclinometer()
	 * @generated
	 */
	EAttribute getInclinometer_Data();

	/**
	 * Returns the meta object for class '{@link vis4bridge.BoxPlot <em>Box Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box Plot</em>'.
	 * @see vis4bridge.BoxPlot
	 * @generated
	 */
	EClass getBoxPlot();

	/**
	 * Returns the meta object for class '{@link vis4bridge.OHLC <em>OHLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OHLC</em>'.
	 * @see vis4bridge.OHLC
	 * @generated
	 */
	EClass getOHLC();

	/**
	 * Returns the meta object for class '{@link vis4bridge.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see vis4bridge.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.UserGroup#getBasicsensor <em>Basicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basicsensor</em>'.
	 * @see vis4bridge.UserGroup#getBasicsensor()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Basicsensor();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.UserGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.UserGroup#getName()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.UserGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.UserGroup#getId()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Id();

	/**
	 * Returns the meta object for the reference '{@link vis4bridge.UserGroup#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see vis4bridge.UserGroup#getGraph()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Graph();

	/**
	 * Returns the meta object for enum '{@link vis4bridge.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Type</em>'.
	 * @see vis4bridge.CardType
	 * @generated
	 */
	EEnum getCardType();

	/**
	 * Returns the meta object for enum '{@link vis4bridge.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Range</em>'.
	 * @see vis4bridge.TimeRange
	 * @generated
	 */
	EEnum getTimeRange();

	/**
	 * Returns the meta object for enum '{@link vis4bridge.GraphCategory <em>Graph Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graph Category</em>'.
	 * @see vis4bridge.GraphCategory
	 * @generated
	 */
	EEnum getGraphCategory();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see vis4bridge.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Card#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Card#getName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Name();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Card#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.Card#getId()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Id();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Card#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vis4bridge.Card#getType()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Type();

	/**
	 * Returns the meta object for the reference '{@link vis4bridge.Card#getBasicsensor <em>Basicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basicsensor</em>'.
	 * @see vis4bridge.Card#getBasicsensor()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Basicsensor();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see vis4bridge.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Date#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vis4bridge.Date#getMin()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Min();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Date#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vis4bridge.Date#getMax()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Max();

	/**
	 * Returns the meta object for class '{@link vis4bridge.FFT <em>FFT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FFT</em>'.
	 * @see vis4bridge.FFT
	 * @generated
	 */
	EClass getFFT();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.FFT#isLowPass <em>Low Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Pass</em>'.
	 * @see vis4bridge.FFT#isLowPass()
	 * @see #getFFT()
	 * @generated
	 */
	EAttribute getFFT_LowPass();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.FFT#isHighPass <em>High Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Pass</em>'.
	 * @see vis4bridge.FFT#isHighPass()
	 * @see #getFFT()
	 * @generated
	 */
	EAttribute getFFT_HighPass();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.FFT#isBandPass <em>Band Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Band Pass</em>'.
	 * @see vis4bridge.FFT#isBandPass()
	 * @see #getFFT()
	 * @generated
	 */
	EAttribute getFFT_BandPass();

	/**
	 * Returns the meta object for class '{@link vis4bridge.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see vis4bridge.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Filter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vis4bridge.Filter#getName()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Name();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.Filter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see vis4bridge.Filter#getId()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Id();

	/**
	 * Returns the meta object for class '{@link vis4bridge.CompoundSensor <em>Compound Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Sensor</em>'.
	 * @see vis4bridge.CompoundSensor
	 * @generated
	 */
	EClass getCompoundSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link vis4bridge.CompoundSensor#getBasicsensor <em>Basicsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basicsensor</em>'.
	 * @see vis4bridge.CompoundSensor#getBasicsensor()
	 * @see #getCompoundSensor()
	 * @generated
	 */
	EReference getCompoundSensor_Basicsensor();

	/**
	 * Returns the meta object for the attribute '{@link vis4bridge.CompoundSensor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see vis4bridge.CompoundSensor#getLength()
	 * @see #getCompoundSensor()
	 * @generated
	 */
	EAttribute getCompoundSensor_Length();

	/**
	 * Returns the meta object for the reference '{@link vis4bridge.CompoundSensor#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see vis4bridge.CompoundSensor#getView()
	 * @see #getCompoundSensor()
	 * @generated
	 */
	EReference getCompoundSensor_View();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Vis4bridgeFactory getVis4bridgeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vis4bridge.impl.Vis4bridgeImpl <em>Vis4bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.Vis4bridgeImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getVis4bridge()
		 * @generated
		 */
		EClass VIS4BRIDGE = eINSTANCE.getVis4bridge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIS4BRIDGE__NAME = eINSTANCE.getVis4bridge_Name();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIS4BRIDGE__SENSOR = eINSTANCE.getVis4bridge_Sensor();

		/**
		 * The meta object literal for the '<em><b>Daq</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIS4BRIDGE__DAQ = eINSTANCE.getVis4bridge_Daq();

		/**
		 * The meta object literal for the '<em><b>Usergroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIS4BRIDGE__USERGROUP = eINSTANCE.getVis4bridge_Usergroup();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIS4BRIDGE__VISUALIZATION = eINSTANCE.getVis4bridge_Visualization();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIS4BRIDGE__VIEW = eINSTANCE.getVis4bridge_View();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.VisualizationImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__NAME = eINSTANCE.getVisualization_Name();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.BasicSensorImpl <em>Basic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.BasicSensorImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getBasicSensor()
		 * @generated
		 */
		EClass BASIC_SENSOR = eINSTANCE.getBasicSensor();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_SENSOR__GRAPH = eINSTANCE.getBasicSensor_Graph();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_SENSOR__CARD = eINSTANCE.getBasicSensor_Card();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.SensorImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ID = eINSTANCE.getSensor_Id();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.TriAxisAccelerometerImpl <em>Tri Axis Accelerometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.TriAxisAccelerometerImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTriAxisAccelerometer()
		 * @generated
		 */
		EClass TRI_AXIS_ACCELEROMETER = eINSTANCE.getTriAxisAccelerometer();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRI_AXIS_ACCELEROMETER__MODEL = eINSTANCE.getTriAxisAccelerometer_Model();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRI_AXIS_ACCELEROMETER__X = eINSTANCE.getTriAxisAccelerometer_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRI_AXIS_ACCELEROMETER__Y = eINSTANCE.getTriAxisAccelerometer_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRI_AXIS_ACCELEROMETER__Z = eINSTANCE.getTriAxisAccelerometer_Z();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.TemperatureImpl <em>Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.TemperatureImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTemperature()
		 * @generated
		 */
		EClass TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE__MODEL = eINSTANCE.getTemperature_Model();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE__TEMPERATURE = eINSTANCE.getTemperature_Temperature();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.LineChartImpl <em>Line Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.LineChartImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getLineChart()
		 * @generated
		 */
		EClass LINE_CHART = eINSTANCE.getLineChart();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.AreaChartImpl <em>Area Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.AreaChartImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getAreaChart()
		 * @generated
		 */
		EClass AREA_CHART = eINSTANCE.getAreaChart();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.ViewImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__GRAPH = eINSTANCE.getView_Graph();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__TABLE = eINSTANCE.getView_Table();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_Id();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CARD = eINSTANCE.getView_Card();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__FILTER = eINSTANCE.getView_Filter();

		/**
		 * The meta object literal for the '<em><b>Compoundsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__COMPOUNDSENSOR = eINSTANCE.getView_Compoundsensor();

		/**
		 * The meta object literal for the '<em><b>Time Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__TIME_RANGE = eINSTANCE.getView_TimeRange();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.HistogramImpl <em>Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.HistogramImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getHistogram()
		 * @generated
		 */
		EClass HISTOGRAM = eINSTANCE.getHistogram();

		/**
		 * The meta object literal for the '<em><b>Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM__BIS = eINSTANCE.getHistogram_Bis();

		/**
		 * The meta object literal for the '<em><b>Bis Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM__BIS_AUTO = eINSTANCE.getHistogram_BisAuto();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.ScatterImpl <em>Scatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.ScatterImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getScatter()
		 * @generated
		 */
		EClass SCATTER = eINSTANCE.getScatter();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.GraphImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__SENSOR = eINSTANCE.getGraph_Sensor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__ID = eINSTANCE.getGraph_Id();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__CATEGORY = eINSTANCE.getGraph_Category();

		/**
		 * The meta object literal for the '<em><b>Usergroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__USERGROUP = eINSTANCE.getGraph_Usergroup();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.TableImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ID = eINSTANCE.getTable_Id();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.WeatherStationImpl <em>Weather Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.WeatherStationImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getWeatherStation()
		 * @generated
		 */
		EClass WEATHER_STATION = eINSTANCE.getWeatherStation();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.StrainGaugeImpl <em>Strain Gauge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.StrainGaugeImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getStrainGauge()
		 * @generated
		 */
		EClass STRAIN_GAUGE = eINSTANCE.getStrainGauge();

		/**
		 * The meta object literal for the '<em><b>Volt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRAIN_GAUGE__VOLT = eINSTANCE.getStrainGauge_Volt();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.DAQImpl <em>DAQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.DAQImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getDAQ()
		 * @generated
		 */
		EClass DAQ = eINSTANCE.getDAQ();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAQ__ID = eINSTANCE.getDAQ_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAQ__NAME = eINSTANCE.getDAQ_Name();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAQ__SENSOR = eINSTANCE.getDAQ_Sensor();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.LDVTImpl <em>LDVT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.LDVTImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getLDVT()
		 * @generated
		 */
		EClass LDVT = eINSTANCE.getLDVT();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDVT__DATA = eINSTANCE.getLDVT_Data();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.InclinometerImpl <em>Inclinometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.InclinometerImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getInclinometer()
		 * @generated
		 */
		EClass INCLINOMETER = eINSTANCE.getInclinometer();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLINOMETER__DATA = eINSTANCE.getInclinometer_Data();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.BoxPlotImpl <em>Box Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.BoxPlotImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getBoxPlot()
		 * @generated
		 */
		EClass BOX_PLOT = eINSTANCE.getBoxPlot();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.OHLCImpl <em>OHLC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.OHLCImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getOHLC()
		 * @generated
		 */
		EClass OHLC = eINSTANCE.getOHLC();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.UserGroupImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>Basicsensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__BASICSENSOR = eINSTANCE.getUserGroup_Basicsensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__NAME = eINSTANCE.getUserGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__ID = eINSTANCE.getUserGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__GRAPH = eINSTANCE.getUserGroup_Graph();

		/**
		 * The meta object literal for the '{@link vis4bridge.CardType <em>Card Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.CardType
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCardType()
		 * @generated
		 */
		EEnum CARD_TYPE = eINSTANCE.getCardType();

		/**
		 * The meta object literal for the '{@link vis4bridge.TimeRange <em>Time Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.TimeRange
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getTimeRange()
		 * @generated
		 */
		EEnum TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '{@link vis4bridge.GraphCategory <em>Graph Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.GraphCategory
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getGraphCategory()
		 * @generated
		 */
		EEnum GRAPH_CATEGORY = eINSTANCE.getGraphCategory();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.CardImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__NAME = eINSTANCE.getCard_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ID = eINSTANCE.getCard_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE = eINSTANCE.getCard_Type();

		/**
		 * The meta object literal for the '<em><b>Basicsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__BASICSENSOR = eINSTANCE.getCard_Basicsensor();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.DateImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MIN = eINSTANCE.getDate_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MAX = eINSTANCE.getDate_Max();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.FFTImpl <em>FFT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.FFTImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getFFT()
		 * @generated
		 */
		EClass FFT = eINSTANCE.getFFT();

		/**
		 * The meta object literal for the '<em><b>Low Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FFT__LOW_PASS = eINSTANCE.getFFT_LowPass();

		/**
		 * The meta object literal for the '<em><b>High Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FFT__HIGH_PASS = eINSTANCE.getFFT_HighPass();

		/**
		 * The meta object literal for the '<em><b>Band Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FFT__BAND_PASS = eINSTANCE.getFFT_BandPass();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.FilterImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__NAME = eINSTANCE.getFilter_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__ID = eINSTANCE.getFilter_Id();

		/**
		 * The meta object literal for the '{@link vis4bridge.impl.CompoundSensorImpl <em>Compound Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vis4bridge.impl.CompoundSensorImpl
		 * @see vis4bridge.impl.Vis4bridgePackageImpl#getCompoundSensor()
		 * @generated
		 */
		EClass COMPOUND_SENSOR = eINSTANCE.getCompoundSensor();

		/**
		 * The meta object literal for the '<em><b>Basicsensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SENSOR__BASICSENSOR = eINSTANCE.getCompoundSensor_Basicsensor();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_SENSOR__LENGTH = eINSTANCE.getCompoundSensor_Length();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SENSOR__VIEW = eINSTANCE.getCompoundSensor_View();

	}

} //Vis4bridgePackage
