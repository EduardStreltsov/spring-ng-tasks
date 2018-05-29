package com.springngtasks.tasks.service;

import com.springngtasks.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
	
	Iterable<Task> list();
	
	Task save(Task task);
	
}
