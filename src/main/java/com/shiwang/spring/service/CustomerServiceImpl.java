package com.shiwang.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiwang.spring.entity.Customer;
import com.shiwang.spring.entity.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerdao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.getCustomers();
		}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerdao.addCustomer(customer);
	}

	@Override
    @Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer=customerdao.getCustomer(id);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerdao.deleteCustomer(id);
	}

	

}
