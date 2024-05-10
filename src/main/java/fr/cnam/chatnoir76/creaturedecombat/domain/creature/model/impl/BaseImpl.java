package fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.impl;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CreatureComponent;

// This class overrides the generated class and will be instantiated by factory
public class BaseImpl extends GenBaseImpl implements Base
{

	@Override
	public CreatureComponent getActiveCreatureComponent() {
		return this;
	}

	@Override
	public CreatureComponent getBaseEvolution() {
		return null;
	}

}
