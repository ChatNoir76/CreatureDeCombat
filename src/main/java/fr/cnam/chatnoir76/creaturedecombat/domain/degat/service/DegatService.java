package fr.cnam.chatnoir76.creaturedecombat.domain.degat.service;

import java.util.List;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;

public interface DegatService {

	public DegatDTO getById(String id);
	
	public DegatDTO getByAttaque(AttaqueDTO attaque);
	
	public List<DegatDTO> getAll();
	
}
