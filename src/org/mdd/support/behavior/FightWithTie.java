package org.mdd.support.behavior;

import org.mdd.core.Capable;
import org.mdd.core.FightBehavior;
import org.mdd.core.Stick;

public class FightWithTie implements FightBehavior{
	
	private Stick stick;
	private Capable capable;
	
	public FightWithTie(){}
	
	
	public FightWithTie(Stick stick,Capable capable){
		this.stick = stick;
		this.capable = capable;
	}

	@Override
	public String fight() {
		return "ÓÃ  "+stick.getStickName()+" ÕÐÊ½Îª£º " +capable.capable();
	}


}
