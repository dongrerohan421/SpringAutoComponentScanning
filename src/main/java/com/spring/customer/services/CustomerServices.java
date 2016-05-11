package com.spring.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.customer.dao.CustomerDAO;

@Component
public class CustomerServices {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerServices [customerDAO =" + customerDAO + "]";
	}

}
