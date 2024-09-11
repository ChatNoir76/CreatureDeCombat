/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attaque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getId <em>Id</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getDegatAttaque <em>Degat Attaque</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieCategorie <em>Besoin Energie Categorie</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieAutre <em>Besoin Energie Autre</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getCategorie <em>Categorie</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque()
 * @model
 * @generated
 */
public interface GenAttaque extends Labelled {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Degat Attaque</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degat Attaque</em>' containment reference.
	 * @see #setDegatAttaque(Degat)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque_DegatAttaque()
	 * @model containment="true"
	 * @generated
	 */
	Degat getDegatAttaque();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getDegatAttaque <em>Degat Attaque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degat Attaque</em>' containment reference.
	 * @see #getDegatAttaque()
	 * @generated
	 */
	void setDegatAttaque(Degat value);

	/**
	 * Returns the value of the '<em><b>Besoin Energie Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoin Energie Categorie</em>' attribute.
	 * @see #setBesoinEnergieCategorie(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque_BesoinEnergieCategorie()
	 * @model
	 * @generated
	 */
	int getBesoinEnergieCategorie();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieCategorie <em>Besoin Energie Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besoin Energie Categorie</em>' attribute.
	 * @see #getBesoinEnergieCategorie()
	 * @generated
	 */
	void setBesoinEnergieCategorie(int value);

	/**
	 * Returns the value of the '<em><b>Besoin Energie Autre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoin Energie Autre</em>' attribute.
	 * @see #setBesoinEnergieAutre(int)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque_BesoinEnergieAutre()
	 * @model
	 * @generated
	 */
	int getBesoinEnergieAutre();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieAutre <em>Besoin Energie Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besoin Energie Autre</em>' attribute.
	 * @see #getBesoinEnergieAutre()
	 * @generated
	 */
	void setBesoinEnergieAutre(int value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @see #setCategorie(Categorie)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getAttaque_Categorie()
	 * @model
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
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
	boolean estDisponible(Creature creature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean estCompatible(Creature creature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void attaque(Creature attaquant, Creature defenseur);

} // GenAttaque
