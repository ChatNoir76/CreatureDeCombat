/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getPv <em>Pv</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getPvInit <em>Pv Init</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getBase <em>Base</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getEnergies <em>Energies</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl#getDegatDefense <em>Degat Defense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenCreatureImpl extends MinimalEObjectImpl.Container implements Creature {
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
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getPvInit() <em>Pv Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPvInit()
	 * @generated
	 * @ordered
	 */
	protected int pvInit = PV_INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Creature base;

	/**
	 * The cached value of the '{@link #getAttaques() <em>Attaques</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaques()
	 * @generated
	 * @ordered
	 */
	protected EList<Attaque> attaques;

	/**
	 * The cached value of the '{@link #getEnergies() <em>Energies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergies()
	 * @generated
	 * @ordered
	 */
	protected EList<Energie> energies;

	/**
	 * The cached value of the '{@link #getDegatDefense() <em>Degat Defense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegatDefense()
	 * @generated
	 * @ordered
	 */
	protected Degat degatDefense;

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
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategorie(Categorie newCategorie) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__CATEGORIE, oldCategorie, categorie));
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
		return pvInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPvInit(int newPvInit) {
		int oldPvInit = pvInit;
		pvInit = newPvInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__PV_INIT, oldPvInit, pvInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Creature getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Creature)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.CREATURE__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creature basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Creature newBase) {
		Creature oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attaque> getAttaques() {
		if (attaques == null) {
			attaques = new EObjectResolvingEList<Attaque>(Attaque.class, this, GenModelPackage.CREATURE__ATTAQUES);
		}
		return attaques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Energie> getEnergies() {
		if (energies == null) {
			energies = new EObjectResolvingEList<Energie>(Energie.class, this, GenModelPackage.CREATURE__ENERGIES);
		}
		return energies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Degat getDegatDefense() {
		if (degatDefense != null && degatDefense.eIsProxy()) {
			InternalEObject oldDegatDefense = (InternalEObject)degatDefense;
			degatDefense = (Degat)eResolveProxy(oldDegatDefense);
			if (degatDefense != oldDegatDefense) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.CREATURE__DEGAT_DEFENSE, oldDegatDefense, degatDefense));
			}
		}
		return degatDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degat basicGetDegatDefense() {
		return degatDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegatDefense(Degat newDegatDefense) {
		Degat oldDegatDefense = degatDefense;
		degatDefense = newDegatDefense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.CREATURE__DEGAT_DEFENSE, oldDegatDefense, degatDefense));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenModelPackage.CREATURE__NOM:
				return getNom();
			case GenModelPackage.CREATURE__DESCRIPTION:
				return getDescription();
			case GenModelPackage.CREATURE__CATEGORIE:
				return getCategorie();
			case GenModelPackage.CREATURE__PV:
				return getPv();
			case GenModelPackage.CREATURE__PV_INIT:
				return getPvInit();
			case GenModelPackage.CREATURE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case GenModelPackage.CREATURE__ATTAQUES:
				return getAttaques();
			case GenModelPackage.CREATURE__ENERGIES:
				return getEnergies();
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				if (resolve) return getDegatDefense();
				return basicGetDegatDefense();
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
			case GenModelPackage.CREATURE__NOM:
				setNom((String)newValue);
				return;
			case GenModelPackage.CREATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GenModelPackage.CREATURE__CATEGORIE:
				setCategorie((Categorie)newValue);
				return;
			case GenModelPackage.CREATURE__PV:
				setPv((Integer)newValue);
				return;
			case GenModelPackage.CREATURE__PV_INIT:
				setPvInit((Integer)newValue);
				return;
			case GenModelPackage.CREATURE__BASE:
				setBase((Creature)newValue);
				return;
			case GenModelPackage.CREATURE__ATTAQUES:
				getAttaques().clear();
				getAttaques().addAll((Collection<? extends Attaque>)newValue);
				return;
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
				getEnergies().addAll((Collection<? extends Energie>)newValue);
				return;
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				setDegatDefense((Degat)newValue);
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
			case GenModelPackage.CREATURE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__CATEGORIE:
				setCategorie(CATEGORIE_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__PV:
				setPv(PV_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__PV_INIT:
				setPvInit(PV_INIT_EDEFAULT);
				return;
			case GenModelPackage.CREATURE__BASE:
				setBase((Creature)null);
				return;
			case GenModelPackage.CREATURE__ATTAQUES:
				getAttaques().clear();
				return;
			case GenModelPackage.CREATURE__ENERGIES:
				getEnergies().clear();
				return;
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				setDegatDefense((Degat)null);
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
			case GenModelPackage.CREATURE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case GenModelPackage.CREATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GenModelPackage.CREATURE__CATEGORIE:
				return categorie != CATEGORIE_EDEFAULT;
			case GenModelPackage.CREATURE__PV:
				return pv != PV_EDEFAULT;
			case GenModelPackage.CREATURE__PV_INIT:
				return pvInit != PV_INIT_EDEFAULT;
			case GenModelPackage.CREATURE__BASE:
				return base != null;
			case GenModelPackage.CREATURE__ATTAQUES:
				return attaques != null && !attaques.isEmpty();
			case GenModelPackage.CREATURE__ENERGIES:
				return energies != null && !energies.isEmpty();
			case GenModelPackage.CREATURE__DEGAT_DEFENSE:
				return degatDefense != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(", pv: ");
		result.append(pv);
		result.append(", pvInit: ");
		result.append(pvInit);
		result.append(')');
		return result.toString();
	}

} //GenCreatureImpl
