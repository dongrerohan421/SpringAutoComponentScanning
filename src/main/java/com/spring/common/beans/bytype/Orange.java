package com.spring.common.beans.bytype;

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
