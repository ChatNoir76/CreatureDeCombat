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
	String eNS_URI = "http://example.com/model";

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
	int ENERGIE__NOM = LABELLED__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE__DESCRIPTION = LABELLED__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Energie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Est Compatible Creature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE___EST_COMPATIBLE_CREATURE__GENCREATURE = LABELLED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Energie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIE_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreature()
	 * @generated
	 */
	int CREATURE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NOM = LABELLED__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__DESCRIPTION = LABELLED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__CATEGORIE = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__PV = LABELLED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__BASE = LABELLED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__EVOLUTION = LABELLED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ATTAQUES = LABELLED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Energies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__ENERGIES = LABELLED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Degat Defense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__DEGAT_DEFENSE = LABELLED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Est Compatible Evolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE = LABELLED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Faire Evoluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___FAIRE_EVOLUER__GENCREATURE = LABELLED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Niveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___GET_NIVEAU = LABELLED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Est Mort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE___EST_MORT = LABELLED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAttaque()
	 * @generated
	 */
	int ATTAQUE = 3;

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
	 * The feature id for the '<em><b>Degat Attaque</b></em>' reference.
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
	 * The number of structural features of the '<em>Attaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 3;

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
	int DEGAT = 4;

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
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Niveau <em>Niveau</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Niveau
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 5;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.Categorie <em>Categorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.Categorie
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 6;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat <em>Type Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getTypeDegat()
	 * @generated
	 */
	int TYPE_DEGAT = 7;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat <em>Calcul Degat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCalculDegat()
	 * @generated
	 */
	int CALCUL_DEGAT = 8;


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
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#estCompatibleCreature(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature) <em>Est Compatible Creature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Compatible Creature</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenEnergie#estCompatibleCreature(fr.cnam.chatnoir76.creaturedecombat.model.GenCreature)
	 * @generated
	 */
	EOperation getEnergie__EstCompatibleCreature__GenCreature();

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
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getCategorie()
	 * @see #getCreature()
	 * @generated
	 */
	EAttribute getCreature_Categorie();

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
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
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
	 * Returns the meta object for the reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getAttaques <em>Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attaques</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getAttaques()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Attaques();

	/**
	 * Returns the meta object for the reference list '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies <em>Energies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energies</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getEnergies()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_Energies();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getDegatDefense <em>Degat Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degat Defense</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getDegatDefense()
	 * @see #getCreature()
	 * @generated
	 */
	EReference getCreature_DegatDefense();

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
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getNiveau() <em>Get Niveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Niveau</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenCreature#getNiveau()
	 * @generated
	 */
	EOperation getCreature__GetNiveau();

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
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaque</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque
	 * @generated
	 */
	EClass getAttaque();

	/**
	 * Returns the meta object for the reference '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenAttaque#getDegatAttaque <em>Degat Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degat Attaque</em>'.
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
		 * The meta object literal for the '<em><b>Est Compatible Creature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENERGIE___EST_COMPATIBLE_CREATURE__GENCREATURE = eINSTANCE.getEnergie__EstCompatibleCreature__GenCreature();

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
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__CATEGORIE = eINSTANCE.getCreature_Categorie();

		/**
		 * The meta object literal for the '<em><b>Pv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__PV = eINSTANCE.getCreature_Pv();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Attaques</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__ATTAQUES = eINSTANCE.getCreature_Attaques();

		/**
		 * The meta object literal for the '<em><b>Energies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__ENERGIES = eINSTANCE.getCreature_Energies();

		/**
		 * The meta object literal for the '<em><b>Degat Defense</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATURE__DEGAT_DEFENSE = eINSTANCE.getCreature_DegatDefense();

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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl <em>Attaque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenAttaqueImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getAttaque()
		 * @generated
		 */
		EClass ATTAQUE = eINSTANCE.getAttaque();

		/**
		 * The meta object literal for the '<em><b>Degat Attaque</b></em>' reference feature.
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
