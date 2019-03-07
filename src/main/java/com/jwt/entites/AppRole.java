package com.jwt.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@Entity
public class AppRole {
	public AppRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppRole(Long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Id
	@GeneratedValue
	private Long id;
	private String role;
}
