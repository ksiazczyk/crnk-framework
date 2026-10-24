// ---docerion
// type: test
// title: RepositoryAccessVertxTest
// summary: Vertx test class that runs the basic repository access test suite against a Vert.x-backed test container.
// ---

package io.crnk.setup.vertx.suite;

import io.crnk.test.suite.BasicRepositoryAccessTestBase;

public class RepositoryAccessVertxTest extends BasicRepositoryAccessTestBase {

	public RepositoryAccessVertxTest() {
		testContainer = new VertxTestContainer();
	}
}
