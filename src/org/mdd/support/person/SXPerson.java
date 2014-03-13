package org.mdd.support.person;

import org.mdd.core.Capable;
import org.mdd.core.FightBehavior;
import org.mdd.core.Person;
import org.mdd.core.Stick;
import org.mdd.support.behavior.FightWithWood;

public class SXPerson implements Person{

	
	@Override
	public String name() {
		return "shan'xi person ";
	}

	
	@Override
	public FightBehavior setFight(Stick stick ,Capable capable) {
		return new FightWithWood(stick,capable);
	}
}
