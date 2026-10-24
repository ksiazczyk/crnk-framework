// ---docerion
// type: test
// title: ClassCRepository mock repository
// summary: A mock in-memory repository for the ClassC test model, extending InMemoryResourceRepository.
// ---

package io.crnk.core.engine.internal.jackson.mock.repositories;

import io.crnk.core.engine.internal.jackson.mock.models.ClassC;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ClassCRepository extends InMemoryResourceRepository<ClassC, Long> {

    public ClassCRepository() {
        super(ClassC.class);
    }
}
