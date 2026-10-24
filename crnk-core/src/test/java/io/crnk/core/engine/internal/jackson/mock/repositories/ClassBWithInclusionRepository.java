// ---docerion
// type: test
// title: ClassBWithInclusionRepository mock repository
// summary: A mock in-memory repository for the ClassBWithInclusion test model used in Jackson inclusion tests.
// ---

package io.crnk.core.engine.internal.jackson.mock.repositories;

import io.crnk.core.engine.internal.jackson.mock.models.ClassBWithInclusion;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ClassBWithInclusionRepository extends InMemoryResourceRepository<ClassBWithInclusion, Long> {
    public ClassBWithInclusionRepository() {
        super(ClassBWithInclusion.class);
    }
}
