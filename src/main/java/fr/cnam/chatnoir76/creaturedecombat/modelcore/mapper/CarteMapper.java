package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.dto.CarteCreatureDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Carte;
import fr.cnam.chatnoir76.creaturedecombat.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.model.Dresseur;
import fr.cnam.chatnoir76.creaturedecombat.model.Energie;

@Service
public class CarteMapper {

	@Autowired
	CreatureMapper creatureMapper;
	
	@Autowired
	EnergieMapper energieMapper;
	
	@Autowired
	DresseurMapper dresseurMapper;
	
	public Carte toCore(CarteDTO dto) {
		if(dto == null) return null;
		if(dto instanceof CarteCreatureDTOFull) {
			return creatureMapper.toCore((CarteCreatureDTOFull) dto);
		} else if(dto instanceof CarteEnergieDTO) {
			return energieMapper.toCore((CarteEnergieDTO) dto);
		} else if(dto instanceof CarteDresseurDTO) {
			return dresseurMapper.toCore((CarteDresseurDTO) dto);
		} else {
			return null;
		}
	}
	
	public CarteDTO toDTO(Carte carte) {
		if(carte instanceof Creature) {
			return creatureMapper.toDTO((Creature) carte);
		} else if(carte instanceof Energie) {
			return energieMapper.toDTO((Energie) carte);
		} else if(carte instanceof Dresseur) {
			return dresseurMapper.toDTO((Dresseur) carte);
		}
		return null;
	}
	
}
