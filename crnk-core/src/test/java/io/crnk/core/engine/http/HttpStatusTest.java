// ---docerion
// type: test
// title: JsonApiRequestProcessorTest
// summary: Tests JsonApiRequestProcessor content-type detection and request handling for various HTTP methods and accept headers.
// ---

package io.crnk.core.engine.http;

import io.crnk.core.engine.internal.utils.CoreClassTestUtils;
import org.junit.Test;

public class HttpStatusTest {

	@Test
	public void testPrivateConstructor() {
		CoreClassTestUtils.assertPrivateConstructor(HttpStatus.class);
	}
}
