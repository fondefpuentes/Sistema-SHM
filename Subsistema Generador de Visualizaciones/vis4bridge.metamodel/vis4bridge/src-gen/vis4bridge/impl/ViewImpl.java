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

import vis4bridge.Card;
import vis4bridge.CompoundSensor;
import vis4bridge.Filter;
import vis4bridge.Graph;
import vis4bridge.Table;
import vis4bridge.TimeRange;
import vis4bridge.View;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getTable <em>Table</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getCard <em>Card</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getCompoundsensor <em>Compoundsensor</em>}</li>
 *   <li>{@link vis4bridge.impl.ViewImpl#getTimeRange <em>Time Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
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
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> graph;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;

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
	 * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> card;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * The cached value of the '{@link #getCompoundsensor() <em>Compoundsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundsensor()
	 * @generated
	 * @ordered
	 */
	protected CompoundSensor compoundsensor;

	/**
	 * The default value of the '{@link #getTimeRange() <em>Time Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRange()
	 * @generated
	 * @ordered
	 */
	protected static final TimeRange TIME_RANGE_EDEFAULT = TimeRange.ONE_HOUR;

	/**
	 * The cached value of the '{@link #getTimeRange() <em>Time Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRange()
	 * @generated
	 * @ordered
	 */
	protected TimeRange timeRange = TIME_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getGraph() {
		if (graph == null) {
			graph = new EObjectContainmentEList<Graph>(Graph.class, this, Vis4bridgePackage.VIEW__GRAPH);
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table>(Table.class, this, Vis4bridgePackage.VIEW__TABLE);
		}
		return table;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.VIEW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCard() {
		if (card == null) {
			card = new EObjectContainmentEList<Card>(Card.class, this, Vis4bridgePackage.VIEW__CARD);
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, Vis4bridgePackage.VIEW__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundSensor getCompoundsensor() {
		if (compoundsensor != null && compoundsensor.eIsProxy()) {
			InternalEObject oldCompoundsensor = (InternalEObject) compoundsensor;
			compoundsensor = (CompoundSensor) eResolveProxy(oldCompoundsensor);
			if (compoundsensor != oldCompoundsensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vis4bridgePackage.VIEW__COMPOUNDSENSOR,
							oldCompoundsensor, compoundsensor));
			}
		}
		return compoundsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundSensor basicGetCompoundsensor() {
		return compoundsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundsensor(CompoundSensor newCompoundsensor, NotificationChain msgs) {
		CompoundSensor oldCompoundsensor = compoundsensor;
		compoundsensor = newCompoundsensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Vis4bridgePackage.VIEW__COMPOUNDSENSOR, oldCompoundsensor, newCompoundsensor);
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
	public void setCompoundsensor(CompoundSensor newCompoundsensor) {
		if (newCompoundsensor != compoundsensor) {
			NotificationChain msgs = null;
			if (compoundsensor != null)
				msgs = ((InternalEObject) compoundsensor).eInverseRemove(this, Vis4bridgePackage.COMPOUND_SENSOR__VIEW,
						CompoundSensor.class, msgs);
			if (newCompoundsensor != null)
				msgs = ((InternalEObject) newCompoundsensor).eInverseAdd(this, Vis4bridgePackage.COMPOUND_SENSOR__VIEW,
						CompoundSensor.class, msgs);
			msgs = basicSetCompoundsensor(newCompoundsensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.VIEW__COMPOUNDSENSOR,
					newCompoundsensor, newCompoundsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRange getTimeRange() {
		return timeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRange(TimeRange newTimeRange) {
		TimeRange oldTimeRange = timeRange;
		timeRange = newTimeRange == null ? TIME_RANGE_EDEFAULT : newTimeRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.VIEW__TIME_RANGE, oldTimeRange,
					timeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			if (compoundsensor != null)
				msgs = ((InternalEObject) compoundsensor).eInverseRemove(this, Vis4bridgePackage.COMPOUND_SENSOR__VIEW,
						CompoundSensor.class, msgs);
			return basicSetCompoundsensor((CompoundSensor) otherEnd, msgs);
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
		case Vis4bridgePackage.VIEW__GRAPH:
			return ((InternalEList<?>) getGraph()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIEW__TABLE:
			return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIEW__CARD:
			return ((InternalEList<?>) getCard()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIEW__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			return basicSetCompoundsensor(null, msgs);
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
		case Vis4bridgePackage.VIEW__NAME:
			return getName();
		case Vis4bridgePackage.VIEW__GRAPH:
			return getGraph();
		case Vis4bridgePackage.VIEW__TABLE:
			return getTable();
		case Vis4bridgePackage.VIEW__ID:
			return getId();
		case Vis4bridgePackage.VIEW__CARD:
			return getCard();
		case Vis4bridgePackage.VIEW__FILTER:
			return getFilter();
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			if (resolve)
				return getCompoundsensor();
			return basicGetCompoundsensor();
		case Vis4bridgePackage.VIEW__TIME_RANGE:
			return getTimeRange();
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
		case Vis4bridgePackage.VIEW__NAME:
			setName((String) newValue);
			return;
		case Vis4bridgePackage.VIEW__GRAPH:
			getGraph().clear();
			getGraph().addAll((Collection<? extends Graph>) newValue);
			return;
		case Vis4bridgePackage.VIEW__TABLE:
			getTable().clear();
			getTable().addAll((Collection<? extends Table>) newValue);
			return;
		case Vis4bridgePackage.VIEW__ID:
			setId((String) newValue);
			return;
		case Vis4bridgePackage.VIEW__CARD:
			getCard().clear();
			getCard().addAll((Collection<? extends Card>) newValue);
			return;
		case Vis4bridgePackage.VIEW__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends Filter>) newValue);
			return;
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			setCompoundsensor((CompoundSensor) newValue);
			return;
		case Vis4bridgePackage.VIEW__TIME_RANGE:
			setTimeRange((TimeRange) newValue);
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
		case Vis4bridgePackage.VIEW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Vis4bridgePackage.VIEW__GRAPH:
			getGraph().clear();
			return;
		case Vis4bridgePackage.VIEW__TABLE:
			getTable().clear();
			return;
		case Vis4bridgePackage.VIEW__ID:
			setId(ID_EDEFAULT);
			return;
		case Vis4bridgePackage.VIEW__CARD:
			getCard().clear();
			return;
		case Vis4bridgePackage.VIEW__FILTER:
			getFilter().clear();
			return;
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			setCompoundsensor((CompoundSensor) null);
			return;
		case Vis4bridgePackage.VIEW__TIME_RANGE:
			setTimeRange(TIME_RANGE_EDEFAULT);
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
		case Vis4bridgePackage.VIEW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Vis4bridgePackage.VIEW__GRAPH:
			return graph != null && !graph.isEmpty();
		case Vis4bridgePackage.VIEW__TABLE:
			return table != null && !table.isEmpty();
		case Vis4bridgePackage.VIEW__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Vis4bridgePackage.VIEW__CARD:
			return card != null && !card.isEmpty();
		case Vis4bridgePackage.VIEW__FILTER:
			return filter != null && !filter.isEmpty();
		case Vis4bridgePackage.VIEW__COMPOUNDSENSOR:
			return compoundsensor != null;
		case Vis4bridgePackage.VIEW__TIME_RANGE:
			return timeRange != TIME_RANGE_EDEFAULT;
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
		result.append(", timeRange: ");
		result.append(timeRange);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
