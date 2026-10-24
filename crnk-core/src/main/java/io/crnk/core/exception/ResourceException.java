// ---docerion
// type: source
// title: ResourceException
// summary: General exception regarding resource building, mapping to an HTTP 500 status with a standard error body.
// ---

package io.crnk.core.exception;

import io.crnk.core.engine.document.ErrorData;
import io.crnk.core.engine.http.HttpStatus;

/**
 * General exception regarding resource building.
 */
public class ResourceException extends InternalServerErrorException {  // NOSONAR exception hierarchy deep but ok

	private static final String TITLE = "Resource error";

	public ResourceException(String message) {
		super(HttpStatus.INTERNAL_SERVER_ERROR_500, ErrorData.builder()
				.setTitle(TITLE)
				.setDetail(message)
				.setStatus(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR_500))
				.build());
	}

	public ResourceException(String message, Exception cause) {
		super(HttpStatus.INTERNAL_SERVER_ERROR_500, ErrorData.builder()
				.setTitle(TITLE)
				.setDetail(message)
				.setStatus(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR_500))
				.build(), cause);
	}
}
