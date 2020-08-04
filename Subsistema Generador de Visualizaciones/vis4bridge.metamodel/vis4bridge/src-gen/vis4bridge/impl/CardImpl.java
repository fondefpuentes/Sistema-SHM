/**
 */
package vis4bridge.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vis4bridge.BasicSensor;
import vis4bridge.Card;
import vis4bridge.CardType;
import vis4bridge.Vis4bridgePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vis4bridge.impl.CardImpl#getName <em>Name</em>}</li>
 *   <li>{@link vis4bridge.impl.CardImpl#getId <em>Id</em>}</li>
 *   <li>{@link vis4bridge.impl.CardImpl#getType <em>Type</em>}</li>
 *   <li>{@link vis4bridge.impl.CardImpl#getBasicsensor <em>Basicsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CardType TYPE_EDEFAULT = CardType.AVERAGE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CardType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBasicsensor() <em>Basicsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicsensor()
	 * @generated
	 * @ordered
	 */
	protected BasicSensor basicsensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vis4bridgePackage.Literals.CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.CARD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.CARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CardType newType) {
		CardType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.CARD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSensor getBasicsensor() {
		if (basicsensor != null && basicsensor.eIsProxy()) {
			InternalEObject oldBasicsensor = (InternalEObject) basicsensor;
			basicsensor = (BasicSensor) eResolveProxy(oldBasicsensor);
			if (basicsensor != oldBasicsensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Vis4bridgePackage.CARD__BASICSENSOR,
							oldBasicsensor, basicsensor));
			}
		}
		return basicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSensor basicGetBasicsensor() {
		return basicsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicsensor(BasicSensor newBasicsensor, NotificationChain msgs) {
		BasicSensor oldBasicsensor = basicsensor;
		basicsensor = newBasicsensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Vis4bridgePackage.CARD__BASICSENSOR, oldBasicsensor, newBasicsensor);
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
	public void setBasicsensor(BasicSensor newBasicsensor) {
		if (newBasicsensor != basicsensor) {
			NotificationChain msgs = null;
			if (basicsensor != null)
				msgs = ((InternalEObject) basicsensor).eInverseRemove(this, Vis4bridgePackage.BASIC_SENSOR__CARD,
						BasicSensor.class, msgs);
			if (newBasicsensor != null)
				msgs = ((InternalEObject) newBasicsensor).eInverseAdd(this, Vis4bridgePackage.BASIC_SENSOR__CARD,
						BasicSensor.class, msgs);
			msgs = basicSetBasicsensor(newBasicsensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Vis4bridgePackage.CARD__BASICSENSOR, newBasicsensor,
					newBasicsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Vis4bridgePackage.CARD__BASICSENSOR:
			if (basicsensor != null)
				msgs = ((InternalEObject) basicsensor).eInverseRemove(this, Vis4bridgePackage.BASIC_SENSOR__CARD,
						BasicSensor.class, msgs);
			return basicSetBasicsensor((BasicSensor) otherEnd, msgs);
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
		case Vis4bridgePackage.CARD__BASICSENSOR:
			return basicSetBasicsensor(null, msgs);
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
		case Vis4bridgePackage.CARD__NAME:
			return getName();
		case Vis4bridgePackage.CARD__ID:
			return getId();
		case Vis4bridgePackage.CARD__TYPE:
			return getType();
		case Vis4bridgePackage.CARD__BASICSENSOR:
			if (resolve)
				return getBasicsensor();
			return basicGetBasicsensor();
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
		case Vis4bridgePackage.CARD__NAME:
			setName((String) newValue);
			return;
		case Vis4bridgePackage.CARD__ID:
			setId((String) newValue);
			return;
		case Vis4bridgePackage.CARD__TYPE:
			setType((CardType) newValue);
			return;
		case Vis4bridgePackage.CARD__BASICSENSOR:
			setBasicsensor((BasicSensor) newValue);
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
		case Vis4bridgePackage.CARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Vis4bridgePackage.CARD__ID:
			setId(ID_EDEFAULT);
			return;
		case Vis4bridgePackage.CARD__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Vis4bridgePackage.CARD__BASICSENSOR:
			setBasicsensor((BasicSensor) null);
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
		case Vis4bridgePackage.CARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Vis4bridgePackage.CARD__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Vis4bridgePackage.CARD__TYPE:
			return type != TYPE_EDEFAULT;
		case Vis4bridgePackage.CARD__BASICSENSOR:
			return basicsensor != null;
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
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CardImpl
