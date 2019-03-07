package com.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.jwt.entites.AppRole;
import com.jwt.entites.AppUser;
import com.jwt.entites.Task;
import com.jwt.services.AccountService;
import com.jwt.services.TaskRepo;

@SpringBootApplication
@ComponentScan
public class JwtSpringApplication implements CommandLineRunner {

	@Autowired
	private TaskRepo taskRepository;
	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... arg0) throws Exception {

		taskRepository.save(new Task(null, "T1"));
		taskRepository.save(new Task(null, "T2"));
		taskRepository.save(new Task(null, "T3"));
		accountService.saveRole(new AppRole(null, "USER"));
		accountService.saveRole(new AppRole(null, "ADMIN"));
		accountService.saveUser(new AppUser(null, "user", "1234", null));
		accountService.saveUser(new AppUser(null, "admin", "1234", null));
		accountService.addRoleToUser("user", "USER");
		accountService.addRoleToUser("admin", "USER");
		accountService.addRoleToUser("admin", "ADMIN");

	}
}