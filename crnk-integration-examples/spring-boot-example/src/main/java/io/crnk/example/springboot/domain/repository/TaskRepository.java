// ---docerion
// type: source
// title: TaskRepository interface for Task resources
// summary: An interface for the Task repository extending the CRNK ResourceRepository.
// ---

package io.crnk.example.springboot.domain.repository;

import io.crnk.core.repository.ResourceRepository;
import io.crnk.example.springboot.domain.model.Task;

public interface TaskRepository extends ResourceRepository<Task, Long> {

}
