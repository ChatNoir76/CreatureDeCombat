/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv <em>Pv</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCreature()
 * @model
 * @generated
 */
public interface GenCreature extends Labelled {
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

} // GenCreature
