package fr.cnam.chatnoir76.creaturedecombat.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;

@Component
public class AttaqueProvider {
	
	@Autowired
	DegatProvider degatProvider;

	public Attaque getHache() {
		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
		attaque.setNom("Coup d'aile");
		attaque.setDescription("Un coup qui tranche et qui découpe...");
		attaque.setCategorie(Categorie.CLASSIQUE);
		attaque.setBesoinEnergieCategorie(0);
		attaque.setBesoinEnergieAutre(0);
		attaque.setDegatAttaque(degatProvider.getDecoupage());
		return attaque;
	}
	
	public Attaque getAuraRegeneratrice() {
		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
		attaque.setNom("Aura");
		attaque.setDescription("Rénéneration depuis la lumière extérieure");
		attaque.setCategorie(Categorie.MAJESTUEUX);
		attaque.setBesoinEnergieCategorie(2);
		attaque.setBesoinEnergieAutre(1);
		attaque.setDegatAttaque(degatProvider.getFixeRegeneration(60));
		return attaque;
	}
	
}
