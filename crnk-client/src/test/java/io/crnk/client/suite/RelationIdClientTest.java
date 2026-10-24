// ---docerion
// type: test
// title: RelationIdClientTest for relation ID access
// summary: JUnit test that validates relation ID access through the CRNK client.
// ---

package io.crnk.client.suite;

import io.crnk.test.suite.RelationIdAccessTestBase;

public class RelationIdClientTest extends RelationIdAccessTestBase {

	public RelationIdClientTest() {
		ClientTestContainer testContainer = new ClientTestContainer();
		this.testContainer = testContainer;
	}
}
