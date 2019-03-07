package com.jwt.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@Entity
public class Task {
	@Id
	@GeneratedValue
	private Long id;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String taskName;

	public Task(Long id, String taskName) {
		super();
		this.id = id;
		this.taskName = taskName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
