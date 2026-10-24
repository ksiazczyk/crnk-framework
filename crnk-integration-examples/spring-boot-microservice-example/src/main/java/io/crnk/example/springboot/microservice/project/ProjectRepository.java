// ---docerion
// type: source
// title: Project in-memory repository
// summary: An in-memory JSON:API repository that stores and manages Project resources.
// ---

package io.crnk.example.springboot.microservice.project;

import io.crnk.core.repository.InMemoryResourceRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepository extends InMemoryResourceRepository<Project, Long> {

	public ProjectRepository() {
		super(Project.class);
	}
}
