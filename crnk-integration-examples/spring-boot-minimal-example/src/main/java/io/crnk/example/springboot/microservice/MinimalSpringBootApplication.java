// ---docerion
// type: source
// title: Minimal Spring Boot application entry point
// summary: Main entry point that starts the Spring Boot microservice and prints the local URL to visit in a browser.
// ---

package io.crnk.example.springboot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@SpringBootApplication
@Import({TestDataLoader.class})
public class MinimalSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimalSpringBootApplication.class, args);
		System.out.println("visit http://127.0.0.1:8080/ in your browser");
	}
}
