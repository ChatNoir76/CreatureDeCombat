package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.jeu.dto.JeuDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Jeu;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class JeuMapper {
	
	@Autowired
	CreatureMapper creatureMapper;
	
	@Autowired
	DeckMapper deckMapper;
	
	@Autowired
	CarteMapper carteMapper;

	public Jeu toCore(JeuDTO dto) {
		if(dto == null) return null;
		Jeu jeu = CoreModelFactory.eINSTANCE.createJeu(dto);
		jeu.setCreatureActive(creatureMapper.toCore(dto.getCreatureActive()));
		jeu.setDeck(deckMapper.toCore(dto.getDeck()));
		jeu.getMain().addAll(CarteListToCore(dto.getMain()));
		jeu.getBanc().addAll(dto.getBanc().stream().map(c -> creatureMapper.toCore(c)).toList());
		jeu.getCarteRecompense().addAll(CarteListToCore(dto.getRecompense()));
		jeu.getPileDefausse().addAll(CarteListToCore(dto.getPileDefausse()));
		jeu.setPseudo(dto.getPseudo());
		return jeu;
	}
	
	public JeuDTO toDTO(Jeu jeu) {
		JeuDTO dto = new JeuDTO();
		dto.setBanc(jeu.getBanc().stream().map(c -> creatureMapper.toDTO(c)).toList());
		dto.setCreatureActive(creatureMapper.toDTO(jeu.getCreatureActive()));
		dto.setDeck(deckMapper.toDTO(jeu.getDeck()));
		dto.setMain(jeu.getMain().stream().map(c -> carteMapper.toDTO(c)).toList());
		dto.setPileDefausse(jeu.getPileDefausse().stream().map(c -> carteMapper.toDTO(c)).toList());
		dto.setPseudo(jeu.getPseudo());
		dto.setRecompense(jeu.getCarteRecompense().stream().map(c -> carteMapper.toDTO(c)).toList());
		return dto;
	}
	
	private List<Carte> CarteListToCore(List<CarteDTO> cartes){
		return cartes.stream().map(carte_dto -> carteMapper.toCore(carte_dto)).toList();
	}
	
}
