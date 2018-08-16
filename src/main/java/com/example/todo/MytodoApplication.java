package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.todo.persistence.Task;
import com.example.todo.repository.TaskRepository;

@SpringBootApplication
public class MytodoApplication implements CommandLineRunner{

	@Autowired
	private TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(MytodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Task task=new Task();
		task.setTaskId(1);
		task.setTaskName("Kill the laziness");
		taskRepository.save(task);
		
		System.out.println(">>data from db "+taskRepository.findById(1));
		
	}
	
	
}
