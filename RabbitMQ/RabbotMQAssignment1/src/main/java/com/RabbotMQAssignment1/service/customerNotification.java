package com.RabbotMQAssignment1.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.RabbotMQAssignment1.config.RabbitMqConfig;
import com.RabbotMQAssignment1.model.Customer;
import com.RabbotMQAssignment1.repository.CustRepo;

@Component
public class customerNotification {
	
	@Autowired
	CustRepo custRepo;
	
	@RabbitListener(queues = RabbitMqConfig.QUEUE)
	public void consumeMessage(Customer customer) {
		custRepo.save(customer);
		System.out.println("Data added to the database Successfully");
	}
}
