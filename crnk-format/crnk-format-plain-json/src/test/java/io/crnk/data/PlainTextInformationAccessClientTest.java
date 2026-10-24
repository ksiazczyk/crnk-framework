// ---docerion
// type: test
// title: PlainTextInformationAccessClientTest
// summary: Client test for information access wired to the plain JSON test container.
// ---

package io.crnk.data;

import io.crnk.test.suite.InformationAccessTestBase;

public class PlainTextInformationAccessClientTest extends InformationAccessTestBase {

	public PlainTextInformationAccessClientTest() {
		PlainJsonTestContainer testContainer = new PlainJsonTestContainer();
		this.testContainer = testContainer;
	}
}
