package com.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.customer.services.CustomerServices;

public class App {

	public static void main(String[] args) {

		try {

			ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "SpringAutoScan.xml" });

			// By default, Spring will lower case the first character of the
			// component – from 'CustomerService' to 'customerService'.
			CustomerServices cust = (CustomerServices) context.getBean("customerServices");
			System.out.println(cust);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
