/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#getCategorie <em>Categorie</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getEnergie()
 * @model
 * @generated
 */
public interface GenEnergie extends Labelled {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @see #setCategorie(Categorie)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getEnergie_Categorie()
	 * @model
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean estCompatibleCreature(Creature creature);

} // GenEnergie
