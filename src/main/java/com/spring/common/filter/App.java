package com.spring.common.filter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.customer.filter.services.CustomerServices;

public class App {

	public static void main(String[] args) {

		try {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "SpringAutoScanFilter.xml" });

			CustomerServices cust = (CustomerServices) context.getBean("customerServices");
			System.out.println(cust);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
