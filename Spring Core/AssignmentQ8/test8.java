package org.example.AssignmentQ8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test8 {
 public static void main(String[] args) {
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
	 context.registerShutdownHook();
	 
	 Dog dog = (Dog)context.getBean("dog");
	 dog.eat();
	 
	 Dog dog1 = (Dog)context.getBean("dog1");
	 dog.eat();
	 
	 Dog dog2 = (Dog)context.getBean("dog2");
	 dog.eat();
 }
}
