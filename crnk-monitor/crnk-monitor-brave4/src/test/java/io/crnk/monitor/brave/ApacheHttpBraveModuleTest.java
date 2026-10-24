// ---docerion
// type: test
// title: ApacheHttpBraveModuleTest
// summary: Runs the Brave module integration tests against the Apache HttpClient adapter.
// ---

package io.crnk.monitor.brave;

import io.crnk.client.http.apache.HttpClientAdapter;

public class ApacheHttpBraveModuleTest extends AbstractBraveModuleTest {

	public ApacheHttpBraveModuleTest() {
		super(HttpClientAdapter.newInstance());
	}
}
