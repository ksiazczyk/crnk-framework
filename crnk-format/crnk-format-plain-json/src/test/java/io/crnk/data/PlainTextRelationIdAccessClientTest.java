// ---docerion
// type: test
// title: PlainTextRelationIdAccessClientTest
// summary: Client test for relation id access wired to the plain JSON test container.
// ---

package io.crnk.data;

import io.crnk.test.suite.RelationIdAccessTestBase;

public class PlainTextRelationIdAccessClientTest extends RelationIdAccessTestBase {

	public PlainTextRelationIdAccessClientTest() {
		PlainJsonTestContainer testContainer = new PlainJsonTestContainer();
		this.testContainer = testContainer;
	}
}
