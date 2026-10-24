// ---docerion
// type: source
// title: OneNestedRepository
// summary: In-memory mock repository that supplies PostHeader resources for nested one relationships in the crnk test suite.
// ---

package io.crnk.test.mock.repository.nested;

import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.test.mock.models.nested.PostHeader;

public class OneNestedRepository extends InMemoryResourceRepository<PostHeader, String> {

	public OneNestedRepository() {
		super(PostHeader.class);
	}
}