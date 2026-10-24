// ---docerion
// type: test
// title: ClientTestModule
// summary: A test module that registers a test exception mapper and naming strategy for client-side tests.
// ---

package io.crnk.test.mock;

import io.crnk.core.module.SimpleModule;

public class ClientTestModule extends SimpleModule {

	public ClientTestModule() {
		super("test");

		addExceptionMapper(new TestExceptionMapper());
		addNamingStrategy(new TestNamingStrategy());
	}

}
