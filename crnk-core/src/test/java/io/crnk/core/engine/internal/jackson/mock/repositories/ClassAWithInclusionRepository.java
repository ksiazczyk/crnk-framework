// ---docerion
// type: test
// title: ClassAWithInclusionRepository mock repository
// summary: A mock in-memory repository for the ClassAWithInclusion test model used in Jackson inclusion tests.
// ---

package io.crnk.core.engine.internal.jackson.mock.repositories;

import io.crnk.core.engine.internal.jackson.mock.models.ClassAWithInclusion;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ClassAWithInclusionRepository extends InMemoryResourceRepository<ClassAWithInclusion, Long> {

    public ClassAWithInclusionRepository() {
        super(ClassAWithInclusion.class);
    }
}
