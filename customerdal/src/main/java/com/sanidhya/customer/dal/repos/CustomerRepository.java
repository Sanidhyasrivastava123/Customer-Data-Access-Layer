package com.sanidhya.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.sanidhya.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
