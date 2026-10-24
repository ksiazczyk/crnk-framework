// ---docerion
// type: test
// title: BaseExceptionMapper abstract test fixture
// summary: Abstract base class providing default no-op implementations of the ExceptionMapper interface for use as a test fixture.
// ---

package io.crnk.core.engine.error.handlers;

import io.crnk.core.engine.error.ErrorResponse;
import io.crnk.core.engine.error.ExceptionMapper;

/**
 * Created by yuval on 02/03/2017.
 */
public abstract class BaseExceptionMapper<E extends Throwable> implements ExceptionMapper<E> {

	@Override
	public E fromErrorResponse(ErrorResponse errorResponse) {
		return null;
	}

	@Override
	public boolean accepts(ErrorResponse errorResponse) {
		return false;
	}
}