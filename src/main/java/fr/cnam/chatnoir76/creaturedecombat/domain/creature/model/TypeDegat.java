/**
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Degat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenModelPackage#getTypeDegat()
 * @model
 * @generated
 */
public enum TypeDegat implements Enumerator {
	/**
	 * The '<em><b>Attaque</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTAQUE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTAQUE(1, "Attaque", "Attaque"),

	/**
	 * The '<em><b>Defense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENSE_VALUE
	 * @generated
	 * @ordered
	 */
	DEFENSE(-1, "Defense", "Defense");

	/**
	 * The '<em><b>Attaque</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTAQUE
	 * @model name="Attaque"
	 * @generated
	 * @ordered
	 */
	public static final int ATTAQUE_VALUE = 1;

	/**
	 * The '<em><b>Defense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENSE
	 * @model name="Defense"
	 * @generated
	 * @ordered
	 */
	public static final int DEFENSE_VALUE = -1;

	/**
	 * An array of all the '<em><b>Type Degat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDegat[] VALUES_ARRAY =
		new TypeDegat[] {
			ATTAQUE,
			DEFENSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Degat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDegat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Degat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDegat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDegat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Degat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDegat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDegat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Degat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeDegat get(int value) {
		switch (value) {
			case ATTAQUE_VALUE: return ATTAQUE;
			case DEFENSE_VALUE: return DEFENSE;
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
	private TypeDegat(int value, String name, String literal) {
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
	
} //TypeDegat
