package com.springngtasks.tasks.service;

import com.springngtasks.tasks.domain.Task;
import com.springngtasks.tasks.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	@Override
	public Iterable<Task> list() {
		return this.taskRepository.findAll();
	}
}
