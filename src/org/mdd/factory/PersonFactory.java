package org.mdd.factory;

import org.mdd.core.Person;

public class PersonFactory implements AbstractPersonFactory{

	Person p;
	
	public PersonFactory(){}
	
	public PersonFactory(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		this.p  = (Person) Class.forName(className).newInstance();
	}
	
	@Override
	public Person createPerson() {
		return p;
	}
	
	
	public static Person getInstance(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if(className == null){
			return new PersonFactory().createPerson();
		}else{
			return new PersonFactory(className).createPerson();
		}
	}


}
