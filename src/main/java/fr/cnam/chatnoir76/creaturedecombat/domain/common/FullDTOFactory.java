package fr.cnam.chatnoir76.creaturedecombat.domain.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.service.CarteService;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.service.CreatureService;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.service.DeckService;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service.DeckCarteService;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatService;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;

@Service
public class FullDTOFactory {

	@Autowired
	DeckService deckService;
	
	@Autowired
	CarteService carteService;
	
	@Autowired
	DeckCarteService dcService;
	
	@Autowired
	CreatureService creatureService;
	
	@Autowired
	AttaqueService attaqueService;
	
	@Autowired
	DegatService degatService;
	
	public AttaqueDTOFull createAttaqueDTOFull(AttaqueDTO attaque) {
		AttaqueDTOFull full = new AttaqueDTOFull(attaque);
		full.setDegatDTO(degatService.getByAttaque(attaque));
		return full;
	}
	
	public CarteCreatureDTOFull createCarteCreatureDTOFull(CarteCreatureDTO creature) {
		if(creature == null) return null;
		DegatDTO degatDefense = null;
		CarteCreatureDTOFull base = this.createCarteCreatureDTOFull(creatureService.getById(creature.getIdCreatureBase()));
		List<AttaqueDTOFull> attaques = attaqueService.getByCreatureId(creature.getId()).stream().map(a -> this.createAttaqueDTOFull(a)).toList();
		
		CarteCreatureDTOFull full = new CarteCreatureDTOFull(creature);
		full.setDegatDefense(degatDefense);
		full.setAttaques(attaques);
		full.setCreatureBase(base);
		return full;
	}
	
	public CarteDTO createCarteDTOFull(CarteDTO carte) {
		
		if(carte instanceof CarteCreatureDTO) {
			return this.createCarteCreatureDTOFull((CarteCreatureDTO) carte);
		} else if(carte instanceof CarteEnergieDTO) {
			return carte;
		} else if(carte instanceof CarteDresseurDTO) {
			return carte;
		} else {
			return carte;
		}
	}
	
	public DeckDTOFull createDeckDTOFull(DeckDTO deck) {
		DeckDTOFull full = new DeckDTOFull(deck);
		full.setCartes(carteService.getByDeck(deck).stream().map(c -> this.createCarteDTOFull(c)).toList());
		return full;
	}	
	
	public JeuDTO createJeuDTOFull(JeuDTO dto) {
		
		
		
		
		return null;
	}
	
}
