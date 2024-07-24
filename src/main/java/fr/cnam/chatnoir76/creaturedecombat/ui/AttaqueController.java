package fr.cnam.chatnoir76.creaturedecombat.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.dto.AttaqueDTO;
import fr.cnam.chatnoir76.creaturedecombat.domain.attaque.service.AttaqueService;
import fr.cnam.chatnoir76.creaturedecombat.ui.service.HateoasService;

@RestController
@RequestMapping(value = "/attaques")
public class AttaqueController {

	@Autowired
	AttaqueService attaqueService;
	
	@Autowired
	HateoasService hateoas;
	
	@Autowired
	EntityLinks link;
	
	@GetMapping(value = "")
	public List<AttaqueDTO> getAllAttaque() {
		List<AttaqueDTO> attaques = attaqueService.getAll();
		attaques.forEach(attaque -> {
			attaque.add(hateoas.getSelfLink(
					AttaqueController.class, 
					"getAttaqueById",  
					attaque.getId()));
		});
		return attaques;
	}
	
	@GetMapping(value = "/{attaqueId}")
	public AttaqueDTO getAttaqueById(@PathVariable("attaqueId") String attaqueId) {
		AttaqueDTO attaque = attaqueService.getById(attaqueId);
		attaque.add(hateoas.getSelfLink(
				AttaqueController.class, 
				"getAttaqueById",  
				attaque.getId()));
		return attaque;
	}
	
}
