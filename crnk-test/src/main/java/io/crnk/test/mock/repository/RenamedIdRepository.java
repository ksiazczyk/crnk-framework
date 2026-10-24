// ---docerion
// type: test
// title: Relation id test repository
// summary: Repository for relation id test resources backed by a hash map.
// ---

package io.crnk.test.mock.repository;

import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.test.mock.models.RenamedIdResource;

public class RenamedIdRepository extends InMemoryResourceRepository<RenamedIdResource, String> {

	public RenamedIdRepository() {
		super(RenamedIdResource.class);
	}
}
