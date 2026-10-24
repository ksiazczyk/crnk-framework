// ---docerion
// type: test
// title: BraveUtilTest
// summary: Verifies that BraveUtil has a private constructor and cannot be instantiated.
// ---

package io.crnk.monitor.brave;

import io.crnk.monitor.brave.internal.BraveUtil;
import io.crnk.test.mock.ClassTestUtils;
import org.junit.Test;

public class BraveUtilTest {


	@Test
	public void testHasPrivateConstructor() {
		ClassTestUtils.assertPrivateConstructor(BraveUtil.class);
	}
}
