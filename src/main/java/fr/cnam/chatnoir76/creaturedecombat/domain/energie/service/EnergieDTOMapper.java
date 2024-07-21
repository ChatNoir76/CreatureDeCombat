package fr.cnam.chatnoir76.creaturedecombat.domain.energie.service;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.cnam.chatnoir76.creaturedecombat.domain.energie.dto.CarteEnergieDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.energie.entity.EnergieEntity;

@Mapper
public interface EnergieDTOMapper {

	EnergieDTOMapper INSTANCE = Mappers.getMapper(EnergieDTOMapper.class);
	
	@Mapping(source = "categorie.nom", target = "categorie")
	@Mapping(target = "visible", ignore = true)
	public CarteEnergieDTO fromEntityToDTO(EnergieEntity entity);
	
	@InheritInverseConfiguration
	public EnergieEntity fromDTOToEntity(CarteEnergieDTO dto);
	
}
