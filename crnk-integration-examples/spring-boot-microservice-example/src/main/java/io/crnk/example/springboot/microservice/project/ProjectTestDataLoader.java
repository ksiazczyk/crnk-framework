// ---docerion
// type: source
// title: Project test data loader
// summary: A configuration class that seeds the repository with sample project data on startup.
// ---

package io.crnk.example.springboot.microservice.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ProjectTestDataLoader {

	@Autowired
	private ProjectRepository projectRepository;

	@PostConstruct
	public void setup() {
		projectRepository.save(new Project(121L, "Great Project"));
		projectRepository.save(new Project(122L, "Crnk Project"));
		projectRepository.save(new Project(123L, "Some Project"));
		projectRepository.save(new Project(124L, "JSON API Project"));
	}
}
