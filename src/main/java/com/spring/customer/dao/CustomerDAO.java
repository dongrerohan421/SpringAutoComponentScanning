package com.spring.customer.dao;

import org.springframework.stereotype.Component;

@Component // to indicate this is class is an auto scan component
public class CustomerDAO {

	@Override
	public String toString() {
		return " Hello, This is CustomerDAO";
	}

}
