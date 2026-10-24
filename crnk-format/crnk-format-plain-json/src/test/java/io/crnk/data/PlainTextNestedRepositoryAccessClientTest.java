// ---docerion
// type: test
// title: PlainTextNestedRepositoryAccessClientTest
// summary: Client test for nested repository access wired to the plain JSON test container.
// ---

package io.crnk.data;

import io.crnk.test.suite.NestedRepositoryAccessTestBase;

public class PlainTextNestedRepositoryAccessClientTest extends NestedRepositoryAccessTestBase {

	public PlainTextNestedRepositoryAccessClientTest() {
		PlainJsonTestContainer testContainer = new PlainJsonTestContainer();
		this.testContainer = testContainer;
	}
}
