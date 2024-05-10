package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;

// This class overrides the generated class and will be instantiated by factory
public class EvolutionImpl extends GenEvolutionImpl implements Evolution
{

	@Override
	public CreatureComponent getActiveCreatureComponent() {
		return this;
	}
	
	@Override
	public CreatureComponent getBaseEvolution() {
		return this.getBase();
	}

}
