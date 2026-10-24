// ---docerion
// type: test
// title: InformationClientTest for information access
// summary: JUnit test that exercises information access through the CRNK client by extending the information access test base.
// ---

package io.crnk.client.suite;

import io.crnk.test.suite.InformationAccessTestBase;

public class InformationClientTest extends InformationAccessTestBase {

	public InformationClientTest() {
		ClientTestContainer testContainer = new ClientTestContainer();
		this.testContainer = testContainer;
	}

}