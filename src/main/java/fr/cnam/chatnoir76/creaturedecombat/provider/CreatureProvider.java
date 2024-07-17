package fr.cnam.chatnoir76.creaturedecombat.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;

@Component
public class CreatureProvider {

	@Autowired
	AttaqueProvider attaqueProvider;
	
	public Creature getWorms() {
		Base base = ModelFactory.eINSTANCE.createBase();
		base.setNom("Magic Blue");
		base.setDescription("Une créature bleue claire qui illumine les paysages endormis");
		base.setPvInit(120);
		base.setCategorie(Categorie.MAJESTUEUX);
		base.setNiveau(Niveau.BASE);
		
		Creature worms = ModelFactory.eINSTANCE.createCreature(base.getActiveCreatureComponent());
		worms.setPv(95);
		worms.getAttaques().add(attaqueProvider.getHache());
		worms.getAttaques().add(attaqueProvider.getAuraRegeneratrice());
		return worms;
	}
	
}
