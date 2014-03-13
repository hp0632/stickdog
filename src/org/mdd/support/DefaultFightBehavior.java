package org.mdd.support;

import org.mdd.core.Capable;
import org.mdd.core.FightBehavior;
import org.mdd.core.Stick;

public class DefaultFightBehavior implements FightBehavior{
	
	private Stick stick;
	private Capable capable;
	
	
	public DefaultFightBehavior(){}
	
	public DefaultFightBehavior(Stick stick,Capable capable){
		this.stick = stick;
		this.capable = capable;
	}
	
	@Override
	public String fight() {
		String stickname = stick.getStickName() == null ? "����":stick.getStickName();
		String capableName = capable.capable() == null ? "���� " :capable.capable();
		return "��  "+stickname+" ��ʽΪ�� " +capableName+" ��";
	}

}
