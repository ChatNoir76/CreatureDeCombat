package fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.engine;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.AbstractRuleEngine;
import fr.cnam.chatnoir76.creaturedecombat.modelcore.rule.RuleService;

public class PiocherRuleEngine extends AbstractRuleEngine {

	@Autowired 
	RuleService ruleService;
	
	public PiocherRuleEngine() {
		this.addRule(ruleService.piocher());
	}
	
}
