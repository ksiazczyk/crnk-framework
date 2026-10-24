// ---docerion
// type: test
// title: RelationIdVertxTest
// summary: Vertx test class that runs the CRNK relation id access test suite against a Vert.x-backed test container.
// ---

package io.crnk.setup.vertx.suite;

import io.crnk.test.suite.RelationIdAccessTestBase;

public class RelationIdVertxTest extends RelationIdAccessTestBase {

	public RelationIdVertxTest() {
		testContainer = new VertxTestContainer();
	}
}
