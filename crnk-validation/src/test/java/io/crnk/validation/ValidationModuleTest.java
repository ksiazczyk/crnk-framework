// ---docerion
// type: test
// title: ValidationModuleTest module unit test
// summary: Unit test that checks the ValidationModule has a protected constructor and the expected module name.
// ---

package io.crnk.validation;

import io.crnk.test.mock.ClassTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class ValidationModuleTest {

	@Test
	public void hasProtectedConstructor() {
		ClassTestUtils.assertProtectedConstructor(ValidationModule.class);
	}

	@Test
	public void testName() {
		Assert.assertEquals("validation", ValidationModule.create().getModuleName());
	}
}
