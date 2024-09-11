/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jeu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getDeck <em>Deck</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getPileDefausse <em>Pile Defausse</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getCreatureActive <em>Creature Active</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getBanc <em>Banc</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getCarteRecompense <em>Carte Recompense</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenJeuImpl extends MinimalEObjectImpl.Container implements Jeu {
	/**
	 * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected String pseudo = PSEUDO_EDEFAULT;

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
	 * The cached value of the '{@link #getMain() <em>Main</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected EList<Carte> main;

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
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPseudo(String newPseudo) {
		String oldPseudo = pseudo;
		pseudo = newPseudo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.JEU__PSEUDO, oldPseudo, pseudo));
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
	public EList<Carte> getMain() {
		if (main == null) {
			main = new EObjectResolvingEList<Carte>(Carte.class, this, GenModelPackage.JEU__MAIN);
		}
		return main;
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
	public Carte piocher() {
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
	public boolean ajoutCarteBase(Carte carteCreatureBase) {
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
	public boolean faireEvoluer(Carte carteCreatureInf, Carte carteCreatureSup) {
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
	public boolean ajoutEnergie(Carte carteEnergie) {
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
	public boolean utiliserCarteDresseur(Carte carteDresseur) {
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
	public boolean battreRetraite(Carte carteCreatureRemplaçante) {
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
	public EList<Integer> attaquer() {
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
	public void ajoutCarteMain(Carte carte) {
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
			case GenModelPackage.JEU__PSEUDO:
				return getPseudo();
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
			case GenModelPackage.JEU__MAIN:
				return getMain();
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
			case GenModelPackage.JEU__PSEUDO:
				setPseudo((String)newValue);
				return;
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
			case GenModelPackage.JEU__MAIN:
				getMain().clear();
				getMain().addAll((Collection<? extends Carte>)newValue);
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
			case GenModelPackage.JEU__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
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
			case GenModelPackage.JEU__MAIN:
				getMain().clear();
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
			case GenModelPackage.JEU__PSEUDO:
				return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
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
			case GenModelPackage.JEU__MAIN:
				return main != null && !main.isEmpty();
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
			case GenModelPackage.JEU___PIOCHER:
				return piocher();
			case GenModelPackage.JEU___AJOUT_CARTE_BASE__GENCARTE:
				return ajoutCarteBase((Carte)arguments.get(0));
			case GenModelPackage.JEU___FAIRE_EVOLUER__GENCARTE_GENCARTE:
				return faireEvoluer((Carte)arguments.get(0), (Carte)arguments.get(1));
			case GenModelPackage.JEU___AJOUT_ENERGIE__GENCARTE:
				return ajoutEnergie((Carte)arguments.get(0));
			case GenModelPackage.JEU___UTILISER_CARTE_DRESSEUR__GENCARTE:
				return utiliserCarteDresseur((Carte)arguments.get(0));
			case GenModelPackage.JEU___BATTRE_RETRAITE__GENCARTE:
				return battreRetraite((Carte)arguments.get(0));
			case GenModelPackage.JEU___ATTAQUER:
				return attaquer();
			case GenModelPackage.JEU___AJOUT_CARTE_MAIN__GENCARTE:
				ajoutCarteMain((Carte)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pseudo: ");
		result.append(pseudo);
		result.append(')');
		return result.toString();
	}

} //GenJeuImpl
