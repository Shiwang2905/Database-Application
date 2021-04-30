package com.shiwang.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	private List<Customer> customerlist;
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session customersession= sessionfactory.openSession();
		customerlist= new ArrayList<>();
		customerlist=customersession.createQuery("from Customer", Customer.class).getResultList();
		return customerlist;
	}
	
	@Override
	public void addCustomer(Customer thecustomer) {
		Session customersession= sessionfactory.getCurrentSession();
		customersession.saveOrUpdate(thecustomer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session customersession= sessionfactory.getCurrentSession();
		Customer customer= customersession.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
		
		Session currentSession = sessionfactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();

	}

	
}
