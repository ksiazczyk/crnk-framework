// ---docerion
// type: test
// title: JsonApiResponseFilterTest
// summary: Runs the JSON API response filter test with null response wrapping disabled.
// ---

package io.crnk.rs;

import javax.ws.rs.core.Application;

/**
 * @author AdNovum Informatik AG
 */
public class JsonApiResponseFilterTest extends JsonApiResponseFilterTestBase {

	@Override
	protected Application configure() {
		return new JsonApiResponseFilterTestBase.TestApplication(this, false);
	}

}
