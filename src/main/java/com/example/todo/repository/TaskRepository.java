package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.persistence.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	

}
