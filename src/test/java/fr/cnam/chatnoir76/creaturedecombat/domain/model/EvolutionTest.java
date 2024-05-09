package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Base;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Categorie;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Creature;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Evolution;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.Maitre;
import fr.cnam.chatnoir76.creaturedecombat.domain.creature.model.ModelFactory;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class EvolutionTest {
	
	private Base base;
	private Evolution evolution;
	private Maitre maitre;
	
	private final static String BASE_NOM = "Creature_Base_Nom";
	private final static String BASE_DESCRIPTION = "Creature_Base_Description";
	private final static int BASE_PV_INIT = 30;
	
	private final static String EVOLUTION_NOM = "Creature_Evolution_Nom";
	private final static String EVOLUTION_DESCRIPTION = "Creature_Evolution_Description";
	private final static int EVOLUTION_PV_INIT = 100;
	
	private final static String MAITRE_NOM = "Creature_Maitre_Nom";
	private final static String MAITRE_DESCRIPTION = "Creature_Maitre_Description";
	private final static int MAITRE_PV_INIT = 180;
	
	@BeforeEach
	public void beforeEach() {
		base = ModelFactory.eINSTANCE.createBase();
		base.setNom(BASE_NOM);
		base.setDescription(BASE_DESCRIPTION);
		base.setPvInit(BASE_PV_INIT);
		base.setCategorie(Categorie.ADORABLE);
		
		evolution = ModelFactory.eINSTANCE.createEvolution();
		evolution.setNom(EVOLUTION_NOM);
		evolution.setDescription(EVOLUTION_DESCRIPTION);
		evolution.setPvInit(EVOLUTION_PV_INIT);
		evolution.setCategorie(Categorie.ADORABLE);
		
		maitre = ModelFactory.eINSTANCE.createMaitre();
		maitre.setNom(MAITRE_NOM);
		maitre.setDescription(MAITRE_DESCRIPTION);
		maitre.setPvInit(MAITRE_PV_INIT);
		maitre.setCategorie(Categorie.ADORABLE);
		
	}
	
	private void verificationAttributs(Creature creature, Base base) {
		assertTrue(creature.getNom().equals(base.getNom()), "Le nom est %s au lieu de %s".formatted(creature.getNom(), base.getNom()));
		assertTrue(creature.getDescription().equals(base.getDescription()), "La description est %s au lieu de %s".formatted(creature.getDescription(), base.getDescription()));		
		assertTrue(creature.getPvInit() == base.getPvInit(), "Les PVinit sont de %d au lieu de %d".formatted(creature.getPv(), base.getPvInit()));
		assertTrue(creature.getCategorie().equals(base.getCategorie()), "La catégorie est %s au lieu de %s".formatted(creature.getCategorie(), base.getCategorie()));
		creature.getAttaques().forEach(a -> {
			assertTrue(base.getAttaques().contains(a), "L'attaque est manquante : %s".formatted(a.getNom()));
		});
	}
	
	@Test
	public void comportementInitialBaseTest() {
		Creature c_base = ModelFactory.eINSTANCE.createCreature();
		c_base.setBase(base);
		verificationAttributs(c_base, base);
	}
	
}
