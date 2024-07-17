package fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service;

import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.mapper.Mapper;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;

@Service
public class AttaqueDTOMapper {

	public final static AttaqueDTO toDTO(Attaque attaque) {
		AttaqueDTO att = new AttaqueDTO();
		att.setNom(attaque.getNom());
		att.setDescription(attaque.getDescription());
		att.setEnergiePrimaire(attaque.getBesoinEnergieCategorie());
		att.setEnergieSecondaire(attaque.getBesoinEnergieAutre());
		att.setDegatDto(Mapper.toDTO(attaque.getDegatAttaque()));
		return att;
	}
	
}
