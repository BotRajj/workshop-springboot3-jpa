package com.springjpaeducandoweb.springjpacourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springjpaeducandoweb.springjpacourse.entities.User;
import com.springjpaeducandoweb.springjpacourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "UserTest1", "Test@test1.com", "11111", "1234");
		User u2 = new User(null, "UserTest2", "Test@test2.com", "22222", "1234");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
