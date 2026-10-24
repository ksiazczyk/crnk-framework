// ---docerion
// type: test
// title: AbstractDocumentFilterTest
// summary: Verifies that AbstractDocumentFilter delegates filtering to the chain by mocking the filter context and chain with Mockito.
// ---

package io.crnk.core.engine.http;

import org.junit.Test;

public class DefaultHttpRequestProcessorTest {

	private HttpRequestProcessor processor = new HttpRequestProcessor() {
		@Override
		public boolean supportsAsync() {
			return false;
		}
	};

	@Test(expected = UnsupportedOperationException.class)
	public void test() {
		processor.accepts(null);
	}


	@Test(expected = UnsupportedOperationException.class)
	public void processAsync() {
		processor.processAsync(null);
	}
}
