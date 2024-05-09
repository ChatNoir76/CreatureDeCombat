/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;

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
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getPvInit <em>Pv Init</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl#getDegatDefense <em>Degat Defense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenBaseImpl extends MinimalEObjectImpl.Container implements Base {
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
	 * The cached value of the '{@link #getAttaques() <em>Attaques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaques()
	 * @generated
	 * @ordered
	 */
	protected EList<Attaque> attaques;

	/**
	 * The cached value of the '{@link #getDegatDefense() <em>Degat Defense</em>}' containment reference.
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
	protected GenBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__PV_INIT, oldPvInit, pvInit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attaque> getAttaques() {
		if (attaques == null) {
			attaques = new EObjectContainmentEList<Attaque>(Attaque.class, this, GenModelPackage.BASE__ATTAQUES);
		}
		return attaques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Degat getDegatDefense() {
		return degatDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegatDefense(Degat newDegatDefense, NotificationChain msgs) {
		Degat oldDegatDefense = degatDefense;
		degatDefense = newDegatDefense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__DEGAT_DEFENSE, oldDegatDefense, newDegatDefense);
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
	public void setDegatDefense(Degat newDegatDefense) {
		if (newDegatDefense != degatDefense) {
			NotificationChain msgs = null;
			if (degatDefense != null)
				msgs = ((InternalEObject)degatDefense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.BASE__DEGAT_DEFENSE, null, msgs);
			if (newDegatDefense != null)
				msgs = ((InternalEObject)newDegatDefense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.BASE__DEGAT_DEFENSE, null, msgs);
			msgs = basicSetDegatDefense(newDegatDefense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.BASE__DEGAT_DEFENSE, newDegatDefense, newDegatDefense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenModelPackage.BASE__ATTAQUES:
				return ((InternalEList<?>)getAttaques()).basicRemove(otherEnd, msgs);
			case GenModelPackage.BASE__DEGAT_DEFENSE:
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
			case GenModelPackage.BASE__NOM:
				return getNom();
			case GenModelPackage.BASE__DESCRIPTION:
				return getDescription();
			case GenModelPackage.BASE__PV_INIT:
				return getPvInit();
			case GenModelPackage.BASE__CATEGORIE:
				return getCategorie();
			case GenModelPackage.BASE__ATTAQUES:
				return getAttaques();
			case GenModelPackage.BASE__DEGAT_DEFENSE:
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
			case GenModelPackage.BASE__NOM:
				setNom((String)newValue);
				return;
			case GenModelPackage.BASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GenModelPackage.BASE__PV_INIT:
				setPvInit((Integer)newValue);
				return;
			case GenModelPackage.BASE__CATEGORIE:
				setCategorie((Categorie)newValue);
				return;
			case GenModelPackage.BASE__ATTAQUES:
				getAttaques().clear();
				getAttaques().addAll((Collection<? extends Attaque>)newValue);
				return;
			case GenModelPackage.BASE__DEGAT_DEFENSE:
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
			case GenModelPackage.BASE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case GenModelPackage.BASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GenModelPackage.BASE__PV_INIT:
				setPvInit(PV_INIT_EDEFAULT);
				return;
			case GenModelPackage.BASE__CATEGORIE:
				setCategorie(CATEGORIE_EDEFAULT);
				return;
			case GenModelPackage.BASE__ATTAQUES:
				getAttaques().clear();
				return;
			case GenModelPackage.BASE__DEGAT_DEFENSE:
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
			case GenModelPackage.BASE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case GenModelPackage.BASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GenModelPackage.BASE__PV_INIT:
				return pvInit != PV_INIT_EDEFAULT;
			case GenModelPackage.BASE__CATEGORIE:
				return categorie != CATEGORIE_EDEFAULT;
			case GenModelPackage.BASE__ATTAQUES:
				return attaques != null && !attaques.isEmpty();
			case GenModelPackage.BASE__DEGAT_DEFENSE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", pvInit: ");
		result.append(pvInit);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //GenBaseImpl
