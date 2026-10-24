// ---docerion
// type: test
// title: MetaInterfaceTest for interface instantiation
// summary: Test that instantiates a MetaInterface, with a placeholder for future meaningful assertions.
// ---

package io.crnk.meta.model;

import org.junit.Assert;
import org.junit.Test;

public class MetaInterfaceTest {

	@Test
	public void createObject() {
		// TODO add more meaningful tests once actuall in use
		Assert.assertNotNull(new MetaInterface());
	}
}
