/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getType <em>Type</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getDegat <em>Degat</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getIncertitude <em>Incertitude</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getChanceRattage <em>Chance Rattage</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat()
 * @model
 * @generated
 */
public interface GenDegat extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
	 * @see #setType(TypeDegat)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat_Type()
	 * @model
	 * @generated
	 */
	TypeDegat getType();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDegat value);

	/**
	 * Returns the value of the '<em><b>Mode Calcul</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Calcul</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
	 * @see #setModeCalcul(CalculDegat)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat_ModeCalcul()
	 * @model
	 * @generated
	 */
	CalculDegat getModeCalcul();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getModeCalcul <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Calcul</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
	 * @see #getModeCalcul()
	 * @generated
	 */
	void setModeCalcul(CalculDegat value);

	/**
	 * Returns the value of the '<em><b>Degat</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degat</em>' attribute.
	 * @see #setDegat(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat_Degat()
	 * @model default="0"
	 * @generated
	 */
	int getDegat();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getDegat <em>Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degat</em>' attribute.
	 * @see #getDegat()
	 * @generated
	 */
	void setDegat(int value);

	/**
	 * Returns the value of the '<em><b>Incertitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incertitude</em>' attribute.
	 * @see #setIncertitude(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat_Incertitude()
	 * @model default="0"
	 * @generated
	 */
	int getIncertitude();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getIncertitude <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incertitude</em>' attribute.
	 * @see #getIncertitude()
	 * @generated
	 */
	void setIncertitude(int value);

	/**
	 * Returns the value of the '<em><b>Chance Rattage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chance Rattage</em>' attribute.
	 * @see #setChanceRattage(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getDegat_ChanceRattage()
	 * @model default="0"
	 * @generated
	 */
	int getChanceRattage();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getChanceRattage <em>Chance Rattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance Rattage</em>' attribute.
	 * @see #getChanceRattage()
	 * @generated
	 */
	void setChanceRattage(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getCalculDegat(Creature attaquant, Creature defenseur);

} // GenDegat
