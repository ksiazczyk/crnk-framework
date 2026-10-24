// ---docerion
// type: test
// title: ProjectRepository
// summary: An in-memory JSON:API resource repository for project entities backed by CDI.
// ---

package io.crnk.internal.boot.cdi.model;

import io.crnk.core.repository.InMemoryResourceRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProjectRepository extends InMemoryResourceRepository<Project, Long> {
    public ProjectRepository() {
        super(Project.class);
    }
}
