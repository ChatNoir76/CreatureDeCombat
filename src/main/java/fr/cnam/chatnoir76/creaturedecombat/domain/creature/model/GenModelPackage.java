/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;

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
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelFactory
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
	GenModelPackage eINSTANCE = fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled <em>Labelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getLabelled()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCarte()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEnergieImpl <em>Energie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEnergieImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getEnergie()
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
	 * The operation id for the '<em>Est Compatible Creature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE___EST_COMPATIBLE_CREATURE__GENCREATURE = CARTE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE_OPERATION_COUNT = CARTE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getAttaque()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDegatImpl <em>Degat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDegatImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDegat()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDresseurImpl <em>Dresseur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDresseurImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDresseur()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenObjetImpl <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenObjetImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getObjet()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenSupporteurImpl <em>Supporteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenSupporteurImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getSupporteur()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDeckImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDeck()
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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl <em>Jeu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getJeu()
	 * @generated
	 */
	int JEU = 9;

	/**
	 * The feature id for the '<em><b>Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__DECK = 0;

	/**
	 * The feature id for the '<em><b>Pile Defausse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__PILE_DEFAUSSE = 1;

	/**
	 * The feature id for the '<em><b>Creature Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__CREATURE_ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Banc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__BANC = 3;

	/**
	 * The feature id for the '<em><b>Carte Recompense</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU__CARTE_RECOMPENSE = 4;

	/**
	 * The number of structural features of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Fin Tour</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___FIN_TOUR = 0;

	/**
	 * The operation id for the '<em>Fin Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___FIN_OPTION = 1;

	/**
	 * The operation id for the '<em>Abandonner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU___ABANDONNER = 2;

	/**
	 * The number of operations of the '<em>Jeu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEU_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCreature()
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
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__PV_INIT = CARTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NOM = CARTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__DESCRIPTION = CARTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__CATEGORIE = CARTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ATTAQUES = CARTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__DEGAT_DEFENSE = CARTE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = CARTE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Est Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_VISIBLE = CARTE___EST_VISIBLE;

	/**
	 * The operation id for the '<em>Est Compatible Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE = CARTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Faire Evoluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___FAIRE_EVOLUER__GENCREATURE = CARTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_NIVEAU = CARTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Est Mort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_MORT = CARTE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_OPERATION_COUNT = CARTE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getBase()
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
	int BASE__NOM = LABELLED__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__DESCRIPTION = LABELLED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__PV_INIT = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__CATEGORIE = LABELLED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__ATTAQUES = LABELLED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__DEGAT_DEFENSE = LABELLED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEvolutionImpl <em>Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEvolutionImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getEvolution()
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
	int EVOLUTION__NOM = BASE__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__DESCRIPTION = BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__PV_INIT = BASE__PV_INIT;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__CATEGORIE = BASE__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__ATTAQUES = BASE__ATTAQUES;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__DEGAT_DEFENSE = BASE__DEGAT_DEFENSE;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__BASE = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenMaitreImpl <em>Maitre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenMaitreImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getMaitre()
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
	int MAITRE__NOM = EVOLUTION__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__DESCRIPTION = EVOLUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Pv Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__PV_INIT = EVOLUTION__PV_INIT;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__CATEGORIE = EVOLUTION__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__ATTAQUES = EVOLUTION__ATTAQUES;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__DEGAT_DEFENSE = EVOLUTION__DEGAT_DEFENSE;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__BASE = EVOLUTION__BASE;

	/**
	 * The feature id for the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE__EVOLUTION = EVOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE_FEATURE_COUNT = EVOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maitre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAITRE_OPERATION_COUNT = EVOLUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau <em>Niveau</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 14;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie <em>Categorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 15;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat <em>Type Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getTypeDegat()
	 * @generated
	 */
	int TYPE_DEGAT = 16;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat <em>Calcul Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCalculDegat()
	 * @generated
	 */
	int CALCUL_DEGAT = 17;


	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled <em>Labelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labelled</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled
	 * @generated
	 */
	EClass getLabelled();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled#getNom()
	 * @see #getLabelled()
	 * @generated
	 */
	EAttribute getLabelled_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled#getDescription()
	 * @see #getLabelled()
	 * @generated
	 */
	EAttribute getLabelled_Description();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie <em>Energie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie
	 * @generated
	 */
	EClass getEnergie();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#getCategorie()
	 * @see #getEnergie()
	 * @generated
	 */
	EAttribute getEnergie_Categorie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#estCompatibleCreature(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Est Compatible Creature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible Creature</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEnergie#estCompatibleCreature(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getEnergie__EstCompatibleCreature__GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaque</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque
	 * @generated
	 */
	EClass getAttaque();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getDegatAttaque <em>Degat Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degat Attaque</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getDegatAttaque()
	 * @see #getAttaque()
	 * @generated
	 */
	EReference getAttaque_DegatAttaque();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getBesoinEnergieCategorie <em>Besoin Energie Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Besoin Energie Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getBesoinEnergieCategorie()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BesoinEnergieCategorie();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getBesoinEnergieAutre <em>Besoin Energie Autre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Besoin Energie Autre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getBesoinEnergieAutre()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BesoinEnergieAutre();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#getCategorie()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_Categorie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#estDisponible(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Est Disponible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Disponible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#estDisponible(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__EstDisponible__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#estCompatible(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Est Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#estCompatible(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__EstCompatible__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#attaque(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Attaque</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attaque</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenAttaque#attaque(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getAttaque__Attaque__GenCreature_GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat <em>Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat
	 * @generated
	 */
	EClass getDegat();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getType()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getModeCalcul <em>Mode Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode Calcul</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getModeCalcul()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_ModeCalcul();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getDegat <em>Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getDegat()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Degat();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getIncertitude <em>Incertitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incertitude</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getIncertitude()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_Incertitude();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getChanceRattage <em>Chance Rattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance Rattage</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getChanceRattage()
	 * @see #getDegat()
	 * @generated
	 */
	EAttribute getDegat_ChanceRattage();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getCalculDegat(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Get Calcul Degat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Calcul Degat</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDegat#getCalculDegat(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature, fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getDegat__GetCalculDegat__GenCreature_GenCreature();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte#estVisible() <em>Est Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Visible</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte#estVisible()
	 * @generated
	 */
	EOperation getCarte__EstVisible();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDresseur <em>Dresseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dresseur</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDresseur
	 * @generated
	 */
	EClass getDresseur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenObjet
	 * @generated
	 */
	EClass getObjet();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenSupporteur <em>Supporteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporteur</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenSupporteur
	 * @generated
	 */
	EClass getSupporteur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCartes <em>Cartes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cartes</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCartes()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Cartes();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#piocher() <em>Piocher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Piocher</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#piocher()
	 * @generated
	 */
	EOperation getDeck__Piocher();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCreatureBase() <em>Get Creature Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Creature Base</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCreatureBase()
	 * @generated
	 */
	EOperation getDeck__GetCreatureBase();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCreatureEvolution() <em>Get Creature Evolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Creature Evolution</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getCreatureEvolution()
	 * @generated
	 */
	EOperation getDeck__GetCreatureEvolution();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getEnergie() <em>Get Energie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Energie</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getEnergie()
	 * @generated
	 */
	EOperation getDeck__GetEnergie();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getObjet() <em>Get Objet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Objet</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getObjet()
	 * @generated
	 */
	EOperation getDeck__GetObjet();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getSupporteur() <em>Get Supporteur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supporteur</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck#getSupporteur()
	 * @generated
	 */
	EOperation getDeck__GetSupporteur();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu <em>Jeu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jeu</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu
	 * @generated
	 */
	EClass getJeu();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deck</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getDeck()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_Deck();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getPileDefausse <em>Pile Defausse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pile Defausse</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getPileDefausse()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_PileDefausse();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getCreatureActive <em>Creature Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creature Active</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getCreatureActive()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_CreatureActive();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getBanc <em>Banc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Banc</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getBanc()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_Banc();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getCarteRecompense <em>Carte Recompense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carte Recompense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#getCarteRecompense()
	 * @see #getJeu()
	 * @generated
	 */
	EReference getJeu_CarteRecompense();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#finTour() <em>Fin Tour</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Tour</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#finTour()
	 * @generated
	 */
	EOperation getJeu__FinTour();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#finOption() <em>Fin Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Option</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#finOption()
	 * @generated
	 */
	EOperation getJeu__FinOption();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#abandonner() <em>Abandonner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abandonner</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenJeu#abandonner()
	 * @generated
	 */
	EOperation getJeu__Abandonner();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature <em>Creature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creature</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature
	 * @generated
	 */
	EClass getCreature();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getBase()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Base();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getEvolution()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Evolution();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getMaitre <em>Maitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maitre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getMaitre()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Maitre();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getPv <em>Pv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getPv()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Pv();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getPvInit <em>Pv Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv Init</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getPvInit()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_PvInit();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getNom()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getDescription()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getCategorie()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Categorie();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getAttaques <em>Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaques</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getAttaques()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Attaques();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getDegatDefense <em>Degat Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degat Defense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getDegatDefense()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_DegatDefense();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getEnergies <em>Energies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Energies</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getEnergies()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Energies();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#estCompatibleEvolution(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Est Compatible Evolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible Evolution</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#estCompatibleEvolution(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getCreature__EstCompatibleEvolution__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature) <em>Faire Evoluer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faire Evoluer</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#faireEvoluer(fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature)
	 * @generated
	 */
	EOperation getCreature__FaireEvoluer__GenCreature();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getNiveau() <em>Get Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Niveau</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#getNiveau()
	 * @generated
	 */
	EOperation getCreature__GetNiveau();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#estMort() <em>Est Mort</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Mort</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCreature#estMort()
	 * @generated
	 */
	EOperation getCreature__EstMort();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getPvInit <em>Pv Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv Init</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getPvInit()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_PvInit();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getCategorie()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Categorie();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getAttaques <em>Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaques</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getAttaques()
	 * @see #getBase()
	 * @generated
	 */
	EReference getBase_Attaques();

	/**
	 * Returns the meta object for the containment reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getDegatDefense <em>Degat Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degat Defense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenBase#getDegatDefense()
	 * @see #getBase()
	 * @generated
	 */
	EReference getBase_DegatDefense();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution
	 * @generated
	 */
	EClass getEvolution();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenEvolution#getBase()
	 * @see #getEvolution()
	 * @generated
	 */
	EReference getEvolution_Base();

	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre <em>Maitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maitre</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre
	 * @generated
	 */
	EClass getMaitre();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre#getEvolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolution</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenMaitre#getEvolution()
	 * @see #getMaitre()
	 * @generated
	 */
	EReference getMaitre_Evolution();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Niveau</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau
	 * @generated
	 */
	EEnum getNiveau();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
	 * @generated
	 */
	EEnum getCategorie();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat <em>Type Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat
	 * @generated
	 */
	EEnum getTypeDegat();

	/**
	 * Returns the meta object for enum '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat <em>Calcul Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calcul Degat</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled <em>Labelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenLabelled
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getLabelled()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEnergieImpl <em>Energie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEnergieImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getEnergie()
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
		 * The meta object literal for the '<em><b>Est Compatible Creature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENERGIE___EST_COMPATIBLE_CREATURE__GENCREATURE = eINSTANCE.getEnergie__EstCompatibleCreature__GenCreature();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenAttaqueImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getAttaque()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDegatImpl <em>Degat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDegatImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDegat()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenCarte
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCarte()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDresseurImpl <em>Dresseur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDresseurImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDresseur()
		 * @generated
		 */
		EClass DRESSEUR = eINSTANCE.getDresseur();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenObjetImpl <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenObjetImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getObjet()
		 * @generated
		 */
		EClass OBJET = eINSTANCE.getObjet();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenSupporteurImpl <em>Supporteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenSupporteurImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getSupporteur()
		 * @generated
		 */
		EClass SUPPORTEUR = eINSTANCE.getSupporteur();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenDeckImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getDeck()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl <em>Jeu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenJeuImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getJeu()
		 * @generated
		 */
		EClass JEU = eINSTANCE.getJeu();

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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl <em>Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenCreatureImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCreature()
		 * @generated
		 */
		EClass CREATURE = eINSTANCE.getCreature();

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
		 * The meta object literal for the '<em><b>Pv Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__PV_INIT = eINSTANCE.getCreature_PvInit();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__NOM = eINSTANCE.getCreature_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__DESCRIPTION = eINSTANCE.getCreature_Description();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__CATEGORIE = eINSTANCE.getCreature_Categorie();

		/**
		 * The meta object literal for the '<em><b>Attaques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__ATTAQUES = eINSTANCE.getCreature_Attaques();

		/**
		 * The meta object literal for the '<em><b>Degat Defense</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__DEGAT_DEFENSE = eINSTANCE.getCreature_DegatDefense();

		/**
		 * The meta object literal for the '<em><b>Energies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__ENERGIES = eINSTANCE.getCreature_Energies();

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
		 * The meta object literal for the '<em><b>Get Niveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___GET_NIVEAU = eINSTANCE.getCreature__GetNiveau();

		/**
		 * The meta object literal for the '<em><b>Est Mort</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATURE___EST_MORT = eINSTANCE.getCreature__EstMort();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenBaseImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Pv Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__PV_INIT = eINSTANCE.getBase_PvInit();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__CATEGORIE = eINSTANCE.getBase_Categorie();

		/**
		 * The meta object literal for the '<em><b>Attaques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE__ATTAQUES = eINSTANCE.getBase_Attaques();

		/**
		 * The meta object literal for the '<em><b>Degat Defense</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE__DEGAT_DEFENSE = eINSTANCE.getBase_DegatDefense();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEvolutionImpl <em>Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenEvolutionImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getEvolution()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenMaitreImpl <em>Maitre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenMaitreImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getMaitre()
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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau <em>Niveau</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getNiveau()
		 * @generated
		 */
		EEnum NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie <em>Categorie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCategorie()
		 * @generated
		 */
		EEnum CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat <em>Type Degat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getTypeDegat()
		 * @generated
		 */
		EEnum TYPE_DEGAT = eINSTANCE.getTypeDegat();

		/**
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat <em>Calcul Degat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl.GenModelPackageImpl#getCalculDegat()
		 * @generated
		 */
		EEnum CALCUL_DEGAT = eINSTANCE.getCalculDegat();

	}

} //GenModelPackage
