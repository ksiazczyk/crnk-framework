// ---docerion
// type: test
// title: Task to Project relationship repository
// summary: Relationship repository declaring the Task to Project association for CRNK mock data handling.
// ---

package io.crnk.monitor.brave.mock.repository;

import io.crnk.core.repository.RelationshipRepositoryBase;
import io.crnk.monitor.brave.mock.models.Project;
import io.crnk.monitor.brave.mock.models.Task;

public class TaskToProjectRepository extends RelationshipRepositoryBase<Task, Long, Project, Long> {

	public TaskToProjectRepository() {
		super(Task.class, Project.class);
	}
}
