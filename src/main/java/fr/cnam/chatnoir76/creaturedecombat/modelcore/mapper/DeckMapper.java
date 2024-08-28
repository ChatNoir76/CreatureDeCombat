package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.model.Deck;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class DeckMapper {

	@Autowired
	CarteMapper carteMapper;
	
	public Deck toCore(DeckDTOFull dto) {
		if(dto == null) return null;
		Deck deck = CoreModelFactory.eINSTANCE.createDeck(dto);
		deck.getCartes().addAll(dto.getCartes().stream().map(carte_dto -> carteMapper.toCore(carte_dto)).toList());
		
		return deck;
	}
	
}
