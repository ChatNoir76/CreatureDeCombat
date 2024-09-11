package fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.impl;

import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.Rule;

public class EstPretAJouerRule implements Rule {

	@Override
	public boolean matches(Jeu jeu) {
		int count = jeu.getMain().size();
		if(count < 5) return false;
		long base = jeu.getMain().stream().filter(c -> c instanceof Creature).map(carte -> (Creature) carte).filter(creature -> creature.getNiveau().equals(Niveau.BASE)).count();
		if(base < 1) return false;
		return true;
	}

}
