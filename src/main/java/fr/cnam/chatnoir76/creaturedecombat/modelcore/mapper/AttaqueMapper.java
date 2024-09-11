package fr.cnam.chatnoir76.creaturedecombat.modelcore.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTOFull;
import fr.cnam.chatnoir76.creaturedecombat.domain.enumeration.dto.CategorieDTO;
import fr.cnam.chatnoir76.creaturedecombat.model.Attaque;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.factory.CoreModelFactory;

@Service
public class AttaqueMapper {
	
	@Autowired
	DegatMapper degatMapper;
	
	@Autowired
	EnumerationMapper enumMapper;

	public Attaque toCore(AttaqueDTOFull dto) {
		if(dto == null) return null;
		Attaque attaque = CoreModelFactory.eINSTANCE.createAttaque(dto);
		attaque.setDegatAttaque(degatMapper.toCore(dto.getDegatDTO()));
		return attaque;
	}
	
	public AttaqueDTOFull toDTO(Attaque attaque) {
		if(attaque == null) return null;
		CategorieDTO categorieDTO = enumMapper.toDTO(attaque.getCategorie());
		
		AttaqueDTO dto = new AttaqueDTO();
		dto.setCategorie(categorieDTO.getNom());
		dto.setCategorieId(categorieDTO.getId());
		dto.setDegat(degatMapper.toDTO(attaque.getDegatAttaque()));
		dto.setDescription(attaque.getDescription());
		dto.setEnergiePrimaire(attaque.getBesoinEnergieCategorie());
		dto.setEnergieSecondaire(attaque.getBesoinEnergieAutre());
		dto.setId(String.valueOf(attaque.getId()));
		dto.setNom(attaque.getNom());
		
		AttaqueDTOFull full = new AttaqueDTOFull(dto);
		full.setDegatDTO(degatMapper.toDTO(attaque.getDegatAttaque()));
		
		return full;
	}
	
}
