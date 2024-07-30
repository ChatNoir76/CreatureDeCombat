package fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.dto.DeckCarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.deckcarte.entity.DeckCarteEntity;

@Mapper
public interface DeckCarteDTOMapper {

	DeckCarteDTOMapper INSTANCE = Mappers.getMapper(DeckCarteDTOMapper.class);
	
	@Mapping(source = "deck.id", target = "id_deck")
	@Mapping(source = "deck.nom", target = "nom_deck")
	@Mapping(source = "carte.id", target = "id_carte")
	@Mapping(source = "carte.nom", target = "nom_carte")
	public DeckCarteDTO fromEntityToDTO(DeckCarteEntity entity);
	
	@Mapping(target = "id", ignore = true)
	public DeckCarteEntity fromDTOToEntity(DeckCarteDTO dto);
	
}
