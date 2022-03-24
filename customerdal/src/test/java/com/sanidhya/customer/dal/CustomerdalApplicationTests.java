package com.sanidhya.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanidhya.customer.dal.entities.Customer;
import com.sanidhya.customer.dal.repos.CustomerRepository;


@SpringBootTest
class CustomerdalApplicationTests {
	@Autowired
	private CustomerRepository repo;

	@Test
	void testCreateStudent() {
		Customer customer=new Customer();
		customer.setName("Sanidhya");
		customer.setEmail("sandy@gmail.com");
		repo.save(customer);
	}
	@Test
	void testFindStudentById() {
		Customer customer=repo.findById(1l).get();
		System.out.println(customer);
		
	}
	
	@Test
	void testUpdateCustomer() {
		Customer customer=repo.findById(1l).get();
		customer.setEmail("san@gmail.com");
		repo.save(customer);
	}

}
