package com.apprentices.KeepMeAlive;

import com.apprentices.KeepMeAlive.Entity.Plant;
import com.apprentices.KeepMeAlive.Entity.User;
import com.apprentices.KeepMeAlive.Repository.PlantRepository;
import com.apprentices.KeepMeAlive.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeepMeAliveApplication implements ApplicationRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PlantRepository plantRepository;

	public static void main(String[] args) {
		SpringApplication.run(KeepMeAliveApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		userRepository.save(new User());
		plantRepository.save(new Plant());
	}
}
