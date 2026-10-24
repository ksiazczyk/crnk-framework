// ---docerion
// type: source
// title: ResponseBodyException
// summary: Exception raised when the response body cannot be processed, carrying an optional cause.
// ---

package io.crnk.client;

import io.crnk.core.exception.CrnkException;

public class ResponseBodyException extends CrnkException {

	private static final long serialVersionUID = 824839750617131811L;

	public ResponseBodyException(String message) {
		super(message);
	}

	public ResponseBodyException(String message, Exception cause) {
		super(message, cause);
	}
}
