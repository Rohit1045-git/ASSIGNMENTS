package com.RabbotMQAssignment1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RabbotMQAssignment1.model.Customer;

@Repository
public interface CustRepo extends MongoRepository<Customer,String> {
	
}