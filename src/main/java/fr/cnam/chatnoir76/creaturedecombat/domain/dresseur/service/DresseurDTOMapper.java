package fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.dto.CarteDresseurDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.dresseur.entity.DresseurEntity;

@Mapper
public interface DresseurDTOMapper {

	DresseurDTOMapper INSTANCE = Mappers.getMapper(DresseurDTOMapper.class);
	
	@Mapping(target = "visible", ignore = true)
	public CarteDresseurDTO fromEntityToDTO(DresseurEntity entity);
	
	@InheritInverseConfiguration
	public DresseurEntity fromDTOToEntity(CarteDresseurDTO dto);
	
}
