// ---docerion
// type: test
// title: JsonApiResponseFilterNullTest
// summary: Runs the JSON API response filter test with null response wrapping enabled.
// ---

package io.crnk.rs;

import javax.ws.rs.core.Application;

public class JsonApiResponseFilterNullTest extends JsonApiResponseFilterTestBase {

	@Override
	protected Application configure() {
		return new JsonApiResponseFilterTestBase.TestApplication(this, true);
	}

}
