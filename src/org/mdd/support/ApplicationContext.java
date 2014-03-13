package org.mdd.support;


import org.mdd.core.Context;
import org.mdd.handler.AbstractDefaultFightHandler;

public class ApplicationContext extends AbstractDefaultFightHandler implements Context{
	
	private AbstractDefaultFightHandler fightHandler;
	
	public ApplicationContext(){
		this.fightHandler = new AbstractDefaultFightHandler();
	}
	
	public ApplicationContext(AbstractDefaultFightHandler fightHandler){
		this.fightHandler = fightHandler;
	}
	
	public void operate(){
		fightHandler.startFight();
	}
	
}
