// ---docerion
// type: test
// title: TestException
// summary: A runtime exception used as a sample error in tests.
// ---

package io.crnk.test.mock;

public class TestException extends RuntimeException {

	public TestException(String message) {
		super(message);
	}
}
