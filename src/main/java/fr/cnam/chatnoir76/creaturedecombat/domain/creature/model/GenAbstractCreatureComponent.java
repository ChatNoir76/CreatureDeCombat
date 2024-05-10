/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Creature Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getPvInit <em>Pv Init</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getDegatDefense <em>Degat Defense</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getNiveau <em>Niveau</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent()
 * @model abstract="true"
 * @generated
 */
public interface GenAbstractCreatureComponent extends CreatureComponent, Labelled {
	/**
	 * Returns the value of the '<em><b>Pv Init</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pv Init</em>' attribute.
	 * @see #setPvInit(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent_PvInit()
	 * @model default="0"
	 * @generated
	 */
	int getPvInit();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getPvInit <em>Pv Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pv Init</em>' attribute.
	 * @see #getPvInit()
	 * @generated
	 */
	void setPvInit(int value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @see #setCategorie(Categorie)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent_Categorie()
	 * @model required="true"
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Attaques</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaques</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent_Attaques()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attaque> getAttaques();

	/**
	 * Returns the value of the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degat Defense</em>' containment reference.
	 * @see #setDegatDefense(Degat)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent_DegatDefense()
	 * @model containment="true"
	 * @generated
	 */
	Degat getDegatDefense();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getDegatDefense <em>Degat Defense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degat Defense</em>' containment reference.
	 * @see #getDegatDefense()
	 * @generated
	 */
	void setDegatDefense(Degat value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau
	 * @see #setNiveau(Niveau)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getAbstractCreatureComponent_Niveau()
	 * @model
	 * @generated
	 */
	Niveau getNiveau();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAbstractCreatureComponent#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(Niveau value);

} // GenAbstractCreatureComponent
