/**
 *
 * $Id$
 */
package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.validation;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Carte;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.GenDeck}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DeckValidator {
	boolean validate();

	boolean validateCartes(EList<Carte> value);
}
