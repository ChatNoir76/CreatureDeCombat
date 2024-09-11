package fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.engine;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.AbstractRuleEngine;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.RuleService;
import jakarta.annotation.PostConstruct;

public class PiocherRuleEngine extends AbstractRuleEngine {

	@Autowired 
	RuleService ruleService;
	
	@PostConstruct
	public void initialization() {
		this.addRule(ruleService.piocher());
	}
	
}
