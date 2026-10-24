// ---docerion
// type: test
// title: ResourceIdentifierTest for the ResourceIdentifier class
// summary: Verifies the equals contract of the ResourceIdentifier class using EqualsVerifier.
// ---

package io.crnk.core.engine.document;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class ResourceIdentifierTest {

	@Test
	public void testResourceIdentifierEqualsContract() {
		EqualsVerifier.forClass(ResourceIdentifier.class).usingGetClass().suppress(Warning.NONFINAL_FIELDS).verify();
	}
}
