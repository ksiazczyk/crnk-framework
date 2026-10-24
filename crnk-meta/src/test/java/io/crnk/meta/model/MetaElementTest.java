// ---docerion
// type: test
// title: MetaElementTest for key cast validation
// summary: Test asserting that casting a MetaKey to a data object or type throws an IllegalStateException.
// ---

package io.crnk.meta.model;

import io.crnk.meta.AbstractMetaTest;
import org.junit.Test;

public class MetaElementTest extends AbstractMetaTest {


	@Test(expected = IllegalStateException.class)
	public void checkDataObjectCast() {
		new MetaKey().asDataObject();
	}

	@Test(expected = IllegalStateException.class)
	public void checkTypeCast() {
		new MetaKey().asType();
	}
}
