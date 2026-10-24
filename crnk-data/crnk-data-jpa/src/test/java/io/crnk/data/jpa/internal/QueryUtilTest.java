// ---docerion
// type: test
// title: QueryUtilTest
// summary: JUnit test verifying that QueryUtil has a private constructor and cannot be instantiated.
// ---

package io.crnk.data.jpa.internal;

import io.crnk.data.jpa.internal.query.QueryUtil;
import io.crnk.test.mock.ClassTestUtils;
import org.junit.Test;

public class QueryUtilTest {

	@Test
	public void hasPrivateConstructor() {
		ClassTestUtils.assertPrivateConstructor(QueryUtil.class);
	}
}
