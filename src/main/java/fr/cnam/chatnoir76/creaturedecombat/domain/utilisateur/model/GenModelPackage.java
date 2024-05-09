/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenModelFactory
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
	String eNS_URI = "http://utilisateur/model";

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
	GenModelPackage eINSTANCE = fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenUtilisateurImpl <em>Utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenUtilisateurImpl
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenModelPackageImpl#getUtilisateur()
	 * @generated
	 */
	int UTILISATEUR = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Check Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR___CHECK_PASSWORD__STRING = 0;

	/**
	 * The number of operations of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateur</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur
	 * @generated
	 */
	EClass getUtilisateur();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#getNom()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#getPassword()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Password();

	/**
	 * Returns the meta object for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#checkPassword(java.lang.String) <em>Check Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Password</em>' operation.
	 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.GenUtilisateur#checkPassword(java.lang.String)
	 * @generated
	 */
	EOperation getUtilisateur__CheckPassword__String();

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
		 * The meta object literal for the '{@link fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenUtilisateurImpl <em>Utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenUtilisateurImpl
		 * @see fr.cnam.chatnoir76.creaturedecombat.domain.utilisateur.model.impl.GenModelPackageImpl#getUtilisateur()
		 * @generated
		 */
		EClass UTILISATEUR = eINSTANCE.getUtilisateur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__NOM = eINSTANCE.getUtilisateur_Nom();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__PASSWORD = eINSTANCE.getUtilisateur_Password();

		/**
		 * The meta object literal for the '<em><b>Check Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UTILISATEUR___CHECK_PASSWORD__STRING = eINSTANCE.getUtilisateur__CheckPassword__String();

	}

} //GenModelPackage
