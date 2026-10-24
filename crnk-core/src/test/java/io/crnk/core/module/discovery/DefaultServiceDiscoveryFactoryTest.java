// ---docerion
// type: test
// title: DefaultServiceDiscoveryFactoryTest
// summary: JUnit test verifying that DefaultServiceDiscoveryFactory returns an instance of TestServiceDiscovery.
// ---

package io.crnk.core.module.discovery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultServiceDiscoveryFactoryTest {

	@Test
	public void test() {
		DefaultServiceDiscoveryFactory factory = new DefaultServiceDiscoveryFactory();
		ServiceDiscovery instance = factory.getInstance();
		Assert.assertTrue(instance instanceof TestServiceDiscovery);
	}
}
