package com.springngtasks.tasks.controller;

import com.springngtasks.tasks.domain.Task;
import com.springngtasks.tasks.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping(value = {"", "/"})
	public Iterable<Task> list() {
		return this.taskService.list();
	}
	
	
	
}