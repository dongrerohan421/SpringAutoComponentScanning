package com.spring.common.beans.byautodetect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("/byAutoDetect/spring-conf.xml");

			// Getting instance
			Panda panda = (Panda) context.getBean("panda");
			System.out.println(panda);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
