/**
 */
package vis4bridge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Range</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vis4bridge.Vis4bridgePackage#getTimeRange()
 * @model
 * @generated
 */
public enum TimeRange implements Enumerator {
	/**
	 * The '<em><b>ONE HOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_HOUR(0, "ONE_HOUR", "ONE_HOUR"),

	/**
	 * The '<em><b>TWELVE HOURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWELVE_HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	TWELVE_HOURS(1, "TWELVE_HOURS", "TWELVE_HOURS"),

	/**
	 * The '<em><b>ONE DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_DAY(2, "ONE_DAY", "ONE_DAY"),

	/**
	 * The '<em><b>SEVEN DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVEN_DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	SEVEN_DAYS(3, "SEVEN_DAYS", "SEVEN_DAYS"),

	/**
	 * The '<em><b>FOURTEEN DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOURTEEN_DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	FOURTEEN_DAYS(4, "FOURTEEN_DAYS", "FOURTEEN_DAYS");

	/**
	 * The '<em><b>ONE HOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE HOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_HOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_HOUR_VALUE = 0;

	/**
	 * The '<em><b>TWELVE HOURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWELVE HOURS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWELVE_HOURS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWELVE_HOURS_VALUE = 1;

	/**
	 * The '<em><b>ONE DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE DAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_DAY_VALUE = 2;

	/**
	 * The '<em><b>SEVEN DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEVEN DAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEVEN_DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEVEN_DAYS_VALUE = 3;

	/**
	 * The '<em><b>FOURTEEN DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOURTEEN DAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOURTEEN_DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOURTEEN_DAYS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Time Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeRange[] VALUES_ARRAY = new TimeRange[] { ONE_HOUR, TWELVE_HOURS, ONE_DAY, SEVEN_DAYS,
			FOURTEEN_DAYS, };

	/**
	 * A public read-only list of all the '<em><b>Time Range</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeRange> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRange get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeRange result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRange getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeRange result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Range</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeRange get(int value) {
		switch (value) {
		case ONE_HOUR_VALUE:
			return ONE_HOUR;
		case TWELVE_HOURS_VALUE:
			return TWELVE_HOURS;
		case ONE_DAY_VALUE:
			return ONE_DAY;
		case SEVEN_DAYS_VALUE:
			return SEVEN_DAYS;
		case FOURTEEN_DAYS_VALUE:
			return FOURTEEN_DAYS;
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
	private TimeRange(int value, String name, String literal) {
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

} //TimeRange
