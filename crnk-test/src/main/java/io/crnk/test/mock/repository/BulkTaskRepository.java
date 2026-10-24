// ---docerion
// type: source
// title: In-memory resource repository base class
// summary: Base class providing an in-memory implementation of resource repository operations used by the test suite.
// ---

package io.crnk.test.mock.repository;

import io.crnk.core.repository.BulkResourceRepository;
import io.crnk.test.mock.models.BulkTask;

public interface BulkTaskRepository extends BulkResourceRepository<BulkTask, Long> {

}
