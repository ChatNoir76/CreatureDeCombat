/**
 */
package fr.cnam.chatnoir76.creaturedecombat.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.cnam.chatnoir76.creaturedecombat.model.GenModelPackage#getCategorie()
 * @model
 * @generated
 */
public enum Categorie implements Enumerator {
	/**
	 * The '<em><b>Adorable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADORABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ADORABLE(0, "Adorable", "Adorable"),

	/**
	 * The '<em><b>Malefique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALEFIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	MALEFIQUE(1, "Malefique", "Malefique"),

	/**
	 * The '<em><b>Majestueux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJESTUEUX_VALUE
	 * @generated
	 * @ordered
	 */
	MAJESTUEUX(2, "Majestueux", "Majestueux"),

	/**
	 * The '<em><b>What The Fuck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHAT_THE_FUCK_VALUE
	 * @generated
	 * @ordered
	 */
	WHAT_THE_FUCK(3, "WhatTheFuck", "WhatTheFuck"),

	/**
	 * The '<em><b>Classique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIQUE(4, "Classique", "Classique");

	/**
	 * The '<em><b>Adorable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADORABLE
	 * @model name="Adorable"
	 * @generated
	 * @ordered
	 */
	public static final int ADORABLE_VALUE = 0;

	/**
	 * The '<em><b>Malefique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALEFIQUE
	 * @model name="Malefique"
	 * @generated
	 * @ordered
	 */
	public static final int MALEFIQUE_VALUE = 1;

	/**
	 * The '<em><b>Majestueux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJESTUEUX
	 * @model name="Majestueux"
	 * @generated
	 * @ordered
	 */
	public static final int MAJESTUEUX_VALUE = 2;

	/**
	 * The '<em><b>What The Fuck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHAT_THE_FUCK
	 * @model name="WhatTheFuck"
	 * @generated
	 * @ordered
	 */
	public static final int WHAT_THE_FUCK_VALUE = 3;

	/**
	 * The '<em><b>Classique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIQUE
	 * @model name="Classique"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIQUE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Categorie[] VALUES_ARRAY =
		new Categorie[] {
			ADORABLE,
			MALEFIQUE,
			MAJESTUEUX,
			WHAT_THE_FUCK,
			CLASSIQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Categorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categorie get(int value) {
		switch (value) {
			case ADORABLE_VALUE: return ADORABLE;
			case MALEFIQUE_VALUE: return MALEFIQUE;
			case MAJESTUEUX_VALUE: return MAJESTUEUX;
			case WHAT_THE_FUCK_VALUE: return WHAT_THE_FUCK;
			case CLASSIQUE_VALUE: return CLASSIQUE;
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
	private Categorie(int value, String name, String literal) {
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
	
} //Categorie
