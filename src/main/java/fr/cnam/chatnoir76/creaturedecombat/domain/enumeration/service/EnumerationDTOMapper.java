package fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.EnumerationDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.entity.EnumerationEntity;

@Mapper(componentModel = "spring")
public interface EnumerationDTOMapper {

	EnumerationDTOMapper INSTANCE = Mappers.getMapper(EnumerationDTOMapper.class);
	
	@Mapping(source = "id", target = "id")
	public EnumerationDTO fromEntityToDTO(EnumerationEntity entity);
	
	@Mapping(source = "id", target = "id")
	public EnumerationEntity fromDTOToEntity(EnumerationDTO dto);
	
	
}
