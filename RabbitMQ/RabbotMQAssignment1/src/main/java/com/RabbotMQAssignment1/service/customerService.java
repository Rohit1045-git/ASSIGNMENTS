package com.RabbotMQAssignment1.service;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RabbotMQAssignment1.config.RabbitMqConfig;
import com.RabbotMQAssignment1.model.Customer;
import com.RabbotMQAssignment1.repository.CustRepo;

@RestController
@RequestMapping("/customerService")
public class customerService {
	
	@Autowired
	AmqpTemplate template;
	
	@Autowired
	CustRepo custRepo;
	
	@PostMapping
	public String addCustomer(@RequestBody Customer customer) {
		template.convertAndSend(RabbitMqConfig.EXCHANGE,RabbitMqConfig.ROUTING_KEY, customer);
        return "New Customer Added to the Queue";
	}
	
	@GetMapping("/showCustomer")
	public List<Customer> getAllCustomer(){
		return custRepo.findAll();
	}

}
