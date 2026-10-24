// ---docerion
// type: test
// title: TestClientModuleFactory
// summary: Test factory implementing ClientModuleFactory to produce a ClientTestModule for module discovery tests.
// ---

package io.crnk.client.module;

import io.crnk.test.mock.ClientTestModule;

public class TestClientModuleFactory implements ClientModuleFactory {

	@Override
	public ClientTestModule create() {
		return new ClientTestModule();
	}
}
