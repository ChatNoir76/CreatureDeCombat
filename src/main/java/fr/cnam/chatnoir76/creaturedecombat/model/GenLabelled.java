/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labelled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getLabelled()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GenLabelled extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getLabelled_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getLabelled_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // GenLabelled
