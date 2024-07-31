package fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;

public class DeckDTOFull extends DeckDTO {

	private List<CarteDTO> cartes;
	
	public DeckDTOFull(DeckDTO deck) {
		this.setDescription(deck.getDescription());
		this.setId(deck.getId());
		this.setNom(deck.getNom());
	}

	public List<CarteDTO> getCartes() {
		return cartes;
	}

	public void setCartes(List<CarteDTO> cartes) {
		this.cartes = cartes;
	}
	
}
