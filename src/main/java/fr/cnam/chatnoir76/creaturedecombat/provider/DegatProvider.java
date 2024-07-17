package fr.cnam.chatnoir76.creaturedecombat.provider;

import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;

@Component
public class DegatProvider {

	public Degat getDecoupage() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(0);
		degat.setIncertitude(0);
		degat.setDegat(40);
		degat.setModeCalcul(CalculDegat.RATIO);
		degat.setType(TypeDegat.ATTAQUE);
		return degat;
	}
	
	public Degat getFixeRegeneration(int value) {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(0);
		degat.setIncertitude(0);
		degat.setDegat(value);
		degat.setModeCalcul(CalculDegat.BASE);
		degat.setType(TypeDegat.DEFENSE);
		return degat;
	}
	
}
