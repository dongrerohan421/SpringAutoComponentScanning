package com.spring.common.beans.byconstructor;

public class Orange {

	Apple apple;

	public Orange(Apple apple) {
		super();
		this.apple = apple;
	}

	public Apple getApple() {
		return apple;
	}

	// constructor with argument
	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public void printName() {
		apple.printName();
	}
}
