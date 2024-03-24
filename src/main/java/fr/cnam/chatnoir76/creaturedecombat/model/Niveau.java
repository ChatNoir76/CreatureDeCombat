/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Niveau</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getNiveau()
 * @model
 * @generated
 */
public enum Niveau implements Enumerator {
	/**
	 * The '<em><b>Base</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_VALUE
	 * @generated
	 * @ordered
	 */
	BASE(0, "Base", "Base"),

	/**
	 * The '<em><b>Evolution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	EVOLUTION(1, "Evolution", "Evolution"),

	/**
	 * The '<em><b>Maitre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAITRE_VALUE
	 * @generated
	 * @ordered
	 */
	MAITRE(2, "Maitre", "Maitre");

	/**
	 * The '<em><b>Base</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE
	 * @model name="Base"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_VALUE = 0;

	/**
	 * The '<em><b>Evolution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVOLUTION
	 * @model name="Evolution"
	 * @generated
	 * @ordered
	 */
	public static final int EVOLUTION_VALUE = 1;

	/**
	 * The '<em><b>Maitre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAITRE
	 * @model name="Maitre"
	 * @generated
	 * @ordered
	 */
	public static final int MAITRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Niveau</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Niveau[] VALUES_ARRAY =
		new Niveau[] {
			BASE,
			EVOLUTION,
			MAITRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Niveau</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Niveau> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Niveau</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Niveau get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Niveau result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Niveau</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Niveau getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Niveau result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Niveau</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Niveau get(int value) {
		switch (value) {
			case BASE_VALUE: return BASE;
			case EVOLUTION_VALUE: return EVOLUTION;
			case MAITRE_VALUE: return MAITRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Niveau(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Niveau
