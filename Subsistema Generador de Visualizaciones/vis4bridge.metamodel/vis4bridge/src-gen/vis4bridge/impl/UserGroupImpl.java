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

import vis4bridge.BasicSensor;
import vis4bridge.Graph;
import vis4bridge.UserGroup;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.UserGroupImpl#getBasicsensor <em>Basicsensor</em>}</li>
 *   <li>{@link vis4bridge.impl.UserGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.impl.UserGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.impl.UserGroupImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserGroupImpl extends MinimalEObjectImpl.Container implements UserGroup {
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
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.USER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicSensor> getBasicsensor() {
		if (basicsensor == null) {
			basicsensor = new EObjectContainmentEList<BasicSensor>(BasicSensor.class, this,
					Vis4bridgePackage.USER_GROUP__BASICSENSOR);
		}
		return basicsensor;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.USER_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.USER_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject) graph;
			graph = (Graph) eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vis4bridgePackage.USER_GROUP__GRAPH,
							oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Vis4bridgePackage.USER_GROUP__GRAPH, oldGraph, newGraph);
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
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this, Vis4bridgePackage.GRAPH__USERGROUP, Graph.class,
						msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this, Vis4bridgePackage.GRAPH__USERGROUP, Graph.class,
						msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.USER_GROUP__GRAPH, newGraph,
					newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this, Vis4bridgePackage.GRAPH__USERGROUP, Graph.class,
						msgs);
			return basicSetGraph((Graph) otherEnd, msgs);
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
		case Vis4bridgePackage.USER_GROUP__BASICSENSOR:
			return ((InternalEList<?>) getBasicsensor()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			return basicSetGraph(null, msgs);
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
		case Vis4bridgePackage.USER_GROUP__BASICSENSOR:
			return getBasicsensor();
		case Vis4bridgePackage.USER_GROUP__NAME:
			return getName();
		case Vis4bridgePackage.USER_GROUP__ID:
			return getId();
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			if (resolve)
				return getGraph();
			return basicGetGraph();
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
		case Vis4bridgePackage.USER_GROUP__BASICSENSOR:
			getBasicsensor().clear();
			getBasicsensor().addAll((Collection<? extends BasicSensor>) newValue);
			return;
		case Vis4bridgePackage.USER_GROUP__NAME:
			setName((String) newValue);
			return;
		case Vis4bridgePackage.USER_GROUP__ID:
			setId((String) newValue);
			return;
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			setGraph((Graph) newValue);
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
		case Vis4bridgePackage.USER_GROUP__BASICSENSOR:
			getBasicsensor().clear();
			return;
		case Vis4bridgePackage.USER_GROUP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Vis4bridgePackage.USER_GROUP__ID:
			setId(ID_EDEFAULT);
			return;
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			setGraph((Graph) null);
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
		case Vis4bridgePackage.USER_GROUP__BASICSENSOR:
			return basicsensor != null && !basicsensor.isEmpty();
		case Vis4bridgePackage.USER_GROUP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Vis4bridgePackage.USER_GROUP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Vis4bridgePackage.USER_GROUP__GRAPH:
			return graph != null;
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
		result.append(')');
		return result.toString();
	}

} //UserGroupImpl
