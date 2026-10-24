// ---docerion
// type: source
// title: AsyncAdapter servlet async listener
// summary: Empty implementation of the servlet AsyncListener interface with no-op callback methods for async request lifecycle events.
// ---

package io.crnk.servlet.internal;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import java.io.IOException;

public class AsyncAdapter implements AsyncListener {
	@Override
	public void onComplete(AsyncEvent event) {

	}

	@Override
	public void onTimeout(AsyncEvent event) throws IOException {

	}

	@Override
	public void onError(AsyncEvent event) {

	}

	@Override
	public void onStartAsync(AsyncEvent event) {

	}
}
