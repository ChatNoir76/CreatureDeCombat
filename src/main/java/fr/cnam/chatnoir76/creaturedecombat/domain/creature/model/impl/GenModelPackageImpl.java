/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Labelled;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Objet;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Supporteur;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenModelPackageImpl extends EPackageImpl implements GenModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attaqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dresseurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supporteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jeuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maitreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum niveauEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categorieEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDegatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calculDegatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenModelPackageImpl() {
		super(eNS_URI, GenModelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GenModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenModelPackage init() {
		if (isInited) return (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenModelPackageImpl theModelPackage = registeredModelPackage instanceof GenModelPackageImpl ? (GenModelPackageImpl)registeredModelPackage : new GenModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelled() {
		return labelledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelled_Nom() {
		return (EAttribute)labelledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelled_Description() {
		return (EAttribute)labelledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergie() {
		return energieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergie_Categorie() {
		return (EAttribute)energieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnergie__EstCompatibleCreature__GenCreature() {
		return energieEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttaque() {
		return attaqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttaque_DegatAttaque() {
		return (EReference)attaqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttaque_BesoinEnergieCategorie() {
		return (EAttribute)attaqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttaque_BesoinEnergieAutre() {
		return (EAttribute)attaqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttaque_Categorie() {
		return (EAttribute)attaqueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttaque__EstDisponible__GenCreature() {
		return attaqueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttaque__EstCompatible__GenCreature() {
		return attaqueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttaque__Attaque__GenCreature_GenCreature() {
		return attaqueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegat() {
		return degatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegat_Type() {
		return (EAttribute)degatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegat_ModeCalcul() {
		return (EAttribute)degatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegat_Degat() {
		return (EAttribute)degatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegat_Incertitude() {
		return (EAttribute)degatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegat_ChanceRattage() {
		return (EAttribute)degatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDegat__GetCalculDegat__GenCreature_GenCreature() {
		return degatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarte() {
		return carteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCarte__EstVisible() {
		return carteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDresseur() {
		return dresseurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjet() {
		return objetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupporteur() {
		return supporteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeck() {
		return deckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeck_Cartes() {
		return (EReference)deckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__Piocher() {
		return deckEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__GetCreatureBase() {
		return deckEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__GetCreatureEvolution() {
		return deckEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__GetEnergie() {
		return deckEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__GetObjet() {
		return deckEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeck__GetSupporteur() {
		return deckEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJeu() {
		return jeuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJeu_Deck() {
		return (EReference)jeuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJeu_PileDefausse() {
		return (EReference)jeuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJeu_CreatureActive() {
		return (EReference)jeuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJeu_Banc() {
		return (EReference)jeuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJeu_CarteRecompense() {
		return (EReference)jeuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJeu__FinTour() {
		return jeuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJeu__FinOption() {
		return jeuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJeu__Abandonner() {
		return jeuEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreature() {
		return creatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_Base() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_Evolution() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_Maitre() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreature_Pv() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreature_PvInit() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreature_Nom() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreature_Description() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreature_Categorie() {
		return (EAttribute)creatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_Attaques() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_DegatDefense() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreature_Energies() {
		return (EReference)creatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCreature__EstCompatibleEvolution__GenCreature() {
		return creatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCreature__FaireEvoluer__GenCreature() {
		return creatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCreature__GetNiveau() {
		return creatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCreature__EstMort() {
		return creatureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase() {
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase_PvInit() {
		return (EAttribute)baseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase_Categorie() {
		return (EAttribute)baseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBase_Attaques() {
		return (EReference)baseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBase_DegatDefense() {
		return (EReference)baseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvolution() {
		return evolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvolution_Base() {
		return (EReference)evolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaitre() {
		return maitreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaitre_Evolution() {
		return (EReference)maitreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNiveau() {
		return niveauEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategorie() {
		return categorieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeDegat() {
		return typeDegatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCalculDegat() {
		return calculDegatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenModelFactory getModelFactory() {
		return (GenModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		labelledEClass = createEClass(LABELLED);
		createEAttribute(labelledEClass, LABELLED__NOM);
		createEAttribute(labelledEClass, LABELLED__DESCRIPTION);

		energieEClass = createEClass(ENERGIE);
		createEAttribute(energieEClass, ENERGIE__CATEGORIE);
		createEOperation(energieEClass, ENERGIE___EST_COMPATIBLE_CREATURE__GENCREATURE);

		attaqueEClass = createEClass(ATTAQUE);
		createEReference(attaqueEClass, ATTAQUE__DEGAT_ATTAQUE);
		createEAttribute(attaqueEClass, ATTAQUE__BESOIN_ENERGIE_CATEGORIE);
		createEAttribute(attaqueEClass, ATTAQUE__BESOIN_ENERGIE_AUTRE);
		createEAttribute(attaqueEClass, ATTAQUE__CATEGORIE);
		createEOperation(attaqueEClass, ATTAQUE___EST_DISPONIBLE__GENCREATURE);
		createEOperation(attaqueEClass, ATTAQUE___EST_COMPATIBLE__GENCREATURE);
		createEOperation(attaqueEClass, ATTAQUE___ATTAQUE__GENCREATURE_GENCREATURE);

		degatEClass = createEClass(DEGAT);
		createEAttribute(degatEClass, DEGAT__TYPE);
		createEAttribute(degatEClass, DEGAT__MODE_CALCUL);
		createEAttribute(degatEClass, DEGAT__DEGAT);
		createEAttribute(degatEClass, DEGAT__INCERTITUDE);
		createEAttribute(degatEClass, DEGAT__CHANCE_RATTAGE);
		createEOperation(degatEClass, DEGAT___GET_CALCUL_DEGAT__GENCREATURE_GENCREATURE);

		carteEClass = createEClass(CARTE);
		createEOperation(carteEClass, CARTE___EST_VISIBLE);

		dresseurEClass = createEClass(DRESSEUR);

		objetEClass = createEClass(OBJET);

		supporteurEClass = createEClass(SUPPORTEUR);

		deckEClass = createEClass(DECK);
		createEReference(deckEClass, DECK__CARTES);
		createEOperation(deckEClass, DECK___PIOCHER);
		createEOperation(deckEClass, DECK___GET_CREATURE_BASE);
		createEOperation(deckEClass, DECK___GET_CREATURE_EVOLUTION);
		createEOperation(deckEClass, DECK___GET_ENERGIE);
		createEOperation(deckEClass, DECK___GET_OBJET);
		createEOperation(deckEClass, DECK___GET_SUPPORTEUR);

		jeuEClass = createEClass(JEU);
		createEReference(jeuEClass, JEU__DECK);
		createEReference(jeuEClass, JEU__PILE_DEFAUSSE);
		createEReference(jeuEClass, JEU__CREATURE_ACTIVE);
		createEReference(jeuEClass, JEU__BANC);
		createEReference(jeuEClass, JEU__CARTE_RECOMPENSE);
		createEOperation(jeuEClass, JEU___FIN_TOUR);
		createEOperation(jeuEClass, JEU___FIN_OPTION);
		createEOperation(jeuEClass, JEU___ABANDONNER);

		creatureEClass = createEClass(CREATURE);
		createEReference(creatureEClass, CREATURE__ENERGIES);
		createEReference(creatureEClass, CREATURE__BASE);
		createEReference(creatureEClass, CREATURE__EVOLUTION);
		createEReference(creatureEClass, CREATURE__MAITRE);
		createEAttribute(creatureEClass, CREATURE__PV);
		createEAttribute(creatureEClass, CREATURE__PV_INIT);
		createEAttribute(creatureEClass, CREATURE__NOM);
		createEAttribute(creatureEClass, CREATURE__DESCRIPTION);
		createEAttribute(creatureEClass, CREATURE__CATEGORIE);
		createEReference(creatureEClass, CREATURE__ATTAQUES);
		createEReference(creatureEClass, CREATURE__DEGAT_DEFENSE);
		createEOperation(creatureEClass, CREATURE___EST_COMPATIBLE_EVOLUTION__GENCREATURE);
		createEOperation(creatureEClass, CREATURE___FAIRE_EVOLUER__GENCREATURE);
		createEOperation(creatureEClass, CREATURE___GET_NIVEAU);
		createEOperation(creatureEClass, CREATURE___EST_MORT);

		baseEClass = createEClass(BASE);
		createEAttribute(baseEClass, BASE__PV_INIT);
		createEAttribute(baseEClass, BASE__CATEGORIE);
		createEReference(baseEClass, BASE__ATTAQUES);
		createEReference(baseEClass, BASE__DEGAT_DEFENSE);

		evolutionEClass = createEClass(EVOLUTION);
		createEReference(evolutionEClass, EVOLUTION__BASE);

		maitreEClass = createEClass(MAITRE);
		createEReference(maitreEClass, MAITRE__EVOLUTION);

		// Create enums
		niveauEEnum = createEEnum(NIVEAU);
		categorieEEnum = createEEnum(CATEGORIE);
		typeDegatEEnum = createEEnum(TYPE_DEGAT);
		calculDegatEEnum = createEEnum(CALCUL_DEGAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		energieEClass.getESuperTypes().add(this.getCarte());
		energieEClass.getESuperTypes().add(this.getLabelled());
		attaqueEClass.getESuperTypes().add(this.getLabelled());
		dresseurEClass.getESuperTypes().add(this.getCarte());
		dresseurEClass.getESuperTypes().add(this.getLabelled());
		objetEClass.getESuperTypes().add(this.getDresseur());
		supporteurEClass.getESuperTypes().add(this.getDresseur());
		deckEClass.getESuperTypes().add(this.getLabelled());
		creatureEClass.getESuperTypes().add(this.getCarte());
		baseEClass.getESuperTypes().add(this.getLabelled());
		evolutionEClass.getESuperTypes().add(this.getBase());
		maitreEClass.getESuperTypes().add(this.getEvolution());

		// Initialize classes, features, and operations; add parameters
		initEClass(labelledEClass, Labelled.class, "Labelled", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelled_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Labelled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelled_Description(), ecorePackage.getEString(), "description", null, 0, 1, Labelled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energieEClass, Energie.class, "Energie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergie_Categorie(), this.getCategorie(), "categorie", null, 0, 1, Energie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEnergie__EstCompatibleCreature__GenCreature(), ecorePackage.getEBoolean(), "estCompatibleCreature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "creature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attaqueEClass, Attaque.class, "Attaque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttaque_DegatAttaque(), this.getDegat(), null, "degatAttaque", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttaque_BesoinEnergieCategorie(), ecorePackage.getEInt(), "besoinEnergieCategorie", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttaque_BesoinEnergieAutre(), ecorePackage.getEInt(), "besoinEnergieAutre", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttaque_Categorie(), this.getCategorie(), "categorie", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAttaque__EstDisponible__GenCreature(), ecorePackage.getEBoolean(), "estDisponible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "creature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttaque__EstCompatible__GenCreature(), ecorePackage.getEBoolean(), "estCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "creature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttaque__Attaque__GenCreature_GenCreature(), null, "attaque", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "lanceur", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "receveur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(degatEClass, Degat.class, "Degat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegat_Type(), this.getTypeDegat(), "type", null, 0, 1, Degat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegat_ModeCalcul(), this.getCalculDegat(), "modeCalcul", null, 0, 1, Degat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegat_Degat(), ecorePackage.getEInt(), "degat", "0", 0, 1, Degat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegat_Incertitude(), ecorePackage.getEInt(), "incertitude", "0", 0, 1, Degat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegat_ChanceRattage(), ecorePackage.getEInt(), "chanceRattage", "0", 0, 1, Degat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDegat__GetCalculDegat__GenCreature_GenCreature(), ecorePackage.getEInt(), "getCalculDegat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "attaquant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "defenseur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(carteEClass, Carte.class, "Carte", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCarte__EstVisible(), ecorePackage.getEBoolean(), "estVisible", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dresseurEClass, Dresseur.class, "Dresseur", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objetEClass, Objet.class, "Objet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supporteurEClass, Supporteur.class, "Supporteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeck_Cartes(), this.getCarte(), null, "cartes", null, 0, -1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeck__Piocher(), this.getCarte(), "piocher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__GetCreatureBase(), this.getCarte(), "getCreatureBase", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__GetCreatureEvolution(), this.getCarte(), "getCreatureEvolution", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__GetEnergie(), this.getCarte(), "getEnergie", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__GetObjet(), this.getCarte(), "getObjet", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeck__GetSupporteur(), this.getCarte(), "getSupporteur", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(jeuEClass, Jeu.class, "Jeu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJeu_Deck(), this.getDeck(), null, "deck", null, 0, 1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJeu_PileDefausse(), this.getCarte(), null, "pileDefausse", null, 0, -1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJeu_CreatureActive(), this.getCreature(), null, "creatureActive", null, 0, 1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJeu_Banc(), this.getCreature(), null, "banc", null, 0, -1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJeu_CarteRecompense(), this.getCarte(), null, "carteRecompense", null, 0, -1, Jeu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getJeu__FinTour(), null, "finTour", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJeu__FinOption(), null, "finOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getJeu__Abandonner(), null, "abandonner", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(creatureEClass, Creature.class, "Creature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreature_Energies(), this.getEnergie(), null, "energies", null, 0, -1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_Base(), this.getBase(), null, "base", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_Evolution(), this.getEvolution(), null, "evolution", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_Maitre(), this.getMaitre(), null, "maitre", null, 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Pv(), ecorePackage.getEInt(), "pv", "0", 0, 1, Creature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_PvInit(), ecorePackage.getEInt(), "pvInit", "0", 0, 1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreature_Categorie(), this.getCategorie(), "categorie", null, 1, 1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_Attaques(), this.getAttaque(), null, "attaques", null, 0, -1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreature_DegatDefense(), this.getDegat(), null, "degatDefense", null, 0, 1, Creature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCreature__EstCompatibleEvolution__GenCreature(), ecorePackage.getEBoolean(), "estCompatibleEvolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "creature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreature__FaireEvoluer__GenCreature(), null, "faireEvoluer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCreature(), "creature", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCreature__GetNiveau(), this.getNiveau(), "getNiveau", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCreature__EstMort(), ecorePackage.getEBoolean(), "estMort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase_PvInit(), ecorePackage.getEInt(), "pvInit", "0", 0, 1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase_Categorie(), this.getCategorie(), "categorie", null, 1, 1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase_Attaques(), this.getAttaque(), null, "attaques", null, 0, -1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBase_DegatDefense(), this.getDegat(), null, "degatDefense", null, 0, 1, Base.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolutionEClass, Evolution.class, "Evolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvolution_Base(), this.getBase(), null, "base", null, 0, 1, Evolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maitreEClass, Maitre.class, "Maitre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaitre_Evolution(), this.getEvolution(), null, "evolution", null, 0, 1, Maitre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(niveauEEnum, Niveau.class, "Niveau");
		addEEnumLiteral(niveauEEnum, Niveau.BASE);
		addEEnumLiteral(niveauEEnum, Niveau.EVOLUTION);
		addEEnumLiteral(niveauEEnum, Niveau.MAITRE);

		initEEnum(categorieEEnum, Categorie.class, "Categorie");
		addEEnumLiteral(categorieEEnum, Categorie.CLASSIQUE);
		addEEnumLiteral(categorieEEnum, Categorie.ADORABLE);
		addEEnumLiteral(categorieEEnum, Categorie.MALEFIQUE);
		addEEnumLiteral(categorieEEnum, Categorie.MAJESTUEUX);
		addEEnumLiteral(categorieEEnum, Categorie.WHAT_THE_FUCK);

		initEEnum(typeDegatEEnum, TypeDegat.class, "TypeDegat");
		addEEnumLiteral(typeDegatEEnum, TypeDegat.ATTAQUE);
		addEEnumLiteral(typeDegatEEnum, TypeDegat.DEFENSE);

		initEEnum(calculDegatEEnum, CalculDegat.class, "CalculDegat");
		addEEnumLiteral(calculDegatEEnum, CalculDegat.BASE);
		addEEnumLiteral(calculDegatEEnum, CalculDegat.RATIO);

		// Create resource
		createResource(eNS_URI);
	}

} //GenModelPackageImpl
