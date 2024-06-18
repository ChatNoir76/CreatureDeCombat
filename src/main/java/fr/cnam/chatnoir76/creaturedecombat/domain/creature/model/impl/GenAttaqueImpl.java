/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attaque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getDegatAttaque <em>Degat Attaque</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getBesoinEnergieCategorie <em>Besoin Energie Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getBesoinEnergieAutre <em>Besoin Energie Autre</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl#getCategorie <em>Categorie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenAttaqueImpl extends MinimalEObjectImpl.Container implements Attaque {
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
	 * The cached value of the '{@link #getDegatAttaque() <em>Degat Attaque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegatAttaque()
	 * @generated
	 * @ordered
	 */
	protected Degat degatAttaque;

	/**
	 * The default value of the '{@link #getBesoinEnergieCategorie() <em>Besoin Energie Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinEnergieCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final int BESOIN_ENERGIE_CATEGORIE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBesoinEnergieCategorie() <em>Besoin Energie Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinEnergieCategorie()
	 * @generated
	 * @ordered
	 */
	protected int besoinEnergieCategorie = BESOIN_ENERGIE_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBesoinEnergieAutre() <em>Besoin Energie Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinEnergieAutre()
	 * @generated
	 * @ordered
	 */
	protected static final int BESOIN_ENERGIE_AUTRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBesoinEnergieAutre() <em>Besoin Energie Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinEnergieAutre()
	 * @generated
	 * @ordered
	 */
	protected int besoinEnergieAutre = BESOIN_ENERGIE_AUTRE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenAttaqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.ATTAQUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Degat getDegatAttaque() {
		return degatAttaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegatAttaque(Degat newDegatAttaque, NotificationChain msgs) {
		Degat oldDegatAttaque = degatAttaque;
		degatAttaque = newDegatAttaque;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__DEGAT_ATTAQUE, oldDegatAttaque, newDegatAttaque);
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
	public void setDegatAttaque(Degat newDegatAttaque) {
		if (newDegatAttaque != degatAttaque) {
			NotificationChain msgs = null;
			if (degatAttaque != null)
				msgs = ((InternalEObject)degatAttaque).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.ATTAQUE__DEGAT_ATTAQUE, null, msgs);
			if (newDegatAttaque != null)
				msgs = ((InternalEObject)newDegatAttaque).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenModelPackage.ATTAQUE__DEGAT_ATTAQUE, null, msgs);
			msgs = basicSetDegatAttaque(newDegatAttaque, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__DEGAT_ATTAQUE, newDegatAttaque, newDegatAttaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBesoinEnergieCategorie() {
		return besoinEnergieCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBesoinEnergieCategorie(int newBesoinEnergieCategorie) {
		int oldBesoinEnergieCategorie = besoinEnergieCategorie;
		besoinEnergieCategorie = newBesoinEnergieCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__BESOIN_ENERGIE_CATEGORIE, oldBesoinEnergieCategorie, besoinEnergieCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBesoinEnergieAutre() {
		return besoinEnergieAutre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBesoinEnergieAutre(int newBesoinEnergieAutre) {
		int oldBesoinEnergieAutre = besoinEnergieAutre;
		besoinEnergieAutre = newBesoinEnergieAutre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__BESOIN_ENERGIE_AUTRE, oldBesoinEnergieAutre, besoinEnergieAutre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.ATTAQUE__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean estDisponible(Creature creature) {
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
	public boolean estCompatible(Creature creature) {
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
	public void attaque(Creature attaquant, Creature defenseur) {
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
			case GenModelPackage.ATTAQUE__DEGAT_ATTAQUE:
				return basicSetDegatAttaque(null, msgs);
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
			case GenModelPackage.ATTAQUE__NOM:
				return getNom();
			case GenModelPackage.ATTAQUE__DESCRIPTION:
				return getDescription();
			case GenModelPackage.ATTAQUE__DEGAT_ATTAQUE:
				return getDegatAttaque();
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_CATEGORIE:
				return getBesoinEnergieCategorie();
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_AUTRE:
				return getBesoinEnergieAutre();
			case GenModelPackage.ATTAQUE__CATEGORIE:
				return getCategorie();
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
			case GenModelPackage.ATTAQUE__NOM:
				setNom((String)newValue);
				return;
			case GenModelPackage.ATTAQUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GenModelPackage.ATTAQUE__DEGAT_ATTAQUE:
				setDegatAttaque((Degat)newValue);
				return;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_CATEGORIE:
				setBesoinEnergieCategorie((Integer)newValue);
				return;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_AUTRE:
				setBesoinEnergieAutre((Integer)newValue);
				return;
			case GenModelPackage.ATTAQUE__CATEGORIE:
				setCategorie((Categorie)newValue);
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
			case GenModelPackage.ATTAQUE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case GenModelPackage.ATTAQUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GenModelPackage.ATTAQUE__DEGAT_ATTAQUE:
				setDegatAttaque((Degat)null);
				return;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_CATEGORIE:
				setBesoinEnergieCategorie(BESOIN_ENERGIE_CATEGORIE_EDEFAULT);
				return;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_AUTRE:
				setBesoinEnergieAutre(BESOIN_ENERGIE_AUTRE_EDEFAULT);
				return;
			case GenModelPackage.ATTAQUE__CATEGORIE:
				setCategorie(CATEGORIE_EDEFAULT);
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
			case GenModelPackage.ATTAQUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case GenModelPackage.ATTAQUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GenModelPackage.ATTAQUE__DEGAT_ATTAQUE:
				return degatAttaque != null;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_CATEGORIE:
				return besoinEnergieCategorie != BESOIN_ENERGIE_CATEGORIE_EDEFAULT;
			case GenModelPackage.ATTAQUE__BESOIN_ENERGIE_AUTRE:
				return besoinEnergieAutre != BESOIN_ENERGIE_AUTRE_EDEFAULT;
			case GenModelPackage.ATTAQUE__CATEGORIE:
				return categorie != CATEGORIE_EDEFAULT;
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
			case GenModelPackage.ATTAQUE___EST_DISPONIBLE__GENCREATURE:
				return estDisponible((Creature)arguments.get(0));
			case GenModelPackage.ATTAQUE___EST_COMPATIBLE__GENCREATURE:
				return estCompatible((Creature)arguments.get(0));
			case GenModelPackage.ATTAQUE___ATTAQUE__GENCREATURE_GENCREATURE:
				attaque((Creature)arguments.get(0), (Creature)arguments.get(1));
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", besoinEnergieCategorie: ");
		result.append(besoinEnergieCategorie);
		result.append(", besoinEnergieAutre: ");
		result.append(besoinEnergieAutre);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //GenAttaqueImpl
