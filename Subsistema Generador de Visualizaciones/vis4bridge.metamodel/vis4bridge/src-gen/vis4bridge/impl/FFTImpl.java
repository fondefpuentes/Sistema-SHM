/**
 */
package vis4bridge.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vis4bridge.FFT;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FFT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.FFTImpl#isLowPass <em>Low Pass</em>}</li>
 *   <li>{@link vis4bridge.impl.FFTImpl#isHighPass <em>High Pass</em>}</li>
 *   <li>{@link vis4bridge.impl.FFTImpl#isBandPass <em>Band Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FFTImpl extends FilterImpl implements FFT {
	/**
	 * The default value of the '{@link #isLowPass() <em>Low Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowPass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOW_PASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLowPass() <em>Low Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowPass()
	 * @generated
	 * @ordered
	 */
	protected boolean lowPass = LOW_PASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHighPass() <em>High Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighPass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGH_PASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHighPass() <em>High Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighPass()
	 * @generated
	 * @ordered
	 */
	protected boolean highPass = HIGH_PASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBandPass() <em>Band Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBandPass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAND_PASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBandPass() <em>Band Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBandPass()
	 * @generated
	 * @ordered
	 */
	protected boolean bandPass = BAND_PASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FFTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.FFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLowPass() {
		return lowPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowPass(boolean newLowPass) {
		boolean oldLowPass = lowPass;
		lowPass = newLowPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.FFT__LOW_PASS, oldLowPass,
					lowPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHighPass() {
		return highPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighPass(boolean newHighPass) {
		boolean oldHighPass = highPass;
		highPass = newHighPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.FFT__HIGH_PASS, oldHighPass,
					highPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBandPass() {
		return bandPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandPass(boolean newBandPass) {
		boolean oldBandPass = bandPass;
		bandPass = newBandPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.FFT__BAND_PASS, oldBandPass,
					bandPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Vis4bridgePackage.FFT__LOW_PASS:
			return isLowPass();
		case Vis4bridgePackage.FFT__HIGH_PASS:
			return isHighPass();
		case Vis4bridgePackage.FFT__BAND_PASS:
			return isBandPass();
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
		case Vis4bridgePackage.FFT__LOW_PASS:
			setLowPass((Boolean) newValue);
			return;
		case Vis4bridgePackage.FFT__HIGH_PASS:
			setHighPass((Boolean) newValue);
			return;
		case Vis4bridgePackage.FFT__BAND_PASS:
			setBandPass((Boolean) newValue);
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
		case Vis4bridgePackage.FFT__LOW_PASS:
			setLowPass(LOW_PASS_EDEFAULT);
			return;
		case Vis4bridgePackage.FFT__HIGH_PASS:
			setHighPass(HIGH_PASS_EDEFAULT);
			return;
		case Vis4bridgePackage.FFT__BAND_PASS:
			setBandPass(BAND_PASS_EDEFAULT);
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
		case Vis4bridgePackage.FFT__LOW_PASS:
			return lowPass != LOW_PASS_EDEFAULT;
		case Vis4bridgePackage.FFT__HIGH_PASS:
			return highPass != HIGH_PASS_EDEFAULT;
		case Vis4bridgePackage.FFT__BAND_PASS:
			return bandPass != BAND_PASS_EDEFAULT;
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
		result.append(" (LowPass: ");
		result.append(lowPass);
		result.append(", HighPass: ");
		result.append(highPass);
		result.append(", BandPass: ");
		result.append(bandPass);
		result.append(')');
		return result.toString();
	}

} //FFTImpl
