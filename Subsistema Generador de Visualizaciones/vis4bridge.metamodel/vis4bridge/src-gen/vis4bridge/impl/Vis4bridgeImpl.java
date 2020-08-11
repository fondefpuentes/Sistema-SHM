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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vis4bridge.DAQ;
import vis4bridge.Sensor;
import vis4bridge.UserGroup;
import vis4bridge.View;
import vis4bridge.Vis4bridge;
import vis4bridge.Vis4bridgePackage;
import vis4bridge.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vis4bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getView <em>View</em>}</li>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getDaq <em>Daq</em>}</li>
 *   <li>{@link vis4bridge.impl.Vis4bridgeImpl#getUsergroup <em>Usergroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vis4bridgeImpl extends MinimalEObjectImpl.Container implements Vis4bridge {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualization> visualization;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getDaq() <em>Daq</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaq()
	 * @generated
	 * @ordered
	 */
	protected EList<DAQ> daq;

	/**
	 * The cached value of the '{@link #getUsergroup() <em>Usergroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsergroup()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> usergroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vis4bridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.VIS4BRIDGE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.VIS4BRIDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, Vis4bridgePackage.VIS4BRIDGE__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAQ> getDaq() {
		if (daq == null) {
			daq = new EObjectContainmentEList<DAQ>(DAQ.class, this, Vis4bridgePackage.VIS4BRIDGE__DAQ);
		}
		return daq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getUsergroup() {
		if (usergroup == null) {
			usergroup = new EObjectContainmentEList<UserGroup>(UserGroup.class, this,
					Vis4bridgePackage.VIS4BRIDGE__USERGROUP);
		}
		return usergroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualization> getVisualization() {
		if (visualization == null) {
			visualization = new EObjectContainmentEList<Visualization>(Visualization.class, this,
					Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION);
		}
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<View>(View.class, this, Vis4bridgePackage.VIS4BRIDGE__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION:
			return ((InternalEList<?>) getVisualization()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIS4BRIDGE__VIEW:
			return ((InternalEList<?>) getView()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIS4BRIDGE__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIS4BRIDGE__DAQ:
			return ((InternalEList<?>) getDaq()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIS4BRIDGE__USERGROUP:
			return ((InternalEList<?>) getUsergroup()).basicRemove(otherEnd, msgs);
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
		case Vis4bridgePackage.VIS4BRIDGE__NAME:
			return getName();
		case Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION:
			return getVisualization();
		case Vis4bridgePackage.VIS4BRIDGE__VIEW:
			return getView();
		case Vis4bridgePackage.VIS4BRIDGE__SENSOR:
			return getSensor();
		case Vis4bridgePackage.VIS4BRIDGE__DAQ:
			return getDaq();
		case Vis4bridgePackage.VIS4BRIDGE__USERGROUP:
			return getUsergroup();
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
		case Vis4bridgePackage.VIS4BRIDGE__NAME:
			setName((String) newValue);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION:
			getVisualization().clear();
			getVisualization().addAll((Collection<? extends Visualization>) newValue);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__VIEW:
			getView().clear();
			getView().addAll((Collection<? extends View>) newValue);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__DAQ:
			getDaq().clear();
			getDaq().addAll((Collection<? extends DAQ>) newValue);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__USERGROUP:
			getUsergroup().clear();
			getUsergroup().addAll((Collection<? extends UserGroup>) newValue);
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
		case Vis4bridgePackage.VIS4BRIDGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION:
			getVisualization().clear();
			return;
		case Vis4bridgePackage.VIS4BRIDGE__VIEW:
			getView().clear();
			return;
		case Vis4bridgePackage.VIS4BRIDGE__SENSOR:
			getSensor().clear();
			return;
		case Vis4bridgePackage.VIS4BRIDGE__DAQ:
			getDaq().clear();
			return;
		case Vis4bridgePackage.VIS4BRIDGE__USERGROUP:
			getUsergroup().clear();
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
		case Vis4bridgePackage.VIS4BRIDGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Vis4bridgePackage.VIS4BRIDGE__VISUALIZATION:
			return visualization != null && !visualization.isEmpty();
		case Vis4bridgePackage.VIS4BRIDGE__VIEW:
			return view != null && !view.isEmpty();
		case Vis4bridgePackage.VIS4BRIDGE__SENSOR:
			return sensor != null && !sensor.isEmpty();
		case Vis4bridgePackage.VIS4BRIDGE__DAQ:
			return daq != null && !daq.isEmpty();
		case Vis4bridgePackage.VIS4BRIDGE__USERGROUP:
			return usergroup != null && !usergroup.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Vis4bridgeImpl
