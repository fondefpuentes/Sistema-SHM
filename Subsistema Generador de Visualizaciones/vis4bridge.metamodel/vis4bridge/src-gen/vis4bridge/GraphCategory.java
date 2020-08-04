/**
 */
package vis4bridge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Graph Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgePackage#getGraphCategory()
 * @model
 * @generated
 */
public enum GraphCategory implements Enumerator {
	/**
	 * The '<em><b>COMPARISON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARISON_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARISON(0, "COMPARISON", "COMPARISON"),

	/**
	 * The '<em><b>PROPORTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTION(1, "PROPORTION", "PROPORTION"),

	/**
	 * The '<em><b>RELATIONSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONSHIP(2, "RELATIONSHIP", "RELATIONSHIP"),

	/**
	 * The '<em><b>HIERARCHY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY(3, "HIERARCHY", "HIERARCHY"),

	/**
	 * The '<em><b>CONCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT(4, "CONCEPT", "CONCEPT"),

	/**
	 * The '<em><b>LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(5, "LOCATION", "LOCATION"),

	/**
	 * The '<em><b>PART TO AWHOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_TO_AWHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	PART_TO_AWHOLE(6, "PART_TO_A_WHOLE", "PART_TO_A_WHOLE"),

	/**
	 * The '<em><b>DISTRIBUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(7, "DISTRIBUTION", "DISTRIBUTION"),

	/**
	 * The '<em><b>HOW THINGS WORK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOW_THINGS_WORK_VALUE
	 * @generated
	 * @ordered
	 */
	HOW_THINGS_WORK(8, "HOW_THINGS_WORK", "HOW_THINGS_WORK"),

	/**
	 * The '<em><b>PROCESSES AND METHODS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSES_AND_METHODS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSES_AND_METHODS(9, "PROCESSES_AND_METHODS", "PROCESSES_AND_METHODS"),

	/**
	 * The '<em><b>MOVEMENT OR FLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_OR_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_OR_FLOW(10, "MOVEMENT_OR_FLOW", "MOVEMENT_OR_FLOW"),

	/**
	 * The '<em><b>PATTERNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATTERNS_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERNS(11, "PATTERNS", "PATTERNS"),

	/**
	 * The '<em><b>RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(12, "RANGE", "RANGE"),

	/**
	 * The '<em><b>DATE OVER TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_OVER_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_OVER_TIME(13, "DATE_OVER_TIME", "DATE_OVER_TIME"),

	/**
	 * The '<em><b>ANALISYNG TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALISYNG_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ANALISYNG_TEXT(14, "ANALISYNG_TEXT", "ANALISYNG_TEXT"),

	/**
	 * The '<em><b>REFERENCE TOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TOOL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_TOOL(15, "REFERENCE_TOOL", "REFERENCE_TOOL");

	/**
	 * The '<em><b>COMPARISON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPARISON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARISON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPARISON_VALUE = 0;

	/**
	 * The '<em><b>PROPORTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPORTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTION_VALUE = 1;

	/**
	 * The '<em><b>RELATIONSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIONSHIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_VALUE = 2;

	/**
	 * The '<em><b>HIERARCHY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIERARCHY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_VALUE = 3;

	/**
	 * The '<em><b>CONCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONCEPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_VALUE = 4;

	/**
	 * The '<em><b>LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 5;

	/**
	 * The '<em><b>PART TO AWHOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PART TO AWHOLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PART_TO_AWHOLE
	 * @model name="PART_TO_A_WHOLE"
	 * @generated
	 * @ordered
	 */
	public static final int PART_TO_AWHOLE_VALUE = 6;

	/**
	 * The '<em><b>DISTRIBUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTRIBUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 7;

	/**
	 * The '<em><b>HOW THINGS WORK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOW THINGS WORK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOW_THINGS_WORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOW_THINGS_WORK_VALUE = 8;

	/**
	 * The '<em><b>PROCESSES AND METHODS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSES AND METHODS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSES_AND_METHODS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSES_AND_METHODS_VALUE = 9;

	/**
	 * The '<em><b>MOVEMENT OR FLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT OR FLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_OR_FLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_OR_FLOW_VALUE = 10;

	/**
	 * The '<em><b>PATTERNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATTERNS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATTERNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATTERNS_VALUE = 11;

	/**
	 * The '<em><b>RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 12;

	/**
	 * The '<em><b>DATE OVER TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE OVER TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_OVER_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_OVER_TIME_VALUE = 13;

	/**
	 * The '<em><b>ANALISYNG TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANALISYNG TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALISYNG_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALISYNG_TEXT_VALUE = 14;

	/**
	 * The '<em><b>REFERENCE TOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFERENCE TOOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_TOOL_VALUE = 15;

	/**
	 * An array of all the '<em><b>Graph Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GraphCategory[] VALUES_ARRAY = new GraphCategory[] { COMPARISON, PROPORTION, RELATIONSHIP,
			HIERARCHY, CONCEPT, LOCATION, PART_TO_AWHOLE, DISTRIBUTION, HOW_THINGS_WORK, PROCESSES_AND_METHODS,
			MOVEMENT_OR_FLOW, PATTERNS, RANGE, DATE_OVER_TIME, ANALISYNG_TEXT, REFERENCE_TOOL, };

	/**
	 * A public read-only list of all the '<em><b>Graph Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GraphCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Graph Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GraphCategory get(int value) {
		switch (value) {
		case COMPARISON_VALUE:
			return COMPARISON;
		case PROPORTION_VALUE:
			return PROPORTION;
		case RELATIONSHIP_VALUE:
			return RELATIONSHIP;
		case HIERARCHY_VALUE:
			return HIERARCHY;
		case CONCEPT_VALUE:
			return CONCEPT;
		case LOCATION_VALUE:
			return LOCATION;
		case PART_TO_AWHOLE_VALUE:
			return PART_TO_AWHOLE;
		case DISTRIBUTION_VALUE:
			return DISTRIBUTION;
		case HOW_THINGS_WORK_VALUE:
			return HOW_THINGS_WORK;
		case PROCESSES_AND_METHODS_VALUE:
			return PROCESSES_AND_METHODS;
		case MOVEMENT_OR_FLOW_VALUE:
			return MOVEMENT_OR_FLOW;
		case PATTERNS_VALUE:
			return PATTERNS;
		case RANGE_VALUE:
			return RANGE;
		case DATE_OVER_TIME_VALUE:
			return DATE_OVER_TIME;
		case ANALISYNG_TEXT_VALUE:
			return ANALISYNG_TEXT;
		case REFERENCE_TOOL_VALUE:
			return REFERENCE_TOOL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GraphCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //GraphCategory
