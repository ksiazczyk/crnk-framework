// ---docerion
// type: test
// title: CrnkPropertiesTest constructor test
// summary: JUnit test verifying that CrnkProperties has a private constructor to prevent instantiation.
// ---

package io.crnk.core.boot;

import io.crnk.core.engine.internal.utils.CoreClassTestUtils;
import org.junit.Test;

public class CrnkPropertiesTest {


	@Test
	public void hasPrimvateConstructor() {
		CoreClassTestUtils.assertPrivateConstructor(CrnkProperties.class);
	}
}
