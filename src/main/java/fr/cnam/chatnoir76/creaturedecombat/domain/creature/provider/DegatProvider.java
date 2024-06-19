package fr.cnam.chatnoir76.creaturedecombat.domain.creature.provider;

import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.TypeDegat;

@Component
public class DegatProvider {

	public Degat getDecoupage() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(0);
		degat.setIncertitude(0);
		degat.setDegat(50);
		degat.setModeCalcul(CalculDegat.RATIO);
		degat.setType(TypeDegat.ATTAQUE);
		return degat;
	}
	
}
