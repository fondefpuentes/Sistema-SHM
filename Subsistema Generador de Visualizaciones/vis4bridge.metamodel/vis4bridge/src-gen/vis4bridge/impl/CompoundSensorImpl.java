/**
 */
package vis4bridge.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vis4bridge.BasicSensor;
import vis4bridge.CompoundSensor;
import vis4bridge.View;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.CompoundSensorImpl#getBasicsensor <em>Basicsensor</em>}</li>
 *   <li>{@link vis4bridge.impl.CompoundSensorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link vis4bridge.impl.CompoundSensorImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompoundSensorImpl extends SensorImpl implements CompoundSensor {
	/**
	 * The cached value of the '{@link #getBasicsensor() <em>Basicsensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicsensor()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicSensor> basicsensor;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.COMPOUND_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicSensor> getBasicsensor() {
		if (basicsensor == null) {
			basicsensor = new EObjectContainmentEList<BasicSensor>(BasicSensor.class, this,
					Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR);
		}
		return basicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.COMPOUND_SENSOR__LENGTH, oldLength,
					length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject) view;
			view = (View) eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vis4bridgePackage.COMPOUND_SENSOR__VIEW,
							oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(View newView, NotificationChain msgs) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Vis4bridgePackage.COMPOUND_SENSOR__VIEW, oldView, newView);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(View newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject) view).eInverseRemove(this, Vis4bridgePackage.VIEW__COMPOUNDSENSOR, View.class,
						msgs);
			if (newView != null)
				msgs = ((InternalEObject) newView).eInverseAdd(this, Vis4bridgePackage.VIEW__COMPOUNDSENSOR, View.class,
						msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.COMPOUND_SENSOR__VIEW, newView,
					newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			if (view != null)
				msgs = ((InternalEObject) view).eInverseRemove(this, Vis4bridgePackage.VIEW__COMPOUNDSENSOR, View.class,
						msgs);
			return basicSetView((View) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR:
			return ((InternalEList<?>) getBasicsensor()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			return basicSetView(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR:
			return getBasicsensor();
		case Vis4bridgePackage.COMPOUND_SENSOR__LENGTH:
			return getLength();
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			if (resolve)
				return getView();
			return basicGetView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR:
			getBasicsensor().clear();
			getBasicsensor().addAll((Collection<? extends BasicSensor>) newValue);
			return;
		case Vis4bridgePackage.COMPOUND_SENSOR__LENGTH:
			setLength((Integer) newValue);
			return;
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			setView((View) newValue);
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
		case Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR:
			getBasicsensor().clear();
			return;
		case Vis4bridgePackage.COMPOUND_SENSOR__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			setView((View) null);
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
		case Vis4bridgePackage.COMPOUND_SENSOR__BASICSENSOR:
			return basicsensor != null && !basicsensor.isEmpty();
		case Vis4bridgePackage.COMPOUND_SENSOR__LENGTH:
			return length != LENGTH_EDEFAULT;
		case Vis4bridgePackage.COMPOUND_SENSOR__VIEW:
			return view != null;
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
		result.append(" (length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //CompoundSensorImpl
