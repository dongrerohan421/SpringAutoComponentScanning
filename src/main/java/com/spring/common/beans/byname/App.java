package com.spring.common.beans.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("/byName/spring-conf.xml");

			// Getting instance
			Orange orange = (Orange) context.getBean("orange");
			orange.printName();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
