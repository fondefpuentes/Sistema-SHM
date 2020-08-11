/**
 */
package vis4bridge.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vis4bridge.TriAxisAccelerometer;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tri Axis Accelerometer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.TriAxisAccelerometerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link vis4bridge.impl.TriAxisAccelerometerImpl#isX <em>X</em>}</li>
 *   <li>{@link vis4bridge.impl.TriAxisAccelerometerImpl#isY <em>Y</em>}</li>
 *   <li>{@link vis4bridge.impl.TriAxisAccelerometerImpl#isZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriAxisAccelerometerImpl extends BasicSensorImpl implements TriAxisAccelerometer {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean X_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isX()
	 * @generated
	 * @ordered
	 */
	protected boolean x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #isY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isY()
	 * @generated
	 * @ordered
	 */
	protected static final boolean Y_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isY()
	 * @generated
	 * @ordered
	 */
	protected boolean y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZ()
	 * @generated
	 * @ordered
	 */
	protected static final boolean Z_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZ()
	 * @generated
	 * @ordered
	 */
	protected boolean z = Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriAxisAccelerometerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.TRI_AXIS_ACCELEROMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__MODEL,
					oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(boolean newX) {
		boolean oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__X, oldX,
					x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(boolean newY) {
		boolean oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Y, oldY,
					y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(boolean newZ) {
		boolean oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Z, oldZ,
					z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__MODEL:
			return getModel();
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__X:
			return isX();
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Y:
			return isY();
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Z:
			return isZ();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__MODEL:
			setModel((String) newValue);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__X:
			setX((Boolean) newValue);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Y:
			setY((Boolean) newValue);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Z:
			setZ((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__X:
			setX(X_EDEFAULT);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Y:
			setY(Y_EDEFAULT);
			return;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Z:
			setZ(Z_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__X:
			return x != X_EDEFAULT;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Y:
			return y != Y_EDEFAULT;
		case Vis4bridgePackage.TRI_AXIS_ACCELEROMETER__Z:
			return z != Z_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (model: ");
		result.append(model);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(')');
		return result.toString();
	}

} //TriAxisAccelerometerImpl
