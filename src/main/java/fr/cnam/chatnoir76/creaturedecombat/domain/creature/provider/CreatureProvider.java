package fr.cnam.chatnoir76.creaturedecombat.domain.creature.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Niveau;

@Component
public class CreatureProvider {

	@Autowired
	AttaqueProvider attaqueProvider;
	
	public Creature getWorms() {
		Base base = ModelFactory.eINSTANCE.createBase();
		base.setNom("Worms");
		base.setDescription("Worms avec une hache tout droit sorti de Worms Armageddon");
		base.setPvInit(120);
		base.setCategorie(Categorie.CLASSIQUE);
		base.setNiveau(Niveau.BASE);
		
		Creature worms = ModelFactory.eINSTANCE.createCreature(base.getActiveCreatureComponent());
		worms.setPv(95);
		worms.getAttaques().add(attaqueProvider.getHache());
		return worms;
	}
	
}
