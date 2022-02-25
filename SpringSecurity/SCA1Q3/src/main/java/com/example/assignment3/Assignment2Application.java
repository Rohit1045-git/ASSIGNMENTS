package com.example.assignment3;

import com.example.assignment3.model.User;
import com.example.assignment3.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setEmail("rohit@gmail.com");
		user1.setUsername("Rohit");
		user1.setPassword(bCryptPasswordEncoder.encode("123"));
		user1.setRole("ADMIN");

		userRepo.save(user1);

		User user2 = new User();
		user2.setEmail("kalyanit@gmail.com");
		user2.setUsername("Kalyani");
		user2.setPassword(bCryptPasswordEncoder.encode("xyz"));
		user2.setRole("NORMAL");

		userRepo.save(user2);
	}

}
