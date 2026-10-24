// ---docerion
// type: test
// title: ProjectToTaskRepository
// summary: Relationship repository mapping Project to Task for relationship evaluation tests.
// ---

package io.crnk.core.queryspec;

public class InMemoryEvaluatorTest extends InMemoryEvaluatorTestBase {


	@Override
	protected InMemoryEvaluator getEvaluator() {
		return new InMemoryEvaluator();
	}
}
