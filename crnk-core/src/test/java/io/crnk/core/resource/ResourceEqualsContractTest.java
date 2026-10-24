// ---docerion
// type: test
// title: Resource equals contract test
// summary: Verifies the equals and hashCode contract for ResourceIdentifier and Resource using EqualsVerifier.
// ---

package io.crnk.core.resource;

import io.crnk.core.engine.document.Resource;
import io.crnk.core.engine.document.ResourceIdentifier;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class ResourceEqualsContractTest {

	@Test
	public void testResourceIdEqualsContract() {
		EqualsVerifier.forClass(ResourceIdentifier.class).usingGetClass().suppress(Warning.NONFINAL_FIELDS).verify();
	}

	@Test
	public void testResourceEqualsContract() {
		EqualsVerifier.forClass(Resource.class).usingGetClass().suppress(Warning.NONFINAL_FIELDS).verify();
	}

}
