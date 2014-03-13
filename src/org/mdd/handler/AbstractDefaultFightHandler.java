package org.mdd.handler;

import org.mdd.core.Dog;
import org.mdd.core.FightBehavior;
import org.mdd.core.Person;


public class AbstractDefaultFightHandler implements FightHandler{
	
	private FightBehavior fightBehavior;
	private Person person;
	private Dog dog;
	
	public AbstractDefaultFightHandler(){}
	
	public AbstractDefaultFightHandler(Person person,FightBehavior fightBehavior,Dog dog){
		this.person = person;
		this.fightBehavior = fightBehavior;
		this.dog = dog;
	}

	@Override
	public void startFight() {
		System.out.println(format(person, fightBehavior, dog));
	}
	
	
	public String format(Person person,FightBehavior fightBehavior,Dog dog){
		return person.name() +fightBehavior.fight()+ dog.getDogName()+dog.getDogType();
	}
	

}
