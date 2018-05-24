package com.springngtasks.tasks.repository;

import com.springngtasks.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
