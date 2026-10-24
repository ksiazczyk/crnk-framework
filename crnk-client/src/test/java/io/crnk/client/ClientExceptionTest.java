// ---docerion
// type: config
// title: Karma test configuration
// summary: Karma configuration that runs Jasmine unit tests with karma-typescript for the Angular client.
// ---

package io.crnk.client;

import org.junit.Assert;
import org.junit.Test;

public class ClientExceptionTest {

	@Test
	public void test() {
		ClientException exception = new ClientException(400, "test");
		Assert.assertEquals("400", exception.getErrorData().getStatus());
		Assert.assertEquals("test", exception.getMessage());
	}
}
