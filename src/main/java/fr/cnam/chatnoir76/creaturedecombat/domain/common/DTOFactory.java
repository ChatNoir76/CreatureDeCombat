package fr.cnam.chatnoir76.creaturedecombat.domain.common;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;

public class DTOFactory {

	private DTOFactory() {}
	
	public static final DegatDTO createDegatDTO() {
		return new DegatDTO();
	}
	
	public static final AttaqueDTO createAttaqueDTO() {
		return new AttaqueDTO();
	}
	
	public static final CarteCreatureDTO createCarteCreatureDTO() {
		return new CarteCreatureDTO();
	}
	
	public static final CarteEnergieDTO createCarteEnergieDTO() {
		return new CarteEnergieDTO();
	}
	
	public static final CarteDresseurDTO createCarteDresseurDTO() {
		return new CarteDresseurDTO();
	}
	
	public static final DeckDTO createDeckDTO() {
		return new DeckDTO();
	}
}
