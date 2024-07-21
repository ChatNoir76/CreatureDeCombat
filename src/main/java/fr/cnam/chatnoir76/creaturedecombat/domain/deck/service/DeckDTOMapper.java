package fr.cnam.chatnoir76.creaturedecombat.domain.deck.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.deck.dto.DeckDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deck.entity.DeckEntity;

@Mapper
public interface DeckDTOMapper {

	DeckDTOMapper INSTANCE = Mappers.getMapper(DeckDTOMapper.class);
	
	public DeckDTO fromEntityToDTO(DeckEntity entity);
	
	@InheritInverseConfiguration
	public DeckEntity fromDTOToEntity(DeckDTO dto);
	
}
