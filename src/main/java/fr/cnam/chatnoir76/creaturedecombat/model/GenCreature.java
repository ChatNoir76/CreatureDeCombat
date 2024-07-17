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
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies <em>Energies</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase <em>Base</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getMaitre <em>Maitre</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv <em>Pv</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature()
 * @model
 * @generated
 */
public interface GenCreature extends Carte, CreatureComponent {
	/**
	 * Returns the value of the '<em><b>Energies</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Energie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energies</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Energies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Energie> getEnergies();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Base()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	CreatureComponent getBase();

	/**
	 * Returns the value of the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution</em>' reference.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Evolution()
	 * @model changeable="false"
	 * @generated
	 */
	CreatureComponent getEvolution();

	/**
	 * Returns the value of the '<em><b>Maitre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maitre</em>' reference.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature_Maitre()
	 * @model changeable="false"
	 * @generated
	 */
	CreatureComponent getMaitre();

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
	boolean faireEvoluer(Creature creature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean estMort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(CreatureComponent creatureComponent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recoitDegat(int degat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recoitSoin(int soin);

} // GenCreature
