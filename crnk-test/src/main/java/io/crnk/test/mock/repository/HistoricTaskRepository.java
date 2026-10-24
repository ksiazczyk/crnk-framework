// ---docerion
// type: test
// title: Bulk task repository interface
// summary: Interface declaring bulk repository operations for bulk task resources.
// ---

package io.crnk.test.mock.repository;

import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.test.mock.models.HistoricTask;

public class HistoricTaskRepository extends InMemoryResourceRepository<HistoricTask, Long> {

    public HistoricTaskRepository() {
        super(HistoricTask.class);
    }
}
