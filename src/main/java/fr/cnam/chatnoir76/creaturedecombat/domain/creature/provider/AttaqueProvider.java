package fr.cnam.chatnoir76.creaturedecombat.domain.creature.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;

@Component
public class AttaqueProvider {
	
	@Autowired
	DegatProvider degatProvider;

	public Attaque getHache() {
		Attaque attaque = ModelFactory.eINSTANCE.createAttaque();
		attaque.setNom("Hache");
		attaque.setDescription("Une hache en métal");
		attaque.setCategorie(Categorie.CLASSIQUE);
		attaque.setBesoinEnergieCategorie(0);
		attaque.setBesoinEnergieAutre(0);
		attaque.setDegatAttaque(degatProvider.getDecoupage());
		return attaque;
	}
	
}
