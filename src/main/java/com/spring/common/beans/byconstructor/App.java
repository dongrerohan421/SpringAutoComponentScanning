package com.spring.common.beans.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("/byConstructor/spring-conf.xml");

			// Getting instance
			Orange orange = (Orange) context.getBean("orange");
			orange.printName();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
