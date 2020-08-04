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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vis4bridge.BasicSensor;
import vis4bridge.Graph;
import vis4bridge.GraphCategory;
import vis4bridge.UserGroup;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.GraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.impl.GraphImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link vis4bridge.impl.GraphImpl#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.impl.GraphImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link vis4bridge.impl.GraphImpl#getUsergroup <em>Usergroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
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
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicSensor> sensor;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphCategory> category;

	/**
	 * The cached value of the '{@link #getUsergroup() <em>Usergroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsergroup()
	 * @generated
	 * @ordered
	 */
	protected UserGroup usergroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.GRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicSensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectWithInverseResolvingEList.ManyInverse<BasicSensor>(BasicSensor.class, this,
					Vis4bridgePackage.GRAPH__SENSOR, Vis4bridgePackage.BASIC_SENSOR__GRAPH);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.GRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphCategory> getCategory() {
		if (category == null) {
			category = new EDataTypeUniqueEList<GraphCategory>(GraphCategory.class, this,
					Vis4bridgePackage.GRAPH__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup getUsergroup() {
		if (usergroup != null && usergroup.eIsProxy()) {
			InternalEObject oldUsergroup = (InternalEObject) usergroup;
			usergroup = (UserGroup) eResolveProxy(oldUsergroup);
			if (usergroup != oldUsergroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vis4bridgePackage.GRAPH__USERGROUP,
							oldUsergroup, usergroup));
			}
		}
		return usergroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup basicGetUsergroup() {
		return usergroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsergroup(UserGroup newUsergroup, NotificationChain msgs) {
		UserGroup oldUsergroup = usergroup;
		usergroup = newUsergroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Vis4bridgePackage.GRAPH__USERGROUP, oldUsergroup, newUsergroup);
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
	public void setUsergroup(UserGroup newUsergroup) {
		if (newUsergroup != usergroup) {
			NotificationChain msgs = null;
			if (usergroup != null)
				msgs = ((InternalEObject) usergroup).eInverseRemove(this, Vis4bridgePackage.USER_GROUP__GRAPH,
						UserGroup.class, msgs);
			if (newUsergroup != null)
				msgs = ((InternalEObject) newUsergroup).eInverseAdd(this, Vis4bridgePackage.USER_GROUP__GRAPH,
						UserGroup.class, msgs);
			msgs = basicSetUsergroup(newUsergroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.GRAPH__USERGROUP, newUsergroup,
					newUsergroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.GRAPH__SENSOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSensor()).basicAdd(otherEnd, msgs);
		case Vis4bridgePackage.GRAPH__USERGROUP:
			if (usergroup != null)
				msgs = ((InternalEObject) usergroup).eInverseRemove(this, Vis4bridgePackage.USER_GROUP__GRAPH,
						UserGroup.class, msgs);
			return basicSetUsergroup((UserGroup) otherEnd, msgs);
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
		case Vis4bridgePackage.GRAPH__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.GRAPH__USERGROUP:
			return basicSetUsergroup(null, msgs);
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
		case Vis4bridgePackage.GRAPH__NAME:
			return getName();
		case Vis4bridgePackage.GRAPH__SENSOR:
			return getSensor();
		case Vis4bridgePackage.GRAPH__ID:
			return getId();
		case Vis4bridgePackage.GRAPH__CATEGORY:
			return getCategory();
		case Vis4bridgePackage.GRAPH__USERGROUP:
			if (resolve)
				return getUsergroup();
			return basicGetUsergroup();
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
		case Vis4bridgePackage.GRAPH__NAME:
			setName((String) newValue);
			return;
		case Vis4bridgePackage.GRAPH__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends BasicSensor>) newValue);
			return;
		case Vis4bridgePackage.GRAPH__ID:
			setId((String) newValue);
			return;
		case Vis4bridgePackage.GRAPH__CATEGORY:
			getCategory().clear();
			getCategory().addAll((Collection<? extends GraphCategory>) newValue);
			return;
		case Vis4bridgePackage.GRAPH__USERGROUP:
			setUsergroup((UserGroup) newValue);
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
		case Vis4bridgePackage.GRAPH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Vis4bridgePackage.GRAPH__SENSOR:
			getSensor().clear();
			return;
		case Vis4bridgePackage.GRAPH__ID:
			setId(ID_EDEFAULT);
			return;
		case Vis4bridgePackage.GRAPH__CATEGORY:
			getCategory().clear();
			return;
		case Vis4bridgePackage.GRAPH__USERGROUP:
			setUsergroup((UserGroup) null);
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
		case Vis4bridgePackage.GRAPH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Vis4bridgePackage.GRAPH__SENSOR:
			return sensor != null && !sensor.isEmpty();
		case Vis4bridgePackage.GRAPH__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Vis4bridgePackage.GRAPH__CATEGORY:
			return category != null && !category.isEmpty();
		case Vis4bridgePackage.GRAPH__USERGROUP:
			return usergroup != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
