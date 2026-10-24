// ---docerion
// type: source
// title: ManyNestedRepository
// summary: In-memory mock repository that supplies PostComment resources for exercising nested many relationships in the crnk test suite.
// ---

package io.crnk.test.mock.repository.nested;

import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.test.mock.models.nested.PostComment;
import io.crnk.test.mock.models.nested.PostCommentId;

public class ManyNestedRepository extends InMemoryResourceRepository<PostComment, PostCommentId> {

	public ManyNestedRepository() {
		super(PostComment.class);
	}
}