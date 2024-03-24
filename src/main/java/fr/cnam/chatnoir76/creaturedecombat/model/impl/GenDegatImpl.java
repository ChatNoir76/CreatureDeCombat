/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Degat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl#getDegat <em>Degat</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl#getIncertitude <em>Incertitude</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl#getChanceRattage <em>Chance Rattage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenDegatImpl extends MinimalEObjectImpl.Container implements Degat {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDegat TYPE_EDEFAULT = TypeDegat.ATTAQUE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDegat type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected static final CalculDegat MODE_CALCUL_EDEFAULT = CalculDegat.BASE;

	/**
	 * The cached value of the '{@link #getModeCalcul() <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCalcul()
	 * @generated
	 * @ordered
	 */
	protected CalculDegat modeCalcul = MODE_CALCUL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegat() <em>Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegat()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegat() <em>Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegat()
	 * @generated
	 * @ordered
	 */
	protected int degat = DEGAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncertitude() <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitude()
	 * @generated
	 * @ordered
	 */
	protected static final int INCERTITUDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIncertitude() <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitude()
	 * @generated
	 * @ordered
	 */
	protected int incertitude = INCERTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChanceRattage() <em>Chance Rattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanceRattage()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANCE_RATTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChanceRattage() <em>Chance Rattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanceRattage()
	 * @generated
	 * @ordered
	 */
	protected int chanceRattage = CHANCE_RATTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDegatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.DEGAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDegat getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDegat newType) {
		TypeDegat oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.DEGAT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculDegat getModeCalcul() {
		return modeCalcul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModeCalcul(CalculDegat newModeCalcul) {
		CalculDegat oldModeCalcul = modeCalcul;
		modeCalcul = newModeCalcul == null ? MODE_CALCUL_EDEFAULT : newModeCalcul;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.DEGAT__MODE_CALCUL, oldModeCalcul, modeCalcul));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDegat() {
		return degat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegat(int newDegat) {
		int oldDegat = degat;
		degat = newDegat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.DEGAT__DEGAT, oldDegat, degat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIncertitude() {
		return incertitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncertitude(int newIncertitude) {
		int oldIncertitude = incertitude;
		incertitude = newIncertitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.DEGAT__INCERTITUDE, oldIncertitude, incertitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChanceRattage() {
		return chanceRattage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChanceRattage(int newChanceRattage) {
		int oldChanceRattage = chanceRattage;
		chanceRattage = newChanceRattage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.DEGAT__CHANCE_RATTAGE, oldChanceRattage, chanceRattage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCalculDegat(Creature attaquant, Creature defenseur) {
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
			case GenModelPackage.DEGAT__TYPE:
				return getType();
			case GenModelPackage.DEGAT__MODE_CALCUL:
				return getModeCalcul();
			case GenModelPackage.DEGAT__DEGAT:
				return getDegat();
			case GenModelPackage.DEGAT__INCERTITUDE:
				return getIncertitude();
			case GenModelPackage.DEGAT__CHANCE_RATTAGE:
				return getChanceRattage();
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
			case GenModelPackage.DEGAT__TYPE:
				setType((TypeDegat)newValue);
				return;
			case GenModelPackage.DEGAT__MODE_CALCUL:
				setModeCalcul((CalculDegat)newValue);
				return;
			case GenModelPackage.DEGAT__DEGAT:
				setDegat((Integer)newValue);
				return;
			case GenModelPackage.DEGAT__INCERTITUDE:
				setIncertitude((Integer)newValue);
				return;
			case GenModelPackage.DEGAT__CHANCE_RATTAGE:
				setChanceRattage((Integer)newValue);
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
			case GenModelPackage.DEGAT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GenModelPackage.DEGAT__MODE_CALCUL:
				setModeCalcul(MODE_CALCUL_EDEFAULT);
				return;
			case GenModelPackage.DEGAT__DEGAT:
				setDegat(DEGAT_EDEFAULT);
				return;
			case GenModelPackage.DEGAT__INCERTITUDE:
				setIncertitude(INCERTITUDE_EDEFAULT);
				return;
			case GenModelPackage.DEGAT__CHANCE_RATTAGE:
				setChanceRattage(CHANCE_RATTAGE_EDEFAULT);
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
			case GenModelPackage.DEGAT__TYPE:
				return type != TYPE_EDEFAULT;
			case GenModelPackage.DEGAT__MODE_CALCUL:
				return modeCalcul != MODE_CALCUL_EDEFAULT;
			case GenModelPackage.DEGAT__DEGAT:
				return degat != DEGAT_EDEFAULT;
			case GenModelPackage.DEGAT__INCERTITUDE:
				return incertitude != INCERTITUDE_EDEFAULT;
			case GenModelPackage.DEGAT__CHANCE_RATTAGE:
				return chanceRattage != CHANCE_RATTAGE_EDEFAULT;
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
			case GenModelPackage.DEGAT___GET_CALCUL_DEGAT__GENCREATURE_GENCREATURE:
				return getCalculDegat((Creature)arguments.get(0), (Creature)arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(", modeCalcul: ");
		result.append(modeCalcul);
		result.append(", degat: ");
		result.append(degat);
		result.append(", incertitude: ");
		result.append(incertitude);
		result.append(", chanceRattage: ");
		result.append(chanceRattage);
		result.append(')');
		return result.toString();
	}

} //GenDegatImpl
