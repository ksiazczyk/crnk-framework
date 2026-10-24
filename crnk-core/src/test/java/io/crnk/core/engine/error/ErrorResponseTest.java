// ---docerion
// type: test
// title: ErrorResponseTest
// summary: Checks that ErrorResponse fulfills the equals and hashCode contract.
// ---

package io.crnk.core.engine.error;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class ErrorResponseTest {

	@Test
	public void shouldFulfillHashcodeEqualsContract() {
		EqualsVerifier.forClass(ErrorResponse.class).verify();
	}
}