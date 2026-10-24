// ---docerion
// type: test
// title: UnknownException
// summary: A runtime exception representing an unexpected error in tests.
// ---

package io.crnk.test.mock;

public class UnknownException extends RuntimeException {

	public UnknownException(String message) {
		super(message);
	}
}
