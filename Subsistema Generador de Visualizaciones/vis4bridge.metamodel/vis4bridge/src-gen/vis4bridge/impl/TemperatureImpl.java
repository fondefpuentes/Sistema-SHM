/**
 */
package vis4bridge.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vis4bridge.Temperature;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.TemperatureImpl#getModel <em>Model</em>}</li>
 *   <li>{@link vis4bridge.impl.TemperatureImpl#isTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemperatureImpl extends BasicSensorImpl implements Temperature {
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
	 * The default value of the '{@link #isTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPERATURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemperature()
	 * @generated
	 * @ordered
	 */
	protected boolean temperature = TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.TEMPERATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TEMPERATURE__MODEL, oldModel,
					model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(boolean newTemperature) {
		boolean oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.TEMPERATURE__TEMPERATURE,
					oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Vis4bridgePackage.TEMPERATURE__MODEL:
			return getModel();
		case Vis4bridgePackage.TEMPERATURE__TEMPERATURE:
			return isTemperature();
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
		case Vis4bridgePackage.TEMPERATURE__MODEL:
			setModel((String) newValue);
			return;
		case Vis4bridgePackage.TEMPERATURE__TEMPERATURE:
			setTemperature((Boolean) newValue);
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
		case Vis4bridgePackage.TEMPERATURE__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case Vis4bridgePackage.TEMPERATURE__TEMPERATURE:
			setTemperature(TEMPERATURE_EDEFAULT);
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
		case Vis4bridgePackage.TEMPERATURE__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case Vis4bridgePackage.TEMPERATURE__TEMPERATURE:
			return temperature != TEMPERATURE_EDEFAULT;
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
		result.append(", temperature: ");
		result.append(temperature);
		result.append(')');
		return result.toString();
	}

} //TemperatureImpl
