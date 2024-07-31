/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelFactory
 * @model kind="package"
 * @generated
 */
public interface GenModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://creature/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenModelPackage eINSTANCE = fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled <em>Labelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getLabelled()
	 * @generated
	 */
	int LABELLED = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Labelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Labelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCarte <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCarte
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCarte()
	 * @generated
	 */
	int CARTE = 4;

	/**
	 * The number of structural features of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE___EST_VISIBLE = 0;

	/**
	 * The number of operations of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEnergieImpl <em>Energie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEnergieImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getEnergie()
	 * @generated
	 */
	int ENERGIE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE__NOM = CARTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE__DESCRIPTION = CARTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE__CATEGORIE = CARTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Energie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE_FEATURE_COUNT = CARTE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE___EST_VISIBLE = CARTE___EST_VISIBLE;

	/**
	 * The operation id for the '<em>Est Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE___EST_COMPATIBLE__GENCREATURE = CARTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE_OPERATION_COUNT = CARTE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAttaque()
	 * @generated
	 */
	int ATTAQUE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__NOM = LABELLED__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__DESCRIPTION = LABELLED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Degat Attaque</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__DEGAT_ATTAQUE = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Besoin Energie Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__BESOIN_ENERGIE_CATEGORIE = LABELLED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Besoin Energie Autre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__BESOIN_ENERGIE_AUTRE = LABELLED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__CATEGORIE = LABELLED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Est Disponible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE___EST_DISPONIBLE__GENCREATURE = LABELLED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Est Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE___EST_COMPATIBLE__GENCREATURE = LABELLED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Attaque</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE___ATTAQUE__GENCREATURE_GENCREATURE = LABELLED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl <em>Degat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDegat()
	 * @generated
	 */
	int DEGAT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mode Calcul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT__MODE_CALCUL = 1;

	/**
	 * The feature id for the '<em><b>Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT__DEGAT = 2;

	/**
	 * The feature id for the '<em><b>Incertitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT__INCERTITUDE = 3;

	/**
	 * The feature id for the '<em><b>Chance Rattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT__CHANCE_RATTAGE = 4;

	/**
	 * The number of structural features of the '<em>Degat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Calcul Degat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT___GET_CALCUL_DEGAT__GENCREATURE_GENCREATURE = 0;

	/**
	 * The number of operations of the '<em>Degat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGAT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDresseurImpl <em>Dresseur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDresseurImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDresseur()
	 * @generated
	 */
	int DRESSEUR = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRESSEUR__NOM = CARTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRESSEUR__DESCRIPTION = CARTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dresseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRESSEUR_FEATURE_COUNT = CARTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRESSEUR___EST_VISIBLE = CARTE___EST_VISIBLE;

	/**
	 * The number of operations of the '<em>Dresseur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRESSEUR_OPERATION_COUNT = CARTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenObjetImpl <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenObjetImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getObjet()
	 * @generated
	 */
	int OBJET = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__NOM = DRESSEUR__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__DESCRIPTION = DRESSEUR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_FEATURE_COUNT = DRESSEUR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET___EST_VISIBLE = DRESSEUR___EST_VISIBLE;

	/**
	 * The number of operations of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_OPERATION_COUNT = DRESSEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenSupporteurImpl <em>Supporteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenSupporteurImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getSupporteur()
	 * @generated
	 */
	int SUPPORTEUR = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEUR__NOM = DRESSEUR__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEUR__DESCRIPTION = DRESSEUR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Supporteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEUR_FEATURE_COUNT = DRESSEUR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEUR___EST_VISIBLE = DRESSEUR___EST_VISIBLE;

	/**
	 * The number of operations of the '<em>Supporteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTEUR_OPERATION_COUNT = DRESSEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDeckImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDeck()
	 * @generated
	 */
	int DECK = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__NOM = LABELLED__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DESCRIPTION = LABELLED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cartes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__CARTES = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Piocher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___PIOCHER = LABELLED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Creature Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___GET_CREATURE_BASE = LABELLED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Creature Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___GET_CREATURE_EVOLUTION = LABELLED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Energie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___GET_ENERGIE = LABELLED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Objet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___GET_OBJET = LABELLED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Supporteur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK___GET_SUPPORTEUR = LABELLED_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Piocher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PIOCHER = 0;

	/**
	 * The operation id for the '<em>Ajout Carte Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___AJOUT_CARTE_BASE__GENCARTE = 1;

	/**
	 * The operation id for the '<em>Faire Evoluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___FAIRE_EVOLUER__GENCARTE_GENCARTE = 2;

	/**
	 * The operation id for the '<em>Ajout Energie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___AJOUT_ENERGIE__GENCARTE = 3;

	/**
	 * The operation id for the '<em>Utiliser Carte Dresseur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___UTILISER_CARTE_DRESSEUR__GENCARTE = 4;

	/**
	 * The operation id for the '<em>Battre Retraite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___BATTRE_RETRAITE__GENCARTE = 5;

	/**
	 * The operation id for the '<em>Attaquer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ATTAQUER = 6;

	/**
	 * The operation id for the '<em>Fin Tour</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___FIN_TOUR = 7;

	/**
	 * The operation id for the '<em>Abandonner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ABANDONNER = 8;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl <em>Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getJeu()
	 * @generated
	 */
	int JEU = 9;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__PSEUDO = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__DECK = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pile Defausse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__PILE_DEFAUSSE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creature Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__CREATURE_ACTIVE = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Banc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__BANC = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Carte Recompense</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__CARTE_RECOMPENSE = ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__MAIN = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_FEATURE_COUNT = ACTION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Piocher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___PIOCHER = ACTION___PIOCHER;

	/**
	 * The operation id for the '<em>Ajout Carte Base</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___AJOUT_CARTE_BASE__GENCARTE = ACTION___AJOUT_CARTE_BASE__GENCARTE;

	/**
	 * The operation id for the '<em>Faire Evoluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___FAIRE_EVOLUER__GENCARTE_GENCARTE = ACTION___FAIRE_EVOLUER__GENCARTE_GENCARTE;

	/**
	 * The operation id for the '<em>Ajout Energie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___AJOUT_ENERGIE__GENCARTE = ACTION___AJOUT_ENERGIE__GENCARTE;

	/**
	 * The operation id for the '<em>Utiliser Carte Dresseur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___UTILISER_CARTE_DRESSEUR__GENCARTE = ACTION___UTILISER_CARTE_DRESSEUR__GENCARTE;

	/**
	 * The operation id for the '<em>Battre Retraite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___BATTRE_RETRAITE__GENCARTE = ACTION___BATTRE_RETRAITE__GENCARTE;

	/**
	 * The operation id for the '<em>Attaquer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___ATTAQUER = ACTION___ATTAQUER;

	/**
	 * The operation id for the '<em>Fin Tour</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___FIN_TOUR = ACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Fin Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___FIN_OPTION = ACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Abandonner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___ABANDONNER = ACTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_OPERATION_COUNT = ACTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreature()
	 * @generated
	 */
	int CREATURE = 10;

	/**
	 * The feature id for the '<em><b>Energies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ENERGIES = CARTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__BASE = CARTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__EVOLUTION = CARTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maitre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__MAITRE = CARTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__PV = CARTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = CARTE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_VISIBLE = CARTE___EST_VISIBLE;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_PV_INIT = CARTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_CATEGORIE = CARTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_ATTAQUES = CARTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_DEGAT_DEFENSE = CARTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_NIVEAU = CARTE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_NOM = CARTE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_DESCRIPTION = CARTE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_BASE_EVOLUTION = CARTE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_ACTIVE_CREATURE_COMPONENT = CARTE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Est Compatible Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE = CARTE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Faire Evoluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___FAIRE_EVOLUER__GENCREATURE = CARTE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Est Mort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_MORT = CARTE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___INITIALIZE__GENCREATURECOMPONENT = CARTE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Recoit Degat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___RECOIT_DEGAT__INT = CARTE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Recoit Soin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___RECOIT_SOIN__INT = CARTE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_OPERATION_COUNT = CARTE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent <em>Creature Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreatureComponent()
	 * @generated
	 */
	int CREATURE_COMPONENT = 14;

	/**
	 * The number of structural features of the '<em>Creature Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_PV_INIT = 0;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_CATEGORIE = 1;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_ATTAQUES = 2;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_DEGAT_DEFENSE = 3;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_NIVEAU = 4;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_NOM = 5;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_DESCRIPTION = 6;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_BASE_EVOLUTION = 7;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT = 8;

	/**
	 * The number of operations of the '<em>Creature Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_COMPONENT_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAbstractCreatureComponentImpl <em>Abstract Creature Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAbstractCreatureComponentImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAbstractCreatureComponent()
	 * @generated
	 */
	int ABSTRACT_CREATURE_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__NOM = CREATURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__DESCRIPTION = CREATURE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__PV_INIT = CREATURE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__CATEGORIE = CREATURE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__ATTAQUES = CREATURE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__DEGAT_DEFENSE = CREATURE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT__NIVEAU = CREATURE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Creature Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT = CREATURE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_PV_INIT = CREATURE_COMPONENT___GET_PV_INIT;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_CATEGORIE = CREATURE_COMPONENT___GET_CATEGORIE;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_ATTAQUES = CREATURE_COMPONENT___GET_ATTAQUES;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_DEGAT_DEFENSE = CREATURE_COMPONENT___GET_DEGAT_DEFENSE;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_NIVEAU = CREATURE_COMPONENT___GET_NIVEAU;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_NOM = CREATURE_COMPONENT___GET_NOM;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_DESCRIPTION = CREATURE_COMPONENT___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_BASE_EVOLUTION = CREATURE_COMPONENT___GET_BASE_EVOLUTION;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT = CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT;

	/**
	 * The number of operations of the '<em>Abstract Creature Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CREATURE_COMPONENT_OPERATION_COUNT = CREATURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenBaseImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__NOM = ABSTRACT_CREATURE_COMPONENT__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__DESCRIPTION = ABSTRACT_CREATURE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__PV_INIT = ABSTRACT_CREATURE_COMPONENT__PV_INIT;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__CATEGORIE = ABSTRACT_CREATURE_COMPONENT__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__ATTAQUES = ABSTRACT_CREATURE_COMPONENT__ATTAQUES;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT__DEGAT_DEFENSE;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__NIVEAU = ABSTRACT_CREATURE_COMPONENT__NIVEAU;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_PV_INIT = ABSTRACT_CREATURE_COMPONENT___GET_PV_INIT;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_CATEGORIE = ABSTRACT_CREATURE_COMPONENT___GET_CATEGORIE;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_ATTAQUES = ABSTRACT_CREATURE_COMPONENT___GET_ATTAQUES;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT___GET_DEGAT_DEFENSE;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_NIVEAU = ABSTRACT_CREATURE_COMPONENT___GET_NIVEAU;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_NOM = ABSTRACT_CREATURE_COMPONENT___GET_NOM;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_DESCRIPTION = ABSTRACT_CREATURE_COMPONENT___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_BASE_EVOLUTION = ABSTRACT_CREATURE_COMPONENT___GET_BASE_EVOLUTION;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE___GET_ACTIVE_CREATURE_COMPONENT = ABSTRACT_CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = ABSTRACT_CREATURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEvolutionImpl <em>Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEvolutionImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getEvolution()
	 * @generated
	 */
	int EVOLUTION = 12;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__NOM = ABSTRACT_CREATURE_COMPONENT__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__DESCRIPTION = ABSTRACT_CREATURE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__PV_INIT = ABSTRACT_CREATURE_COMPONENT__PV_INIT;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__CATEGORIE = ABSTRACT_CREATURE_COMPONENT__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__ATTAQUES = ABSTRACT_CREATURE_COMPONENT__ATTAQUES;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT__DEGAT_DEFENSE;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__NIVEAU = ABSTRACT_CREATURE_COMPONENT__NIVEAU;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__BASE = ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_FEATURE_COUNT = ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_PV_INIT = ABSTRACT_CREATURE_COMPONENT___GET_PV_INIT;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_CATEGORIE = ABSTRACT_CREATURE_COMPONENT___GET_CATEGORIE;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_ATTAQUES = ABSTRACT_CREATURE_COMPONENT___GET_ATTAQUES;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT___GET_DEGAT_DEFENSE;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_NIVEAU = ABSTRACT_CREATURE_COMPONENT___GET_NIVEAU;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_NOM = ABSTRACT_CREATURE_COMPONENT___GET_NOM;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_DESCRIPTION = ABSTRACT_CREATURE_COMPONENT___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_BASE_EVOLUTION = ABSTRACT_CREATURE_COMPONENT___GET_BASE_EVOLUTION;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION___GET_ACTIVE_CREATURE_COMPONENT = ABSTRACT_CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT;

	/**
	 * The number of operations of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_OPERATION_COUNT = ABSTRACT_CREATURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenMaitreImpl <em>Maitre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenMaitreImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getMaitre()
	 * @generated
	 */
	int MAITRE = 13;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__NOM = ABSTRACT_CREATURE_COMPONENT__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__DESCRIPTION = ABSTRACT_CREATURE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__PV_INIT = ABSTRACT_CREATURE_COMPONENT__PV_INIT;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__CATEGORIE = ABSTRACT_CREATURE_COMPONENT__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__ATTAQUES = ABSTRACT_CREATURE_COMPONENT__ATTAQUES;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT__DEGAT_DEFENSE;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__NIVEAU = ABSTRACT_CREATURE_COMPONENT__NIVEAU;

	/**
	 * The feature id for the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__EVOLUTION = ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE_FEATURE_COUNT = ABSTRACT_CREATURE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Pv Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_PV_INIT = ABSTRACT_CREATURE_COMPONENT___GET_PV_INIT;

	/**
	 * The operation id for the '<em>Get Categorie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_CATEGORIE = ABSTRACT_CREATURE_COMPONENT___GET_CATEGORIE;

	/**
	 * The operation id for the '<em>Get Attaques</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_ATTAQUES = ABSTRACT_CREATURE_COMPONENT___GET_ATTAQUES;

	/**
	 * The operation id for the '<em>Get Degat Defense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_DEGAT_DEFENSE = ABSTRACT_CREATURE_COMPONENT___GET_DEGAT_DEFENSE;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_NIVEAU = ABSTRACT_CREATURE_COMPONENT___GET_NIVEAU;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_NOM = ABSTRACT_CREATURE_COMPONENT___GET_NOM;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_DESCRIPTION = ABSTRACT_CREATURE_COMPONENT___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Base Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_BASE_EVOLUTION = ABSTRACT_CREATURE_COMPONENT___GET_BASE_EVOLUTION;

	/**
	 * The operation id for the '<em>Get Active Creature Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE___GET_ACTIVE_CREATURE_COMPONENT = ABSTRACT_CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT;

	/**
	 * The number of operations of the '<em>Maitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE_OPERATION_COUNT = ABSTRACT_CREATURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Niveau <em>Niveau</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Niveau
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 17;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie <em>Categorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 18;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat <em>Type Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getTypeDegat()
	 * @generated
	 */
	int TYPE_DEGAT = 19;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat <em>Calcul Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCalculDegat()
	 * @generated
	 */
	int CALCUL_DEGAT = 20;


	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled <em>Labelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labelled</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled
	 * @generated
	 */
	EClass getLabelled();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getNom()
	 * @see #getLabelled()
	 * @generated
	 */
	EAttribute getLabelled_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getDescription()
	 * @see #getLabelled()
	 * @generated
	 */
	EAttribute getLabelled_Description();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie <em>Energie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie
	 * @generated
	 */
	EClass getEnergie();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#getCategorie()
	 * @see #getEnergie()
	 * @generated
	 */
	EAttribute getEnergie_Categorie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#estCompatible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Est Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#estCompatible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getEnergie__EstCompatible__GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaque</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque
	 * @generated
	 */
	EClass getAttaque();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getDegatAttaque <em>Degat Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degat Attaque</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getDegatAttaque()
	 * @see #getAttaque()
	 * @generated
	 */
	EReference getAttaque_DegatAttaque();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieCategorie <em>Besoin Energie Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Besoin Energie Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieCategorie()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BesoinEnergieCategorie();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieAutre <em>Besoin Energie Autre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Besoin Energie Autre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getBesoinEnergieAutre()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BesoinEnergieAutre();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getCategorie()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_Categorie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#estDisponible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Est Disponible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Disponible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#estDisponible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__EstDisponible__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#estCompatible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Est Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#estCompatible(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__EstCompatible__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#attaque(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Attaque</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attaque</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#attaque(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__Attaque__GenCreature_GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat <em>Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat
	 * @generated
	 */
	EClass getDegat();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getType()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getModeCalcul <em>Mode Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode Calcul</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getModeCalcul()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_ModeCalcul();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getDegat <em>Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getDegat()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Degat();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getIncertitude <em>Incertitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incertitude</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getIncertitude()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Incertitude();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getChanceRattage <em>Chance Rattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance Rattage</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getChanceRattage()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_ChanceRattage();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getCalculDegat(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Get Calcul Degat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Calcul Degat</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDegat#getCalculDegat(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getDegat__GetCalculDegat__GenCreature_GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCarte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCarte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCarte#estVisible() <em>Est Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Visible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCarte#estVisible()
	 * @generated
	 */
	EOperation getCarte__EstVisible();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDresseur <em>Dresseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dresseur</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDresseur
	 * @generated
	 */
	EClass getDresseur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenObjet
	 * @generated
	 */
	EClass getObjet();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenSupporteur <em>Supporteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporteur</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenSupporteur
	 * @generated
	 */
	EClass getSupporteur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCartes <em>Cartes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartes</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCartes()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Cartes();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#piocher() <em>Piocher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Piocher</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#piocher()
	 * @generated
	 */
	EOperation getDeck__Piocher();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCreatureBase() <em>Get Creature Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Creature Base</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCreatureBase()
	 * @generated
	 */
	EOperation getDeck__GetCreatureBase();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCreatureEvolution() <em>Get Creature Evolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Creature Evolution</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getCreatureEvolution()
	 * @generated
	 */
	EOperation getDeck__GetCreatureEvolution();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getEnergie() <em>Get Energie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Energie</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getEnergie()
	 * @generated
	 */
	EOperation getDeck__GetEnergie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getObjet() <em>Get Objet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Objet</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getObjet()
	 * @generated
	 */
	EOperation getDeck__GetObjet();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getSupporteur() <em>Get Supporteur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supporteur</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenDeck#getSupporteur()
	 * @generated
	 */
	EOperation getDeck__GetSupporteur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu <em>Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jeu</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu
	 * @generated
	 */
	EClass getJeu();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPseudo()
	 * @see #getJeu()
	 * @generated
	 */
	EAttribute getJeu_Pseudo();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deck</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getDeck()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_Deck();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPileDefausse <em>Pile Defausse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pile Defausse</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getPileDefausse()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_PileDefausse();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCreatureActive <em>Creature Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creature Active</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCreatureActive()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_CreatureActive();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getBanc <em>Banc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Banc</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getBanc()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_Banc();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCarteRecompense <em>Carte Recompense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carte Recompense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getCarteRecompense()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_CarteRecompense();

	/**
	 * Returns the meta object for the reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#getMain()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_Main();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#finTour() <em>Fin Tour</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Tour</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#finTour()
	 * @generated
	 */
	EOperation getJeu__FinTour();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#finOption() <em>Fin Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Option</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#finOption()
	 * @generated
	 */
	EOperation getJeu__FinOption();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#abandonner() <em>Abandonner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abandonner</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenJeu#abandonner()
	 * @generated
	 */
	EOperation getJeu__Abandonner();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creature</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature
	 * @generated
	 */
	EClass getCreature();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies <em>Energies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Energies</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Energies();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Base();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEvolution()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Evolution();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getMaitre <em>Maitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maitre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getMaitre()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Maitre();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv <em>Pv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getPv()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Pv();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#estCompatibleEvolution(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Est Compatible Evolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible Evolution</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#estCompatibleEvolution(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getCreature__EstCompatibleEvolution__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Faire Evoluer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faire Evoluer</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getCreature__FaireEvoluer__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#estMort() <em>Est Mort</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Mort</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#estMort()
	 * @generated
	 */
	EOperation getCreature__EstMort();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#initialize(fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent) <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#initialize(fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent)
	 * @generated
	 */
	EOperation getCreature__Initialize__GenCreatureComponent();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#recoitDegat(int) <em>Recoit Degat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recoit Degat</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#recoitDegat(int)
	 * @generated
	 */
	EOperation getCreature__RecoitDegat__int();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#recoitSoin(int) <em>Recoit Soin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recoit Soin</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#recoitSoin(int)
	 * @generated
	 */
	EOperation getCreature__RecoitSoin__int();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenBase
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution
	 * @generated
	 */
	EClass getEvolution();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEvolution#getBase()
	 * @see #getEvolution()
	 * @generated
	 */
	EReference getEvolution_Base();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre <em>Maitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maitre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre
	 * @generated
	 */
	EClass getMaitre();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre#getEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenMaitre#getEvolution()
	 * @see #getMaitre()
	 * @generated
	 */
	EReference getMaitre_Evolution();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent <em>Creature Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creature Component</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent
	 * @generated
	 */
	EClass getCreatureComponent();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getPvInit() <em>Get Pv Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pv Init</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getPvInit()
	 * @generated
	 */
	EOperation getCreatureComponent__GetPvInit();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getCategorie() <em>Get Categorie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Categorie</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getCategorie()
	 * @generated
	 */
	EOperation getCreatureComponent__GetCategorie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getAttaques() <em>Get Attaques</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attaques</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getAttaques()
	 * @generated
	 */
	EOperation getCreatureComponent__GetAttaques();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getDegatDefense() <em>Get Degat Defense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Degat Defense</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getDegatDefense()
	 * @generated
	 */
	EOperation getCreatureComponent__GetDegatDefense();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getNiveau() <em>Get Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Niveau</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getNiveau()
	 * @generated
	 */
	EOperation getCreatureComponent__GetNiveau();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getNom() <em>Get Nom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nom</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getNom()
	 * @generated
	 */
	EOperation getCreatureComponent__GetNom();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getDescription()
	 * @generated
	 */
	EOperation getCreatureComponent__GetDescription();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getBaseEvolution() <em>Get Base Evolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Base Evolution</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getBaseEvolution()
	 * @generated
	 */
	EOperation getCreatureComponent__GetBaseEvolution();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getActiveCreatureComponent() <em>Get Active Creature Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Creature Component</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent#getActiveCreatureComponent()
	 * @generated
	 */
	EOperation getCreatureComponent__GetActiveCreatureComponent();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent <em>Abstract Creature Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Creature Component</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent
	 * @generated
	 */
	EClass getAbstractCreatureComponent();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getPvInit <em>Pv Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv Init</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getPvInit()
	 * @see #getAbstractCreatureComponent()
	 * @generated
	 */
	EAttribute getAbstractCreatureComponent_PvInit();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getCategorie()
	 * @see #getAbstractCreatureComponent()
	 * @generated
	 */
	EAttribute getAbstractCreatureComponent_Categorie();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getAttaques <em>Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaques</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getAttaques()
	 * @see #getAbstractCreatureComponent()
	 * @generated
	 */
	EReference getAbstractCreatureComponent_Attaques();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getDegatDefense <em>Degat Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degat Defense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getDegatDefense()
	 * @see #getAbstractCreatureComponent()
	 * @generated
	 */
	EReference getAbstractCreatureComponent_DegatDefense();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAbstractCreatureComponent#getNiveau()
	 * @see #getAbstractCreatureComponent()
	 * @generated
	 */
	EAttribute getAbstractCreatureComponent_Niveau();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#piocher() <em>Piocher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Piocher</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#piocher()
	 * @generated
	 */
	EOperation getAction__Piocher();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#ajoutCarteBase(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte) <em>Ajout Carte Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajout Carte Base</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#ajoutCarteBase(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte)
	 * @generated
	 */
	EOperation getAction__AjoutCarteBase__GenCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte, fr.cnam.chatnoir76.creaturedecombat.model.GenCarte) <em>Faire Evoluer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faire Evoluer</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte, fr.cnam.chatnoir76.creaturedecombat.model.GenCarte)
	 * @generated
	 */
	EOperation getAction__FaireEvoluer__GenCarte_GenCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#ajoutEnergie(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte) <em>Ajout Energie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajout Energie</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#ajoutEnergie(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte)
	 * @generated
	 */
	EOperation getAction__AjoutEnergie__GenCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#utiliserCarteDresseur(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte) <em>Utiliser Carte Dresseur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Utiliser Carte Dresseur</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#utiliserCarteDresseur(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte)
	 * @generated
	 */
	EOperation getAction__UtiliserCarteDresseur__GenCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#battreRetraite(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte) <em>Battre Retraite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Battre Retraite</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#battreRetraite(fr.cnam.chatnoir76.creaturedecombat.model.GenCarte)
	 * @generated
	 */
	EOperation getAction__BattreRetraite__GenCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#attaquer() <em>Attaquer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attaquer</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#attaquer()
	 * @generated
	 */
	EOperation getAction__Attaquer();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#finTour() <em>Fin Tour</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Tour</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#finTour()
	 * @generated
	 */
	EOperation getAction__FinTour();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction#abandonner() <em>Abandonner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abandonner</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction#abandonner()
	 * @generated
	 */
	EOperation getAction__Abandonner();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.model.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Niveau</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Niveau
	 * @generated
	 */
	EEnum getNiveau();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @generated
	 */
	EEnum getCategorie();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat <em>Type Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
	 * @generated
	 */
	EEnum getTypeDegat();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat <em>Calcul Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calcul Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
	 * @generated
	 */
	EEnum getCalculDegat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled <em>Labelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getLabelled()
		 * @generated
		 */
		EClass LABELLED = eINSTANCE.getLabelled();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELLED__NOM = eINSTANCE.getLabelled_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELLED__DESCRIPTION = eINSTANCE.getLabelled_Description();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEnergieImpl <em>Energie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEnergieImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getEnergie()
		 * @generated
		 */
		EClass ENERGIE = eINSTANCE.getEnergie();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIE__CATEGORIE = eINSTANCE.getEnergie_Categorie();

		/**
		 * The meta object literal for the '<em><b>Est Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENERGIE___EST_COMPATIBLE__GENCREATURE = eINSTANCE.getEnergie__EstCompatible__GenCreature();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAttaque()
		 * @generated
		 */
		EClass ATTAQUE = eINSTANCE.getAttaque();

		/**
		 * The meta object literal for the '<em><b>Degat Attaque</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTAQUE__DEGAT_ATTAQUE = eINSTANCE.getAttaque_DegatAttaque();

		/**
		 * The meta object literal for the '<em><b>Besoin Energie Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__BESOIN_ENERGIE_CATEGORIE = eINSTANCE.getAttaque_BesoinEnergieCategorie();

		/**
		 * The meta object literal for the '<em><b>Besoin Energie Autre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__BESOIN_ENERGIE_AUTRE = eINSTANCE.getAttaque_BesoinEnergieAutre();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__CATEGORIE = eINSTANCE.getAttaque_Categorie();

		/**
		 * The meta object literal for the '<em><b>Est Disponible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTAQUE___EST_DISPONIBLE__GENCREATURE = eINSTANCE.getAttaque__EstDisponible__GenCreature();

		/**
		 * The meta object literal for the '<em><b>Est Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTAQUE___EST_COMPATIBLE__GENCREATURE = eINSTANCE.getAttaque__EstCompatible__GenCreature();

		/**
		 * The meta object literal for the '<em><b>Attaque</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTAQUE___ATTAQUE__GENCREATURE_GENCREATURE = eINSTANCE.getAttaque__Attaque__GenCreature_GenCreature();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl <em>Degat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDegatImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDegat()
		 * @generated
		 */
		EClass DEGAT = eINSTANCE.getDegat();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGAT__TYPE = eINSTANCE.getDegat_Type();

		/**
		 * The meta object literal for the '<em><b>Mode Calcul</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGAT__MODE_CALCUL = eINSTANCE.getDegat_ModeCalcul();

		/**
		 * The meta object literal for the '<em><b>Degat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGAT__DEGAT = eINSTANCE.getDegat_Degat();

		/**
		 * The meta object literal for the '<em><b>Incertitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGAT__INCERTITUDE = eINSTANCE.getDegat_Incertitude();

		/**
		 * The meta object literal for the '<em><b>Chance Rattage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGAT__CHANCE_RATTAGE = eINSTANCE.getDegat_ChanceRattage();

		/**
		 * The meta object literal for the '<em><b>Get Calcul Degat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEGAT___GET_CALCUL_DEGAT__GENCREATURE_GENCREATURE = eINSTANCE.getDegat__GetCalculDegat__GenCreature_GenCreature();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCarte <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCarte
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCarte()
		 * @generated
		 */
		EClass CARTE = eINSTANCE.getCarte();

		/**
		 * The meta object literal for the '<em><b>Est Visible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTE___EST_VISIBLE = eINSTANCE.getCarte__EstVisible();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDresseurImpl <em>Dresseur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDresseurImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDresseur()
		 * @generated
		 */
		EClass DRESSEUR = eINSTANCE.getDresseur();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenObjetImpl <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenObjetImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getObjet()
		 * @generated
		 */
		EClass OBJET = eINSTANCE.getObjet();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenSupporteurImpl <em>Supporteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenSupporteurImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getSupporteur()
		 * @generated
		 */
		EClass SUPPORTEUR = eINSTANCE.getSupporteur();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenDeckImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getDeck()
		 * @generated
		 */
		EClass DECK = eINSTANCE.getDeck();

		/**
		 * The meta object literal for the '<em><b>Cartes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__CARTES = eINSTANCE.getDeck_Cartes();

		/**
		 * The meta object literal for the '<em><b>Piocher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___PIOCHER = eINSTANCE.getDeck__Piocher();

		/**
		 * The meta object literal for the '<em><b>Get Creature Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___GET_CREATURE_BASE = eINSTANCE.getDeck__GetCreatureBase();

		/**
		 * The meta object literal for the '<em><b>Get Creature Evolution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___GET_CREATURE_EVOLUTION = eINSTANCE.getDeck__GetCreatureEvolution();

		/**
		 * The meta object literal for the '<em><b>Get Energie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___GET_ENERGIE = eINSTANCE.getDeck__GetEnergie();

		/**
		 * The meta object literal for the '<em><b>Get Objet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___GET_OBJET = eINSTANCE.getDeck__GetObjet();

		/**
		 * The meta object literal for the '<em><b>Get Supporteur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECK___GET_SUPPORTEUR = eINSTANCE.getDeck__GetSupporteur();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl <em>Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenJeuImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getJeu()
		 * @generated
		 */
		EClass JEU = eINSTANCE.getJeu();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEU__PSEUDO = eINSTANCE.getJeu_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Deck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__DECK = eINSTANCE.getJeu_Deck();

		/**
		 * The meta object literal for the '<em><b>Pile Defausse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__PILE_DEFAUSSE = eINSTANCE.getJeu_PileDefausse();

		/**
		 * The meta object literal for the '<em><b>Creature Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__CREATURE_ACTIVE = eINSTANCE.getJeu_CreatureActive();

		/**
		 * The meta object literal for the '<em><b>Banc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__BANC = eINSTANCE.getJeu_Banc();

		/**
		 * The meta object literal for the '<em><b>Carte Recompense</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__CARTE_RECOMPENSE = eINSTANCE.getJeu_CarteRecompense();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEU__MAIN = eINSTANCE.getJeu_Main();

		/**
		 * The meta object literal for the '<em><b>Fin Tour</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JEU___FIN_TOUR = eINSTANCE.getJeu__FinTour();

		/**
		 * The meta object literal for the '<em><b>Fin Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JEU___FIN_OPTION = eINSTANCE.getJeu__FinOption();

		/**
		 * The meta object literal for the '<em><b>Abandonner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JEU___ABANDONNER = eINSTANCE.getJeu__Abandonner();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl <em>Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreature()
		 * @generated
		 */
		EClass CREATURE = eINSTANCE.getCreature();

		/**
		 * The meta object literal for the '<em><b>Energies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__ENERGIES = eINSTANCE.getCreature_Energies();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__BASE = eINSTANCE.getCreature_Base();

		/**
		 * The meta object literal for the '<em><b>Evolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__EVOLUTION = eINSTANCE.getCreature_Evolution();

		/**
		 * The meta object literal for the '<em><b>Maitre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__MAITRE = eINSTANCE.getCreature_Maitre();

		/**
		 * The meta object literal for the '<em><b>Pv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__PV = eINSTANCE.getCreature_Pv();

		/**
		 * The meta object literal for the '<em><b>Est Compatible Evolution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE = eINSTANCE.getCreature__EstCompatibleEvolution__GenCreature();

		/**
		 * The meta object literal for the '<em><b>Faire Evoluer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___FAIRE_EVOLUER__GENCREATURE = eINSTANCE.getCreature__FaireEvoluer__GenCreature();

		/**
		 * The meta object literal for the '<em><b>Est Mort</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___EST_MORT = eINSTANCE.getCreature__EstMort();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___INITIALIZE__GENCREATURECOMPONENT = eINSTANCE.getCreature__Initialize__GenCreatureComponent();

		/**
		 * The meta object literal for the '<em><b>Recoit Degat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___RECOIT_DEGAT__INT = eINSTANCE.getCreature__RecoitDegat__int();

		/**
		 * The meta object literal for the '<em><b>Recoit Soin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___RECOIT_SOIN__INT = eINSTANCE.getCreature__RecoitSoin__int();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenBaseImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEvolutionImpl <em>Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenEvolutionImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getEvolution()
		 * @generated
		 */
		EClass EVOLUTION = eINSTANCE.getEvolution();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTION__BASE = eINSTANCE.getEvolution_Base();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenMaitreImpl <em>Maitre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenMaitreImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getMaitre()
		 * @generated
		 */
		EClass MAITRE = eINSTANCE.getMaitre();

		/**
		 * The meta object literal for the '<em><b>Evolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAITRE__EVOLUTION = eINSTANCE.getMaitre_Evolution();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent <em>Creature Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreatureComponent
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreatureComponent()
		 * @generated
		 */
		EClass CREATURE_COMPONENT = eINSTANCE.getCreatureComponent();

		/**
		 * The meta object literal for the '<em><b>Get Pv Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_PV_INIT = eINSTANCE.getCreatureComponent__GetPvInit();

		/**
		 * The meta object literal for the '<em><b>Get Categorie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_CATEGORIE = eINSTANCE.getCreatureComponent__GetCategorie();

		/**
		 * The meta object literal for the '<em><b>Get Attaques</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_ATTAQUES = eINSTANCE.getCreatureComponent__GetAttaques();

		/**
		 * The meta object literal for the '<em><b>Get Degat Defense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_DEGAT_DEFENSE = eINSTANCE.getCreatureComponent__GetDegatDefense();

		/**
		 * The meta object literal for the '<em><b>Get Niveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_NIVEAU = eINSTANCE.getCreatureComponent__GetNiveau();

		/**
		 * The meta object literal for the '<em><b>Get Nom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_NOM = eINSTANCE.getCreatureComponent__GetNom();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_DESCRIPTION = eINSTANCE.getCreatureComponent__GetDescription();

		/**
		 * The meta object literal for the '<em><b>Get Base Evolution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_BASE_EVOLUTION = eINSTANCE.getCreatureComponent__GetBaseEvolution();

		/**
		 * The meta object literal for the '<em><b>Get Active Creature Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE_COMPONENT___GET_ACTIVE_CREATURE_COMPONENT = eINSTANCE.getCreatureComponent__GetActiveCreatureComponent();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAbstractCreatureComponentImpl <em>Abstract Creature Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAbstractCreatureComponentImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAbstractCreatureComponent()
		 * @generated
		 */
		EClass ABSTRACT_CREATURE_COMPONENT = eINSTANCE.getAbstractCreatureComponent();

		/**
		 * The meta object literal for the '<em><b>Pv Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CREATURE_COMPONENT__PV_INIT = eINSTANCE.getAbstractCreatureComponent_PvInit();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CREATURE_COMPONENT__CATEGORIE = eINSTANCE.getAbstractCreatureComponent_Categorie();

		/**
		 * The meta object literal for the '<em><b>Attaques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CREATURE_COMPONENT__ATTAQUES = eINSTANCE.getAbstractCreatureComponent_Attaques();

		/**
		 * The meta object literal for the '<em><b>Degat Defense</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CREATURE_COMPONENT__DEGAT_DEFENSE = eINSTANCE.getAbstractCreatureComponent_DegatDefense();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CREATURE_COMPONENT__NIVEAU = eINSTANCE.getAbstractCreatureComponent_Niveau();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAction <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAction
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Piocher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PIOCHER = eINSTANCE.getAction__Piocher();

		/**
		 * The meta object literal for the '<em><b>Ajout Carte Base</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___AJOUT_CARTE_BASE__GENCARTE = eINSTANCE.getAction__AjoutCarteBase__GenCarte();

		/**
		 * The meta object literal for the '<em><b>Faire Evoluer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___FAIRE_EVOLUER__GENCARTE_GENCARTE = eINSTANCE.getAction__FaireEvoluer__GenCarte_GenCarte();

		/**
		 * The meta object literal for the '<em><b>Ajout Energie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___AJOUT_ENERGIE__GENCARTE = eINSTANCE.getAction__AjoutEnergie__GenCarte();

		/**
		 * The meta object literal for the '<em><b>Utiliser Carte Dresseur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___UTILISER_CARTE_DRESSEUR__GENCARTE = eINSTANCE.getAction__UtiliserCarteDresseur__GenCarte();

		/**
		 * The meta object literal for the '<em><b>Battre Retraite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___BATTRE_RETRAITE__GENCARTE = eINSTANCE.getAction__BattreRetraite__GenCarte();

		/**
		 * The meta object literal for the '<em><b>Attaquer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ATTAQUER = eINSTANCE.getAction__Attaquer();

		/**
		 * The meta object literal for the '<em><b>Fin Tour</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___FIN_TOUR = eINSTANCE.getAction__FinTour();

		/**
		 * The meta object literal for the '<em><b>Abandonner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ABANDONNER = eINSTANCE.getAction__Abandonner();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Niveau <em>Niveau</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.Niveau
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getNiveau()
		 * @generated
		 */
		EEnum NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie <em>Categorie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCategorie()
		 * @generated
		 */
		EEnum CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat <em>Type Degat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getTypeDegat()
		 * @generated
		 */
		EEnum TYPE_DEGAT = eINSTANCE.getTypeDegat();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat <em>Calcul Degat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCalculDegat()
		 * @generated
		 */
		EEnum CALCUL_DEGAT = eINSTANCE.getCalculDegat();

	}

} //GenModelPackage
