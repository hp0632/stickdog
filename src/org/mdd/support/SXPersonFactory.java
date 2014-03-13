package org.mdd.support;

import org.mdd.core.Person;
import org.mdd.factory.AbstractPersonFactory;
import org.mdd.support.person.SXPerson;

public class SXPersonFactory implements AbstractPersonFactory{

	@Override
	public Person createPerson() {
		return new SXPerson();
	}

}
