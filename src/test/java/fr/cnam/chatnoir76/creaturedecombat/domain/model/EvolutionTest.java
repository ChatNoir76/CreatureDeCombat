package fr.cnam.chatnoir76.creaturedecombat.domain.model;

import static org.junit.Assert.assertFalse;
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
	
	private Creature cBase;
	private Creature cEvolution;
	private Creature cMaitre;
	private Creature cNonCompatible;
	
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
		Base base = ModelFactory.eINSTANCE.createBase();
		base.setNom(BASE_NOM);
		base.setDescription(BASE_DESCRIPTION);
		base.setPvInit(BASE_PV_INIT);
		base.setCategorie(Categorie.ADORABLE);
		
		Evolution evolution = ModelFactory.eINSTANCE.createEvolution();
		evolution.setNom(EVOLUTION_NOM);
		evolution.setDescription(EVOLUTION_DESCRIPTION);
		evolution.setPvInit(EVOLUTION_PV_INIT);
		evolution.setCategorie(Categorie.ADORABLE);
		evolution.setBase(base);
		
		Maitre maitre = ModelFactory.eINSTANCE.createMaitre();
		maitre.setNom(MAITRE_NOM);
		maitre.setDescription(MAITRE_DESCRIPTION);
		maitre.setPvInit(MAITRE_PV_INIT);
		maitre.setCategorie(Categorie.ADORABLE);
		maitre.setEvolution(evolution);
		
		Evolution evolutionnc = ModelFactory.eINSTANCE.createEvolution();
		evolutionnc.setNom(EVOLUTION_NOM);
		evolutionnc.setDescription(EVOLUTION_DESCRIPTION);
		evolutionnc.setPvInit(EVOLUTION_PV_INIT);
		evolutionnc.setCategorie(Categorie.ADORABLE);
		evolutionnc.setBase(ModelFactory.eINSTANCE.createBase());
		
		cBase = ModelFactory.eINSTANCE.createCreature(base.getActiveCreatureComponent());
		cEvolution = ModelFactory.eINSTANCE.createCreature(evolution.getActiveCreatureComponent());
		cMaitre = ModelFactory.eINSTANCE.createCreature(maitre.getActiveCreatureComponent());
		cNonCompatible = ModelFactory.eINSTANCE.createCreature(evolutionnc.getActiveCreatureComponent());
	}
	
	private void verificationAttributs(Creature creature, Creature cc) {
		assertTrue(creature.getNiveau().equals(cc.getNiveau()), "Le niveau est %s au lieu de %s".formatted(creature.getNiveau(), cc.getNiveau()));
		assertTrue(creature.getNom().equals(cc.getNom()), "Le nom est %s au lieu de %s".formatted(creature.getNom(), cc.getNom()));
		assertTrue(creature.getDescription().equals(cc.getDescription()), "La description est %s au lieu de %s".formatted(creature.getDescription(), cc.getDescription()));		
		assertTrue(creature.getPvInit() == cc.getPvInit(), "Les PVinit sont de %d au lieu de %d".formatted(creature.getPv(), cc.getPvInit()));
		assertTrue(creature.getCategorie().equals(cc.getCategorie()), "La catégorie est %s au lieu de %s".formatted(creature.getCategorie(), cc.getCategorie()));
		creature.getAttaques().forEach(a -> {
			assertTrue(cc.getAttaques().contains(a), "L'attaque est manquante : %s".formatted(a.getNom()));
		});
	}
	
	@Test
	public void comportementInitialTest() {
		Creature creature = cBase;
		
		assertFalse(creature.faireEvoluer(cNonCompatible));
		assertFalse(creature.faireEvoluer(cMaitre));
		verificationAttributs(creature, cBase);
		
		assertTrue(creature.faireEvoluer(cEvolution));
		assertFalse(creature.faireEvoluer(cBase));
		assertFalse(creature.faireEvoluer(cNonCompatible));
		verificationAttributs(creature, cEvolution);
		
		assertTrue(creature.faireEvoluer(cMaitre));
		assertFalse(creature.faireEvoluer(cBase));
		assertFalse(creature.faireEvoluer(cEvolution));
		assertFalse(creature.faireEvoluer(cNonCompatible));
		verificationAttributs(creature, cMaitre);
	}
	
}
