package org.mdd.factory;

import org.mdd.core.Dog;

public class DogFactory implements AbstractDogFactory{
	
	Dog d;

	public DogFactory(){}
	
	public DogFactory(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Dog d = (Dog) Class.forName(className).newInstance();
		this.d = d;
	}

	@Override
	public Dog createDog() {
		return d;
	}
	
	
	public static Dog getInstance(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if(className == null){
			return new DogFactory().createDog();
		}else{
			return new DogFactory(className).createDog();
		}
	}

}
