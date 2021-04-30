package com.shiwang.spring.service;

import java.util.List;

import com.shiwang.spring.entity.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void addCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
