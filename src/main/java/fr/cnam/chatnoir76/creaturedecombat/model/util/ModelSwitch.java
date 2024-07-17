/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = GenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenModelPackage.LABELLED: {
				Labelled labelled = (Labelled)theEObject;
				T result = caseLabelled(labelled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.ENERGIE: {
				Energie energie = (Energie)theEObject;
				T result = caseEnergie(energie);
				if (result == null) result = caseCarte(energie);
				if (result == null) result = caseLabelled(energie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.ATTAQUE: {
				Attaque attaque = (Attaque)theEObject;
				T result = caseAttaque(attaque);
				if (result == null) result = caseLabelled(attaque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.DEGAT: {
				Degat degat = (Degat)theEObject;
				T result = caseDegat(degat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.CARTE: {
				Carte carte = (Carte)theEObject;
				T result = caseCarte(carte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.DRESSEUR: {
				Dresseur dresseur = (Dresseur)theEObject;
				T result = caseDresseur(dresseur);
				if (result == null) result = caseCarte(dresseur);
				if (result == null) result = caseLabelled(dresseur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.OBJET: {
				Objet objet = (Objet)theEObject;
				T result = caseObjet(objet);
				if (result == null) result = caseDresseur(objet);
				if (result == null) result = caseCarte(objet);
				if (result == null) result = caseLabelled(objet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.SUPPORTEUR: {
				Supporteur supporteur = (Supporteur)theEObject;
				T result = caseSupporteur(supporteur);
				if (result == null) result = caseDresseur(supporteur);
				if (result == null) result = caseCarte(supporteur);
				if (result == null) result = caseLabelled(supporteur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.DECK: {
				Deck deck = (Deck)theEObject;
				T result = caseDeck(deck);
				if (result == null) result = caseLabelled(deck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.JEU: {
				Jeu jeu = (Jeu)theEObject;
				T result = caseJeu(jeu);
				if (result == null) result = caseAction(jeu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.CREATURE: {
				Creature creature = (Creature)theEObject;
				T result = caseCreature(creature);
				if (result == null) result = caseCarte(creature);
				if (result == null) result = caseCreatureComponent(creature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = caseAbstractCreatureComponent(base);
				if (result == null) result = caseCreatureComponent(base);
				if (result == null) result = caseLabelled(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.EVOLUTION: {
				Evolution evolution = (Evolution)theEObject;
				T result = caseEvolution(evolution);
				if (result == null) result = caseAbstractCreatureComponent(evolution);
				if (result == null) result = caseCreatureComponent(evolution);
				if (result == null) result = caseLabelled(evolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.MAITRE: {
				Maitre maitre = (Maitre)theEObject;
				T result = caseMaitre(maitre);
				if (result == null) result = caseAbstractCreatureComponent(maitre);
				if (result == null) result = caseCreatureComponent(maitre);
				if (result == null) result = caseLabelled(maitre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.CREATURE_COMPONENT: {
				CreatureComponent creatureComponent = (CreatureComponent)theEObject;
				T result = caseCreatureComponent(creatureComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.ABSTRACT_CREATURE_COMPONENT: {
				AbstractCreatureComponent abstractCreatureComponent = (AbstractCreatureComponent)theEObject;
				T result = caseAbstractCreatureComponent(abstractCreatureComponent);
				if (result == null) result = caseCreatureComponent(abstractCreatureComponent);
				if (result == null) result = caseLabelled(abstractCreatureComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labelled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labelled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelled(Labelled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergie(Energie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attaque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attaque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttaque(Attaque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegat(Degat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarte(Carte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dresseur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dresseur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDresseur(Dresseur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjet(Objet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupporteur(Supporteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeck(Deck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jeu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jeu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJeu(Jeu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreature(Creature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvolution(Evolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maitre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maitre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaitre(Maitre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creature Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creature Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatureComponent(CreatureComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Creature Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Creature Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCreatureComponent(AbstractCreatureComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
