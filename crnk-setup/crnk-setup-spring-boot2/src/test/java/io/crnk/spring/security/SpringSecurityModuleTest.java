// ---docerion
// type: test
// title: SpringSecurityModuleTest
// summary: Verifies that the SpringSecurityModule reports the expected module name of spring.security.
// ---

package io.crnk.spring.security;

import org.junit.Assert;
import org.junit.Test;

public class SpringSecurityModuleTest {

	@Test
	public void checkName() {
		SpringSecurityModule module = SpringSecurityModule.create();
		Assert.assertEquals("spring.security", module.getModuleName());
	}
}
