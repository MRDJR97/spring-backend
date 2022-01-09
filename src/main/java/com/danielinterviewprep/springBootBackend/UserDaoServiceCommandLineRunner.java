package com.danielinterviewprep.springBootBackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.danielinterviewprep.springBootBackend.entity.User;
import com.danielinterviewprep.springBootBackend.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User u = new User("Jack", "Admin");
		long insert = userDaoService.insert(u);
		log.info ("SUCCESS!!!!");
	}

	

}
