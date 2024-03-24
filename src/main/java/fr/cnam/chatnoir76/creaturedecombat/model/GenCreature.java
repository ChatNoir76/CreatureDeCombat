/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv <em>Pv</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase <em>Base</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies <em>Energies</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getDegatDefense <em>Degat Defense</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature()
 * @model
 * @generated
 */
public interface GenCreature extends Labelled {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @see #setCategorie(Categorie)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Categorie()
	 * @model required="true"
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Pv</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pv</em>' attribute.
	 * @see #setPv(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Pv()
	 * @model default="0"
	 * @generated
	 */
	int getPv();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pv</em>' attribute.
	 * @see #getPv()
	 * @generated
	 */
	void setPv(int value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Creature)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Base()
	 * @model
	 * @generated
	 */
	Creature getBase();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Creature value);

	/**
	 * Returns the value of the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution</em>' reference.
	 * @see #setEvolution(Creature)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Evolution()
	 * @model
	 * @generated
	 */
	Creature getEvolution();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEvolution <em>Evolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution</em>' reference.
	 * @see #getEvolution()
	 * @generated
	 */
	void setEvolution(Creature value);

	/**
	 * Returns the value of the '<em><b>Attaques</b></em>' reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Attaque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaques</em>' reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Attaques()
	 * @model
	 * @generated
	 */
	EList<Attaque> getAttaques();

	/**
	 * Returns the value of the '<em><b>Energies</b></em>' reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Energie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energies</em>' reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Energies()
	 * @model
	 * @generated
	 */
	EList<Energie> getEnergies();

	/**
	 * Returns the value of the '<em><b>Degat Defense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degat Defense</em>' reference.
	 * @see #setDegatDefense(Degat)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_DegatDefense()
	 * @model
	 * @generated
	 */
	Degat getDegatDefense();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getDegatDefense <em>Degat Defense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degat Defense</em>' reference.
	 * @see #getDegatDefense()
	 * @generated
	 */
	void setDegatDefense(Degat value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean estCompatibleEvolution(Creature creature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void faireEvoluer(Creature creature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Niveau getNiveau();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean estMort();

} // GenCreature
