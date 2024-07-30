package fr.cnam.chatnoir76.creaturedecombat.domain.carte.service;

import fr.cnam.chatnoir76.creaturedecombat.domain.carte.dto.CarteDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.carte.entity.CarteEntity;

public interface CarteDTOMapper {
	
	public CarteDTO fromEntityToDTO(CarteEntity entity);
	
}
