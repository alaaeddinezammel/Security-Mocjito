package com.jwt.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.jwt.dao.AppRoleRepo;
import com.jwt.dao.AppUserRepo;
import com.jwt.entites.AppUser;
import com.jwt.services.AccountServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class JwtSpringApplicationTests {

	@Mock
	private AppUserRepo userRepository;
	@Mock
	private AppRoleRepo roleRepository;

	@InjectMocks
	AccountServiceImpl acc;

	// Doc tests
	// https://howtodoinjava.com/spring-boot2/spring-boot-mockito-junit-example/

	@Test
	public void getUserByIdTest() {
		when(userRepository.findByUsername("admin")).thenReturn(
				new AppUser(600851475143L, "admin", "$2a$10$EFrm0HDrtb/LnHmxjL9D.ORMVs7t5exHcPcjxjuotJ6kB6wHL5xyi"));

		AppUser emp = acc.findUserByUsername("admin");

		assertEquals("admin", emp.getUsername());

		System.out.println("test finished:" + emp.getUsername());

	}

	@Test
	public void getUserByIdTest2() {
		when(userRepository.findByUsername("alaa")).thenReturn(new AppUser(600851475143L, "alaa", "aa"));

		AppUser emp = acc.findUserByUsername("alaa");

		assertEquals("alaa", emp.getUsername());

		System.out.println("test finished:" + emp.getUsername());

	}

}
