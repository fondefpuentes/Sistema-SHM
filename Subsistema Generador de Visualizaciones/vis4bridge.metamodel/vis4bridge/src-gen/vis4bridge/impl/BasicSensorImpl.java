/**
 */
package vis4bridge.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vis4bridge.BasicSensor;
import vis4bridge.Card;
import vis4bridge.Graph;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.BasicSensorImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link vis4bridge.impl.BasicSensorImpl#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasicSensorImpl extends SensorImpl implements BasicSensor {
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> graph;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected EList<Card> card;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.BASIC_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getGraph() {
		if (graph == null) {
			graph = new EObjectWithInverseResolvingEList.ManyInverse<Graph>(Graph.class, this,
					Vis4bridgePackage.BASIC_SENSOR__GRAPH, Vis4bridgePackage.GRAPH__SENSOR);
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCard() {
		if (card == null) {
			card = new EObjectWithInverseResolvingEList<Card>(Card.class, this, Vis4bridgePackage.BASIC_SENSOR__CARD,
					Vis4bridgePackage.CARD__BASICSENSOR);
		}
		return card;
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGraph()).basicAdd(otherEnd, msgs);
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCard()).basicAdd(otherEnd, msgs);
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			return ((InternalEList<?>) getGraph()).basicRemove(otherEnd, msgs);
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			return ((InternalEList<?>) getCard()).basicRemove(otherEnd, msgs);
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			return getGraph();
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			return getCard();
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			getGraph().clear();
			getGraph().addAll((Collection<? extends Graph>) newValue);
			return;
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			getCard().clear();
			getCard().addAll((Collection<? extends Card>) newValue);
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			getGraph().clear();
			return;
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			getCard().clear();
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
		case Vis4bridgePackage.BASIC_SENSOR__GRAPH:
			return graph != null && !graph.isEmpty();
		case Vis4bridgePackage.BASIC_SENSOR__CARD:
			return card != null && !card.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicSensorImpl
