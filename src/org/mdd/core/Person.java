package org.mdd.core;

public interface Person {
	
	String name();
	
	FightBehavior setFight(Stick stick,Capable capable);
}
