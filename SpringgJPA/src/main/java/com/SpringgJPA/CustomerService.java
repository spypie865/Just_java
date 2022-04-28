package com.SpringgJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("c")
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	public void test() {
		//save a new Customer
		Customer newCustomer = new Customer();
		newCustomer.setFirstName("Shreenika");
		newCustomer.setLastName("Ganesh");
		System.out.println("inserted");
		repo.save(newCustomer);
		
		// find customer by last name
		List<Customer> customers = repo.findByLastName("Gupta");
		customers.forEach(customer -> System.out.println(customer));
		
		// find all customer
				Iterable<Customer> iterator = repo.findAll();
				iterator.forEach(customer -> System.out.println(customer));
	}

}
