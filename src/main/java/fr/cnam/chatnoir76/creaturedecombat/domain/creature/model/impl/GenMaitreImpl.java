/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Maitre;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maitre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenMaitreImpl#getEvolution <em>Evolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenMaitreImpl extends AbstractCreatureComponentImpl implements Maitre {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenMaitreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.MAITRE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenModelPackage.MAITRE__EVOLUTION, oldEvolution, evolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenModelPackage.MAITRE__EVOLUTION, oldEvolution, evolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenModelPackage.MAITRE__EVOLUTION:
				if (resolve) return getEvolution();
				return basicGetEvolution();
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
			case GenModelPackage.MAITRE__EVOLUTION:
				setEvolution((Evolution)newValue);
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
			case GenModelPackage.MAITRE__EVOLUTION:
				setEvolution((Evolution)null);
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
			case GenModelPackage.MAITRE__EVOLUTION:
				return evolution != null;
		}
		return super.eIsSet(featureID);
	}

} //GenMaitreImpl
