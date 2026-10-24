// ---docerion
// type: test
// title: TotalResourceCountTestRepository
// summary: In-memory test repository that supplies a fixed total resource count for paging tests.
// ---

package io.crnk.core.resource.paging.total;

import io.crnk.core.repository.InMemoryResourceRepository;

public class TotalResourceCountTestRepository extends InMemoryResourceRepository<TotalResourceCountResource, Long> {

    public TotalResourceCountTestRepository() {
        super(TotalResourceCountResource.class);
    }
}