package com.jwt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entites.Task;
import com.jwt.services.TaskRepo;

@RestController
public class TaskController {
	@Autowired
	private TaskRepo taskRepository;

	@GetMapping("/tasks")
	public List<Task> listTasks() {
		return taskRepository.findAll();
	}

	@PostMapping("/tasks")
	public Task save(@RequestBody Task task) {
		return taskRepository.save(task);
	}
}
