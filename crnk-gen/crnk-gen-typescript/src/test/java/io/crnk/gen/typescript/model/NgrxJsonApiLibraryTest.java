// ---docerion
// type: test
// title: NgrxJsonApiLibraryTest
// summary: JUnit test asserting that NgrxJsonApiLibrary exposes a private constructor.
// ---

package io.crnk.gen.typescript.model;

import io.crnk.gen.typescript.model.libraries.NgrxJsonApiLibrary;
import io.crnk.test.mock.ClassTestUtils;
import org.junit.Test;

public class NgrxJsonApiLibraryTest {

	@Test
	public void hasPrivateConstructor() {
		ClassTestUtils.assertPrivateConstructor(NgrxJsonApiLibrary.class);
	}
}
