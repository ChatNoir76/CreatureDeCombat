/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Jeu;

import java.lang.reflect.InvocationTargetException;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jeu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl#getDeck <em>Deck</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl#getPileDefausse <em>Pile Defausse</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl#getCreatureActive <em>Creature Active</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl#getBanc <em>Banc</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl#getCarteRecompense <em>Carte Recompense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenJeuImpl extends MinimalEObjectImpl.Container implements Jeu {
	/**
	 * The cached value of the '{@link #getDeck() <em>Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeck()
	 * @generated
	 * @ordered
	 */
	protected Deck deck;

	/**
	 * The cached value of the '{@link #getPileDefausse() <em>Pile Defausse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPileDefausse()
	 * @generated
	 * @ordered
	 */
	protected EList<Carte> pileDefausse;

	/**
	 * The cached value of the '{@link #getCreatureActive() <em>Creature Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatureActive()
	 * @generated
	 * @ordered
	 */
	protected Creature creatureActive;

	/**
	 * The cached value of the '{@link #getBanc() <em>Banc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBanc()
	 * @generated
	 * @ordered
	 */
	protected EList<Creature> banc;

	/**
	 * The cached value of the '{@link #getCarteRecompense() <em>Carte Recompense</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarteRecompense()
	 * @generated
	 * @ordered
	 */
	protected EList<Carte> carteRecompense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenJeuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.JEU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deck getDeck() {
		return deck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeck(Deck newDeck, NotificationChain msgs) {
		Deck oldDeck = deck;
		deck = newDeck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenModelPackage.JEU__DECK, oldDeck, newDeck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeck(Deck newDeck) {
		if (newDeck != deck) {
			NotificationChain msgs = null;
			if (deck != null)
				msgs = ((InternalEObject)deck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.JEU__DECK, null, msgs);
			if (newDeck != null)
				msgs = ((InternalEObject)newDeck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.JEU__DECK, null, msgs);
			msgs = basicSetDeck(newDeck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.JEU__DECK, newDeck, newDeck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Carte> getPileDefausse() {
		if (pileDefausse == null) {
			pileDefausse = new EObjectContainmentEList<Carte>(Carte.class, this, GenModelPackage.JEU__PILE_DEFAUSSE);
		}
		return pileDefausse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Creature getCreatureActive() {
		return creatureActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatureActive(Creature newCreatureActive, NotificationChain msgs) {
		Creature oldCreatureActive = creatureActive;
		creatureActive = newCreatureActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenModelPackage.JEU__CREATURE_ACTIVE, oldCreatureActive, newCreatureActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatureActive(Creature newCreatureActive) {
		if (newCreatureActive != creatureActive) {
			NotificationChain msgs = null;
			if (creatureActive != null)
				msgs = ((InternalEObject)creatureActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.JEU__CREATURE_ACTIVE, null, msgs);
			if (newCreatureActive != null)
				msgs = ((InternalEObject)newCreatureActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.JEU__CREATURE_ACTIVE, null, msgs);
			msgs = basicSetCreatureActive(newCreatureActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.JEU__CREATURE_ACTIVE, newCreatureActive, newCreatureActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Creature> getBanc() {
		if (banc == null) {
			banc = new EObjectContainmentEList<Creature>(Creature.class, this, GenModelPackage.JEU__BANC);
		}
		return banc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Carte> getCarteRecompense() {
		if (carteRecompense == null) {
			carteRecompense = new EObjectContainmentEList<Carte>(Carte.class, this, GenModelPackage.JEU__CARTE_RECOMPENSE);
		}
		return carteRecompense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void finTour() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void finOption() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void abandonner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenModelPackage.JEU__DECK:
				return basicSetDeck(null, msgs);
			case GenModelPackage.JEU__PILE_DEFAUSSE:
				return ((InternalEList<?>)getPileDefausse()).basicRemove(otherEnd, msgs);
			case GenModelPackage.JEU__CREATURE_ACTIVE:
				return basicSetCreatureActive(null, msgs);
			case GenModelPackage.JEU__BANC:
				return ((InternalEList<?>)getBanc()).basicRemove(otherEnd, msgs);
			case GenModelPackage.JEU__CARTE_RECOMPENSE:
				return ((InternalEList<?>)getCarteRecompense()).basicRemove(otherEnd, msgs);
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
			case GenModelPackage.JEU__DECK:
				return getDeck();
			case GenModelPackage.JEU__PILE_DEFAUSSE:
				return getPileDefausse();
			case GenModelPackage.JEU__CREATURE_ACTIVE:
				return getCreatureActive();
			case GenModelPackage.JEU__BANC:
				return getBanc();
			case GenModelPackage.JEU__CARTE_RECOMPENSE:
				return getCarteRecompense();
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
			case GenModelPackage.JEU__DECK:
				setDeck((Deck)newValue);
				return;
			case GenModelPackage.JEU__PILE_DEFAUSSE:
				getPileDefausse().clear();
				getPileDefausse().addAll((Collection<? extends Carte>)newValue);
				return;
			case GenModelPackage.JEU__CREATURE_ACTIVE:
				setCreatureActive((Creature)newValue);
				return;
			case GenModelPackage.JEU__BANC:
				getBanc().clear();
				getBanc().addAll((Collection<? extends Creature>)newValue);
				return;
			case GenModelPackage.JEU__CARTE_RECOMPENSE:
				getCarteRecompense().clear();
				getCarteRecompense().addAll((Collection<? extends Carte>)newValue);
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
			case GenModelPackage.JEU__DECK:
				setDeck((Deck)null);
				return;
			case GenModelPackage.JEU__PILE_DEFAUSSE:
				getPileDefausse().clear();
				return;
			case GenModelPackage.JEU__CREATURE_ACTIVE:
				setCreatureActive((Creature)null);
				return;
			case GenModelPackage.JEU__BANC:
				getBanc().clear();
				return;
			case GenModelPackage.JEU__CARTE_RECOMPENSE:
				getCarteRecompense().clear();
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
			case GenModelPackage.JEU__DECK:
				return deck != null;
			case GenModelPackage.JEU__PILE_DEFAUSSE:
				return pileDefausse != null && !pileDefausse.isEmpty();
			case GenModelPackage.JEU__CREATURE_ACTIVE:
				return creatureActive != null;
			case GenModelPackage.JEU__BANC:
				return banc != null && !banc.isEmpty();
			case GenModelPackage.JEU__CARTE_RECOMPENSE:
				return carteRecompense != null && !carteRecompense.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GenModelPackage.JEU___FIN_TOUR:
				finTour();
				return null;
			case GenModelPackage.JEU___FIN_OPTION:
				finOption();
				return null;
			case GenModelPackage.JEU___ABANDONNER:
				abandonner();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenJeuImpl
