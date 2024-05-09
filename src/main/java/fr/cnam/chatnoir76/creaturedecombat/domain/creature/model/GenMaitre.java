/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maitre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre#getEvolution <em>Evolution</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getMaitre()
 * @model
 * @generated
 */
public interface GenMaitre extends Evolution {
	/**
	 * Returns the value of the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution</em>' reference.
	 * @see #setEvolution(Evolution)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getMaitre_Evolution()
	 * @model
	 * @generated
	 */
	Evolution getEvolution();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre#getEvolution <em>Evolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution</em>' reference.
	 * @see #getEvolution()
	 * @generated
	 */
	void setEvolution(Evolution value);

} // GenMaitre
