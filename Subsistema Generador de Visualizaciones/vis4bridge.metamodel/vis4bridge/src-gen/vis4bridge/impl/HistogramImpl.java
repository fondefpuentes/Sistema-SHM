/**
 */
package vis4bridge.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vis4bridge.Histogram;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.HistogramImpl#getBis <em>Bis</em>}</li>
 *   <li>{@link vis4bridge.impl.HistogramImpl#isBisAuto <em>Bis Auto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistogramImpl extends GraphImpl implements Histogram {
	/**
	 * The default value of the '{@link #getBis() <em>Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBis()
	 * @generated
	 * @ordered
	 */
	protected static final float BIS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBis() <em>Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBis()
	 * @generated
	 * @ordered
	 */
	protected float bis = BIS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBisAuto() <em>Bis Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBisAuto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_AUTO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBisAuto() <em>Bis Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBisAuto()
	 * @generated
	 * @ordered
	 */
	protected boolean bisAuto = BIS_AUTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.HISTOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBis() {
		return bis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBis(float newBis) {
		float oldBis = bis;
		bis = newBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.HISTOGRAM__BIS, oldBis, bis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBisAuto() {
		return bisAuto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBisAuto(boolean newBisAuto) {
		boolean oldBisAuto = bisAuto;
		bisAuto = newBisAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.HISTOGRAM__BIS_AUTO, oldBisAuto,
					bisAuto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Vis4bridgePackage.HISTOGRAM__BIS:
			return getBis();
		case Vis4bridgePackage.HISTOGRAM__BIS_AUTO:
			return isBisAuto();
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
		case Vis4bridgePackage.HISTOGRAM__BIS:
			setBis((Float) newValue);
			return;
		case Vis4bridgePackage.HISTOGRAM__BIS_AUTO:
			setBisAuto((Boolean) newValue);
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
		case Vis4bridgePackage.HISTOGRAM__BIS:
			setBis(BIS_EDEFAULT);
			return;
		case Vis4bridgePackage.HISTOGRAM__BIS_AUTO:
			setBisAuto(BIS_AUTO_EDEFAULT);
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
		case Vis4bridgePackage.HISTOGRAM__BIS:
			return bis != BIS_EDEFAULT;
		case Vis4bridgePackage.HISTOGRAM__BIS_AUTO:
			return bisAuto != BIS_AUTO_EDEFAULT;
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
		result.append(" (bis: ");
		result.append(bis);
		result.append(", bisAuto: ");
		result.append(bisAuto);
		result.append(')');
		return result.toString();
	}

} //HistogramImpl
