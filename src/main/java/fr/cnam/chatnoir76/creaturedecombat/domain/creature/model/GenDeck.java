/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCartes <em>Cartes</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getDeck()
 * @model
 * @generated
 */
public interface GenDeck extends Labelled {
	/**
	 * Returns the value of the '<em><b>Cartes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Carte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartes</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getDeck_Cartes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carte> getCartes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Carte piocher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Carte> getCreatureBase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Carte> getCreatureEvolution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Carte> getEnergie();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Carte> getObjet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Carte> getSupporteur();

} // GenDeck
