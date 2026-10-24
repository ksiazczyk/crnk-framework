// ---docerion
// type: test
// title: ClassBRepository mock repository
// summary: A mock in-memory repository for the ClassB test model, extending InMemoryResourceRepository.
// ---

package io.crnk.core.engine.internal.jackson.mock.repositories;

import io.crnk.core.engine.internal.jackson.mock.models.ClassB;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ClassBRepository extends InMemoryResourceRepository<ClassB, Long> {

    public ClassBRepository() {
        super(ClassB.class);
    }
}
