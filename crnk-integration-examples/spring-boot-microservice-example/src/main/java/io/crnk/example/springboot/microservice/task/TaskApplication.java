// ---docerion
// type: source
// title: Spring Boot task service entry point
// summary: Spring Boot application entry point that starts the task microservice and prints its local URL.
// ---

package io.crnk.example.springboot.microservice.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
		System.out.println("visit http://127.0.0.1:8080/ in your browser");
	}
}
