package org.mdd.support.dog;

import org.mdd.core.Dog;

public class BlackDog implements Dog{

	@Override
	public String getDogName() {
		return " 名字叫：小白 ";
	}

	@Override
	public String getDogType() {
		return " 品种为：牧羊犬";
	}

}
