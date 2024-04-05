package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Energie;

// This class overrides the generated class and will be instantiated by factory
public class EnergieImpl extends GenEnergieImpl implements Energie
{
	@Override
	public boolean estCompatibleCreature(Creature creature) {
		if(this.categorie != Categorie.CLASSIQUE) {
			return this.categorie.equals(creature.getCategorie());
		} else {
			return true;
		}
	}
}
