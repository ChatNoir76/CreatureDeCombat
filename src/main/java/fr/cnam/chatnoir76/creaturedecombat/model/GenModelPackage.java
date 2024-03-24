/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	int LABELLED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Labelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Labelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELLED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl <em>Creature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreature()
	 * @generated
	 */
	int CREATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__NAME = LABELLED__NAME;

	/**
	 * The feature id for the '<em><b>Pv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE__PV = LABELLED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_FEATURE_COUNT = LABELLED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Creature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATURE_OPERATION_COUNT = LABELLED_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled <em>Labelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labelled</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled
	 * @generated
	 */
	EClass getLabelled();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenLabelled#getName()
	 * @see #getLabelled()
	 * @generated
	 */
	EAttribute getLabelled_Name();

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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl <em>Creature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenCreatureImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.model.impl.GenModelPackageImpl#getCreature()
		 * @generated
		 */
		EClass CREATURE = eINSTANCE.getCreature();

		/**
		 * The meta object literal for the '<em><b>Pv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATURE__PV = eINSTANCE.getCreature_Pv();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELLED__NAME = eINSTANCE.getLabelled_Name();

	}

} //GenModelPackage
