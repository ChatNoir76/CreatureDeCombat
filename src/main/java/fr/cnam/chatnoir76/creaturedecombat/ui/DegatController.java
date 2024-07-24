package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.degat.dto.DegatDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.degat.service.DegatService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/degats")
public class DegatController {

	@Autowired
	DegatService degatService;
	
	@Autowired
	HateoasService hateoas;
	
	@GetMapping(value = "")
	public List<DegatDTO> getAllDegat() {
		List<DegatDTO> degats = degatService.getAll();
		degats.forEach(degat -> {
			degat.add(hateoas.getSelfLink(
					DegatController.class, 
					"getDegatById",  
					degat.getId()));});
		return degats;
	}
	
	@GetMapping(value = "/{degatId}")
	public DegatDTO getDegatById(@PathVariable("degatId") String degatId) {
		DegatDTO degat = degatService.getById(degatId);
		degat.add(hateoas.getSelfLink(
				DegatController.class, 
				"getDegatById",  
				degat.getId()));
		return degat;
	}
	
}
