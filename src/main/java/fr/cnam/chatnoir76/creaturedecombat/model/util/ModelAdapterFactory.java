/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.cnam.chatnoir76.creaturedecombat.model.AbstractCreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Action;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.model.Labelled;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.model.Objet;
import fr.cnam.chatnoir76.creaturedecombat.model.Supporteur;

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
			public Adapter caseAttaque(Attaque object) {
				return createAttaqueAdapter();
			}
			@Override
			public Adapter caseDegat(Degat object) {
				return createDegatAdapter();
			}
			@Override
			public Adapter caseCarte(Carte object) {
				return createCarteAdapter();
			}
			@Override
			public Adapter caseDresseur(Dresseur object) {
				return createDresseurAdapter();
			}
			@Override
			public Adapter caseObjet(Objet object) {
				return createObjetAdapter();
			}
			@Override
			public Adapter caseSupporteur(Supporteur object) {
				return createSupporteurAdapter();
			}
			@Override
			public Adapter caseDeck(Deck object) {
				return createDeckAdapter();
			}
			@Override
			public Adapter caseJeu(Jeu object) {
				return createJeuAdapter();
			}
			@Override
			public Adapter caseCreature(Creature object) {
				return createCreatureAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseEvolution(Evolution object) {
				return createEvolutionAdapter();
			}
			@Override
			public Adapter caseMaitre(Maitre object) {
				return createMaitreAdapter();
			}
			@Override
			public Adapter caseCreatureComponent(CreatureComponent object) {
				return createCreatureComponentAdapter();
			}
			@Override
			public Adapter caseAbstractCreatureComponent(AbstractCreatureComponent object) {
				return createAbstractCreatureComponentAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCarte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCarte
	 * @generated
	 */
	public Adapter createCarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDresseur <em>Dresseur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDresseur
	 * @generated
	 */
	public Adapter createDresseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenObjet
	 * @generated
	 */
	public Adapter createObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenSupporteur <em>Supporteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenSupporteur
	 * @generated
	 */
	public Adapter createSupporteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck
	 * @generated
	 */
	public Adapter createDeckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu <em>Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu
	 * @generated
	 */
	public Adapter createJeuAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenBase
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution
	 * @generated
	 */
	public Adapter createEvolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre <em>Maitre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre
	 * @generated
	 */
	public Adapter createMaitreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent <em>Creature Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent
	 * @generated
	 */
	public Adapter createCreatureComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent <em>Abstract Creature Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent
	 * @generated
	 */
	public Adapter createAbstractCreatureComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction
	 * @generated
	 */
	public Adapter createActionAdapter() {
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
