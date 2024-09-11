/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;

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
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl#getPv <em>Pv</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl#getEnergies <em>Energies</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl#getMaitre <em>Maitre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenCreatureImpl extends MinimalEObjectImpl.Container implements Creature {
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
	protected CreatureComponent base;

	/**
	 * The cached value of the '{@link #getEvolution() <em>Evolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolution()
	 * @generated
	 * @ordered
	 */
	protected CreatureComponent evolution;

	/**
	 * The cached value of the '{@link #getMaitre() <em>Maitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaitre()
	 * @generated
	 * @ordered
	 */
	protected CreatureComponent maitre;

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
	public int getId() {
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
	public int getPv() {
		// TODO: implement this method to return the 'Pv' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPv(int newPv) {
		// TODO: implement this method to set the 'Pv' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public CreatureComponent getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(CreatureComponent newBase, NotificationChain msgs) {
		CreatureComponent oldBase = base;
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
	public CreatureComponent getEvolution() {
		if (evolution != null && evolution.eIsProxy()) {
			InternalEObject oldEvolution = (InternalEObject)evolution;
			evolution = (CreatureComponent)eResolveProxy(oldEvolution);
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
	public CreatureComponent basicGetEvolution() {
		return evolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreatureComponent getMaitre() {
		if (maitre != null && maitre.eIsProxy()) {
			InternalEObject oldMaitre = (InternalEObject)maitre;
			maitre = (CreatureComponent)eResolveProxy(oldMaitre);
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
	public CreatureComponent basicGetMaitre() {
		return maitre;
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
	public boolean faireEvoluer(Creature creature) {
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
	public void initialize(CreatureComponent creatureComponent) {
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
	public void recoitDegat(int degat) {
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
	public void recoitSoin(int soin) {
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
	public int getPvInit() {
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
	public Categorie getCategorie() {
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
	public EList<Attaque> getAttaques() {
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
	public Degat getDegatDefense() {
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
	public String getNom() {
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
	public String getDescription() {
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
	public CreatureComponent getBaseEvolution() {
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
	public CreatureComponent getActiveCreatureComponent() {
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
			case GenModelPackage.CREATURE__PV:
				return getPv();
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
			case GenModelPackage.CREATURE__PV:
				setPv((Integer)newValue);
				return;
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
				getEnergies().addAll((Collection<? extends Energie>)newValue);
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
			case GenModelPackage.CREATURE__PV:
				setPv(PV_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
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
			case GenModelPackage.CREATURE__PV:
				return getPv() != PV_EDEFAULT;
			case GenModelPackage.CREATURE__ENERGIES:
				return energies != null && !energies.isEmpty();
			case GenModelPackage.CREATURE__BASE:
				return base != null;
			case GenModelPackage.CREATURE__EVOLUTION:
				return evolution != null;
			case GenModelPackage.CREATURE__MAITRE:
				return maitre != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CreatureComponent.class) {
			switch (baseOperationID) {
				case GenModelPackage.CREATURE_COMPONENT___GET_ID: return GenModelPackage.CREATURE___GET_ID;
				case GenModelPackage.CREATURE_COMPONENT___GET_PV: return GenModelPackage.CREATURE___GET_PV;
				case GenModelPackage.CREATURE_COMPONENT___SET_PV__INT: return GenModelPackage.CREATURE___SET_PV__INT;
				case GenModelPackage.CREATURE_COMPONENT___GET_PV_INIT: return GenModelPackage.CREATURE___GET_PV_INIT;
				case GenModelPackage.CREATURE_COMPONENT___GET_CATEGORIE: return GenModelPackage.CREATURE___GET_CATEGORIE;
				case GenModelPackage.CREATURE_COMPONENT___GET_ATTAQUES: return GenModelPackage.CREATURE___GET_ATTAQUES;
				case GenModelPackage.CREATURE_COMPONENT___GET_DEGAT_DEFENSE: return GenModelPackage.CREATURE___GET_DEGAT_DEFENSE;
				case GenModelPackage.CREATURE_COMPONENT___GET_NIVEAU: return GenModelPackage.CREATURE___GET_NIVEAU;
				case GenModelPackage.CREATURE_COMPONENT___GET_NOM: return GenModelPackage.CREATURE___GET_NOM;
				case GenModelPackage.CREATURE_COMPONENT___GET_DESCRIPTION: return GenModelPackage.CREATURE___GET_DESCRIPTION;
				case GenModelPackage.CREATURE_COMPONENT___GET_BASE_EVOLUTION: return GenModelPackage.CREATURE___GET_BASE_EVOLUTION;
				case GenModelPackage.CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT: return GenModelPackage.CREATURE___GET_ACTIVE_CREATURE_COMPONENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
				return faireEvoluer((Creature)arguments.get(0));
			case GenModelPackage.CREATURE___EST_MORT:
				return estMort();
			case GenModelPackage.CREATURE___INITIALIZE__GENCREATURECOMPONENT:
				initialize((CreatureComponent)arguments.get(0));
				return null;
			case GenModelPackage.CREATURE___RECOIT_DEGAT__INT:
				recoitDegat((Integer)arguments.get(0));
				return null;
			case GenModelPackage.CREATURE___RECOIT_SOIN__INT:
				recoitSoin((Integer)arguments.get(0));
				return null;
			case GenModelPackage.CREATURE___GET_ID:
				return getId();
			case GenModelPackage.CREATURE___GET_PV_INIT:
				return getPvInit();
			case GenModelPackage.CREATURE___GET_CATEGORIE:
				return getCategorie();
			case GenModelPackage.CREATURE___GET_ATTAQUES:
				return getAttaques();
			case GenModelPackage.CREATURE___GET_DEGAT_DEFENSE:
				return getDegatDefense();
			case GenModelPackage.CREATURE___GET_NIVEAU:
				return getNiveau();
			case GenModelPackage.CREATURE___GET_NOM:
				return getNom();
			case GenModelPackage.CREATURE___GET_DESCRIPTION:
				return getDescription();
			case GenModelPackage.CREATURE___GET_BASE_EVOLUTION:
				return getBaseEvolution();
			case GenModelPackage.CREATURE___GET_ACTIVE_CREATURE_COMPONENT:
				return getActiveCreatureComponent();
			case GenModelPackage.CREATURE___EST_VISIBLE:
				return estVisible();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenCreatureImpl
