package com.shiwang.spring.entity;

import java.util.List;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public void addCustomer(Customer cust);
	
	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
