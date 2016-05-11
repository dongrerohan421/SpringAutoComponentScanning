package com.spring.common.beans.byname;

public class Orange {

	Apple apple;

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public void printName() {
		apple.printName();
	}
}
