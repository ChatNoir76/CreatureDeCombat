package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.service.DeckService;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto.DeckCarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service.DeckCarteService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/decks")
public class DeckController {

	@Autowired
	HateoasService hateoas;
	
	@Autowired
	DeckService deckService;
	
	@Autowired
	DeckCarteService dcService;
	
	@GetMapping(value = "")
	public List<DeckDTO> getAllDeck() {
		
		List<DeckDTO> decks = deckService.getAll();
		decks.forEach(deck -> {
			deck.add(hateoas.getSelfLink(
					DeckController.class, 
					"getDeckById",
					deck.getId()));
		});
		return decks;
	}
	
	@GetMapping(value = "/{deckId}")
	public List<DeckCarteDTO> getDeckById(@PathVariable("deckId") String deckId) {
		
		DeckDTO deck = deckService.getById(deckId);
		List<DeckCarteDTO> liste = dcService.getByDeckId(deck.getId());
		
		liste.forEach(dc -> {
			dc.add(hateoas.getRelLink(
					CarteController.class, 
					"getCarteById", 
					dc.getId_carte(), 
					"carte%s".formatted(dc.getId_carte())));
		});
		
		
//		creatures.forEach(creature -> {
//			creature.add(hateoas.getSelfLink(
//					CreatureController.class, 
//					"getCreatureById",  
//					creature.getId()));
//		});
		return liste;
	}
	
}
