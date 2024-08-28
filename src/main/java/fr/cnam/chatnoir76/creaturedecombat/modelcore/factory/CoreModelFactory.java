package fr.cnam.chatnoir76.creaturedecombat.modelcore.factory;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.AbstractCreatureComponent;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.model.CalculDegat;
import fr.cnam.chatnoir76.creaturedecombat.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.model.Degat;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;
import fr.cnam.chatnoir76.creaturedecombat.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.model.ModelFactory;
import fr.cnam.chatnoir76.creaturedecombat.model.Niveau;
import fr.cnam.chatnoir76.creaturedecombat.model.TypeDegat;

public interface CoreModelFactory extends ModelFactory {
	
	CoreModelFactory eINSTANCE = CoreModelFactoryImpl.init();

	public Categorie createCategorie(String categorie);
	
	public Niveau createNiveau(String niveau);
	
	public CalculDegat createCalculDegat(String calculDegat);
	
	public TypeDegat createTypeDegat(String typeDegat);
	
	public Degat createDegat(DegatDTO dto);
	
	public Attaque createAttaque(AttaqueDTO dto);
	
	public Base createBase(CarteCreatureDTO dto);
	
	public Evolution createEvolution(CarteCreatureDTO dto);
	
	public Maitre createMaitre(CarteCreatureDTO dto);
	
	public AbstractCreatureComponent createCreatureComponent(CarteCreatureDTO dto);
	
	public Energie createEnergie(CarteEnergieDTO dto);
	
	public Dresseur createDresseur(CarteDresseurDTO dto);
	
	public Deck createDeck(DeckDTO dto);
	
	public Jeu createJeu(JeuDTO dto);
	
}
