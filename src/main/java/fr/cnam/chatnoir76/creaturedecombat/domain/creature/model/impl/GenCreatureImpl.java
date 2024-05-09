/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Labelled;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;

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
 * An implementation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getEnergies <em>Energies</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getMaitre <em>Maitre</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getPv <em>Pv</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getPvInit <em>Pv Init</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getDegatDefense <em>Degat Defense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenCreatureImpl extends MinimalEObjectImpl.Container implements Creature {
	/**
	 * The cached value of the '{@link #getEnergies() <em>Energies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergies()
	 * @generated
	 * @ordered
	 */
	protected EList<Energie> energies;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Base base;

	/**
	 * The cached value of the '{@link #getEvolution() <em>Evolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolution()
	 * @generated
	 * @ordered
	 */
	protected Evolution evolution;

	/**
	 * The cached value of the '{@link #getMaitre() <em>Maitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaitre()
	 * @generated
	 * @ordered
	 */
	protected Maitre maitre;

	/**
	 * The default value of the '{@link #getPv() <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPv()
	 * @generated
	 * @ordered
	 */
	protected static final int PV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPv() <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPv()
	 * @generated
	 * @ordered
	 */
	protected int pv = PV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPvInit() <em>Pv Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPvInit()
	 * @generated
	 * @ordered
	 */
	protected static final int PV_INIT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final Categorie CATEGORIE_EDEFAULT = Categorie.CLASSIQUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenCreatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.CREATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPv() {
		return pv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPv(int newPv) {
		int oldPv = pv;
		pv = newPv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__PV, oldPv, pv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPvInit() {
		// TODO: implement this method to return the 'Pv Init' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		// TODO: implement this method to return the 'Nom' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categorie getCategorie() {
		// TODO: implement this method to return the 'Categorie' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attaque> getAttaques() {
		// TODO: implement this method to return the 'Attaques' containment reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Degat getDegatDefense() {
		// TODO: implement this method to return the 'Degat Defense' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegatDefense(Degat newDegatDefense, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Degat Defense' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Base newBase, NotificationChain msgs) {
		Base oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__BASE, oldBase, newBase);
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
	public void setBase(Base newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.CREATURE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.CREATURE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evolution getEvolution() {
		if (evolution != null && evolution.eIsProxy()) {
			InternalEObject oldEvolution = (InternalEObject)evolution;
			evolution = (Evolution)eResolveProxy(oldEvolution);
			if (evolution != oldEvolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.CREATURE__EVOLUTION, oldEvolution, evolution));
			}
		}
		return evolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evolution basicGetEvolution() {
		return evolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvolution(Evolution newEvolution) {
		Evolution oldEvolution = evolution;
		evolution = newEvolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__EVOLUTION, oldEvolution, evolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Maitre getMaitre() {
		if (maitre != null && maitre.eIsProxy()) {
			InternalEObject oldMaitre = (InternalEObject)maitre;
			maitre = (Maitre)eResolveProxy(oldMaitre);
			if (maitre != oldMaitre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.CREATURE__MAITRE, oldMaitre, maitre));
			}
		}
		return maitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maitre basicGetMaitre() {
		return maitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaitre(Maitre newMaitre) {
		Maitre oldMaitre = maitre;
		maitre = newMaitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__MAITRE, oldMaitre, maitre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Energie> getEnergies() {
		if (energies == null) {
			energies = new EObjectContainmentEList<Energie>(Energie.class, this, GenModelPackage.CREATURE__ENERGIES);
		}
		return energies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean estCompatibleEvolution(Creature creature) {
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
	public void faireEvoluer(Creature creature) {
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
	public Niveau getNiveau() {
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
	public boolean estMort() {
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
	public boolean estVisible() {
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
			case GenModelPackage.CREATURE__ENERGIES:
				return ((InternalEList<?>)getEnergies()).basicRemove(otherEnd, msgs);
			case GenModelPackage.CREATURE__BASE:
				return basicSetBase(null, msgs);
			case GenModelPackage.CREATURE__ATTAQUES:
				return ((InternalEList<?>)getAttaques()).basicRemove(otherEnd, msgs);
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				return basicSetDegatDefense(null, msgs);
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
			case GenModelPackage.CREATURE__ENERGIES:
				return getEnergies();
			case GenModelPackage.CREATURE__BASE:
				return getBase();
			case GenModelPackage.CREATURE__EVOLUTION:
				if (resolve) return getEvolution();
				return basicGetEvolution();
			case GenModelPackage.CREATURE__MAITRE:
				if (resolve) return getMaitre();
				return basicGetMaitre();
			case GenModelPackage.CREATURE__PV:
				return getPv();
			case GenModelPackage.CREATURE__PV_INIT:
				return getPvInit();
			case GenModelPackage.CREATURE__NOM:
				return getNom();
			case GenModelPackage.CREATURE__DESCRIPTION:
				return getDescription();
			case GenModelPackage.CREATURE__CATEGORIE:
				return getCategorie();
			case GenModelPackage.CREATURE__ATTAQUES:
				return getAttaques();
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				return getDegatDefense();
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
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
				getEnergies().addAll((Collection<? extends Energie>)newValue);
				return;
			case GenModelPackage.CREATURE__BASE:
				setBase((Base)newValue);
				return;
			case GenModelPackage.CREATURE__EVOLUTION:
				setEvolution((Evolution)newValue);
				return;
			case GenModelPackage.CREATURE__MAITRE:
				setMaitre((Maitre)newValue);
				return;
			case GenModelPackage.CREATURE__PV:
				setPv((Integer)newValue);
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
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
				return;
			case GenModelPackage.CREATURE__BASE:
				setBase((Base)null);
				return;
			case GenModelPackage.CREATURE__EVOLUTION:
				setEvolution((Evolution)null);
				return;
			case GenModelPackage.CREATURE__MAITRE:
				setMaitre((Maitre)null);
				return;
			case GenModelPackage.CREATURE__PV:
				setPv(PV_EDEFAULT);
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
			case GenModelPackage.CREATURE__ENERGIES:
				return energies != null && !energies.isEmpty();
			case GenModelPackage.CREATURE__BASE:
				return base != null;
			case GenModelPackage.CREATURE__EVOLUTION:
				return evolution != null;
			case GenModelPackage.CREATURE__MAITRE:
				return maitre != null;
			case GenModelPackage.CREATURE__PV:
				return pv != PV_EDEFAULT;
			case GenModelPackage.CREATURE__PV_INIT:
				return getPvInit() != PV_INIT_EDEFAULT;
			case GenModelPackage.CREATURE__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case GenModelPackage.CREATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GenModelPackage.CREATURE__CATEGORIE:
				return getCategorie() != CATEGORIE_EDEFAULT;
			case GenModelPackage.CREATURE__ATTAQUES:
				return !getAttaques().isEmpty();
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				return getDegatDefense() != null;
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
			case GenModelPackage.CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE:
				return estCompatibleEvolution((Creature)arguments.get(0));
			case GenModelPackage.CREATURE___FAIRE_EVOLUER__GENCREATURE:
				faireEvoluer((Creature)arguments.get(0));
				return null;
			case GenModelPackage.CREATURE___GET_NIVEAU:
				return getNiveau();
			case GenModelPackage.CREATURE___EST_MORT:
				return estMort();
			case GenModelPackage.CREATURE___EST_VISIBLE:
				return estVisible();
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
		result.append(" (pv: ");
		result.append(pv);
		result.append(')');
		return result.toString();
	}

} //GenCreatureImpl
