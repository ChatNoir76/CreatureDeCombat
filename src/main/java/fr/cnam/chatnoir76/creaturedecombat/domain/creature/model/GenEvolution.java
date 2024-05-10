/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getEvolution()
 * @model
 * @generated
 */
public interface GenEvolution extends AbstractCreatureComponent {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Base)
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getEvolution_Base()
	 * @model
	 * @generated
	 */
	Base getBase();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Base value);

} // GenEvolution
