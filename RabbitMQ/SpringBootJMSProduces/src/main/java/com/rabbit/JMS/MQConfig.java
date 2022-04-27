package com.rabbit.JMS;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.ConnectionFactory;

import ch.qos.logback.classic.pattern.MessageConverter;

@Configuration
public class MQConfig {
	
	public static final String QUEUE="message_queue";
	public static final String EXCHANGE="message_exchange";
	public static final String ROTUING_KEY="message_routingKey";
	
	
	@Bean
	public Queue queue()
	{
		return new Queue(QUEUE);
	}
	
	
	@Bean
	public TopicExchange exchange()
	{
		
		return new TopicExchange(EXCHANGE);
	}
	
	
	@Bean
	public Binding binding(Queue queue , TopicExchange exchange)
	{
		return BindingBuilder
				.bind(queue)
				.to(exchange)
				.with("message_routingKey");
			
	}
	
	@Bean
	public Jackson2JsonMessageConverter messageConverter()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	public AmqpTemplate template(ConnectionFactory connectionFactory)
	{
		RabbitTemplate template = new RabbitTemplate(connectionFactory);
	}

}
