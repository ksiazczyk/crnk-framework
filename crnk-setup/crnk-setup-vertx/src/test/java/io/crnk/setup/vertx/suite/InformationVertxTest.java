// ---docerion
// type: test
// title: InformationVertxTest
// summary: Vertx test class that runs the CRNK information access test suite against a Vert.x-backed test container.
// ---

package io.crnk.setup.vertx.suite;

import io.crnk.test.suite.InformationAccessTestBase;

public class InformationVertxTest extends InformationAccessTestBase {

	public InformationVertxTest() {
		testContainer = new VertxTestContainer();
	}
}