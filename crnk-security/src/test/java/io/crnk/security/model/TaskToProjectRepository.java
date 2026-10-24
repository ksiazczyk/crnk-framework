// ---docerion
// type: test
// title: TaskToProjectRepository
// summary: CRNK relationship repository wiring the many-to-one relation between tasks and projects.
// ---

package io.crnk.security.model;

import io.crnk.core.repository.RelationshipRepositoryBase;

public class TaskToProjectRepository extends RelationshipRepositoryBase<Task, Long, Project, Long> {

	public TaskToProjectRepository() {
		super(Task.class, Project.class);
	}

}
