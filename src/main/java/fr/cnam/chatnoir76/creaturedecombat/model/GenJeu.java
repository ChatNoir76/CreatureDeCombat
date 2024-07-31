/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jeu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getDeck <em>Deck</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPileDefausse <em>Pile Defausse</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCreatureActive <em>Creature Active</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getBanc <em>Banc</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCarteRecompense <em>Carte Recompense</em>}</li>
 *   <li>{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu()
 * @model
 * @generated
 */
public interface GenJeu extends Action {
	/**
	 * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo</em>' attribute.
	 * @see #setPseudo(String)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck</em>' containment reference.
	 * @see #setDeck(Deck)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_Deck()
	 * @model containment="true"
	 * @generated
	 */
	Deck getDeck();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getDeck <em>Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck</em>' containment reference.
	 * @see #getDeck()
	 * @generated
	 */
	void setDeck(Deck value);

	/**
	 * Returns the value of the '<em><b>Pile Defausse</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Carte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pile Defausse</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_PileDefausse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carte> getPileDefausse();

	/**
	 * Returns the value of the '<em><b>Creature Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creature Active</em>' containment reference.
	 * @see #setCreatureActive(Creature)
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_CreatureActive()
	 * @model containment="true"
	 * @generated
	 */
	Creature getCreatureActive();

	/**
	 * Sets the value of the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCreatureActive <em>Creature Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creature Active</em>' containment reference.
	 * @see #getCreatureActive()
	 * @generated
	 */
	void setCreatureActive(Creature value);

	/**
	 * Returns the value of the '<em><b>Banc</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Creature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banc</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_Banc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Creature> getBanc();

	/**
	 * Returns the value of the '<em><b>Carte Recompense</b></em>' containment reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Carte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carte Recompense</em>' containment reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_CarteRecompense()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carte> getCarteRecompense();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference list.
	 * The list contents are of type {@link fr.cnam.chatnoir76.creaturedecombat.model.Carte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference list.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getJeu_Main()
	 * @model
	 * @generated
	 */
	EList<Carte> getMain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finTour();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void abandonner();

} // GenJeu
