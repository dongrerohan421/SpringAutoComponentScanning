package com.spring.customer.filter.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.customer.filter.dao.CustomerDAO;

public class CustomerServices {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerServices [customerDAO =" + customerDAO + "]";
	}

}
