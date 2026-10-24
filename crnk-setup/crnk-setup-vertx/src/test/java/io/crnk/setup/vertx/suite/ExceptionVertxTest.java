// ---docerion
// type: test
// title: ExceptionVertxTest
// summary: Vertx test class that runs the CRNK exception access test suite against a Vert.x-backed test container.
// ---

package io.crnk.setup.vertx.suite;

import io.crnk.test.suite.ExceptionAccessTestBase;

public class ExceptionVertxTest extends ExceptionAccessTestBase {

	public ExceptionVertxTest() {
		testContainer = new VertxTestContainer();
	}
}