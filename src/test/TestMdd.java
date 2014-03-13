package test;

import org.mdd.core.Capable;
import org.mdd.core.Dog;
import org.mdd.core.FightBehavior;
import org.mdd.core.Person;
import org.mdd.core.Stick;
import org.mdd.factory.PersonFactory;
import org.mdd.handler.AbstractDefaultFightHandler;
import org.mdd.support.ApplicationContext;
import org.mdd.support.capable.DefaultCapable;
import org.mdd.support.dog.BlackDog;
import org.mdd.support.stick.DefaultStick;

public class TestMdd {

	/**
	 * 
	 * @param args
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * 
	 * Person p = new SXPersonFactory().createPerson();
	 * Stick s = new WoodStick();
	 * Capable c= new DGCapable();
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Person p = PersonFactory.getInstance("org.mdd.support.person.SXPerson");
		Stick s = new DefaultStick();
		Capable c= new DefaultCapable();
		FightBehavior f = p.setFight(s, c);
		Dog d = new BlackDog();
		ApplicationContext applicationContext = new ApplicationContext(
				new AbstractDefaultFightHandler(p,f,d));
		applicationContext.operate();
	}
}
