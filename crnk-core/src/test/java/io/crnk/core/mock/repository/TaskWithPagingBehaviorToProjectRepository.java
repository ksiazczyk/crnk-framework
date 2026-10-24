// ---docerion
// type: test
// title: TaskWithPagingBehaviorToProjectRepository mock relationship repository
// summary: A mock relationship repository for TaskWithPagingBehavior to Project relationships.
// ---

package io.crnk.core.mock.repository;

import io.crnk.core.mock.models.Project;
import io.crnk.core.repository.RelationshipRepositoryBase;

public class TaskWithPagingBehaviorToProjectRepository
		extends RelationshipRepositoryBase<TaskWithPagingBehavior, String, Project, String> {

	public TaskWithPagingBehaviorToProjectRepository() {
		super(TaskWithPagingBehavior.class, Project.class);
	}
}