package fr.cnam.chatnoir76.creaturedecombat.modelcore.provider;

import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;

public class DegatProvider {

	public static Degat getDefenseAdorable() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(0);
		degat.setIncertitude(0);
		degat.setDegat(40);
		degat.setModeCalcul(CalculDegat.RATIO);
		degat.setType(TypeDegat.DEFENSE);
		return degat;
	}
	
	public static Degat getDefenseMajestueux() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(20);
		degat.setIncertitude(10);
		degat.setDegat(15);
		degat.setModeCalcul(CalculDegat.BASE);
		degat.setType(TypeDegat.ATTAQUE);
		return degat;
	}
	
	public static Degat getDefenseMalefique() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(80);
		degat.setIncertitude(20);
		degat.setDegat(25);
		degat.setModeCalcul(CalculDegat.BASE);
		degat.setType(TypeDegat.ATTAQUE);
		return degat;
	}
	
	public static Degat getDefenseWhatTheFuck() {
		Degat degat = ModelFactory.eINSTANCE.createDegat();
		degat.setChanceRattage(50);
		degat.setIncertitude(4);
		degat.setDegat(10);
		degat.setModeCalcul(CalculDegat.RATIO);
		degat.setType(TypeDegat.ATTAQUE);
		return degat;
	}
	
	public static Degat getDefenseClassique() {
		return null;
	}
	
}
