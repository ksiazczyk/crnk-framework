// ---docerion
// type: source
// title: PlainJsonDocumentSerializer
// summary: Jackson serializer that converts a PlainJsonDocument into its JSON representation.
// ---

package io.crnk.data;

import io.crnk.test.suite.ExceptionAccessTestBase;

public class PlainTextExceptionAccessClientTest extends ExceptionAccessTestBase {

	public PlainTextExceptionAccessClientTest() {
		PlainJsonTestContainer testContainer = new PlainJsonTestContainer();
		this.testContainer = testContainer;
	}
}