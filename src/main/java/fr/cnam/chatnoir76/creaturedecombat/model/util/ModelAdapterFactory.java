/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.util;

import fr.cnam.chatnoir76.creaturedecombat.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseLabelled(Labelled object) {
				return createLabelledAdapter();
			}
			@Override
			public Adapter caseEnergie(Energie object) {
				return createEnergieAdapter();
			}
			@Override
			public Adapter caseCreature(Creature object) {
				return createCreatureAdapter();
			}
			@Override
			public Adapter caseAttaque(Attaque object) {
				return createAttaqueAdapter();
			}
			@Override
			public Adapter caseDegat(Degat object) {
				return createDegatAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled <em>Labelled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled
	 * @generated
	 */
	public Adapter createLabelledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie <em>Energie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie
	 * @generated
	 */
	public Adapter createEnergieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature
	 * @generated
	 */
	public Adapter createCreatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque
	 * @generated
	 */
	public Adapter createAttaqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat <em>Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat
	 * @generated
	 */
	public Adapter createDegatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
