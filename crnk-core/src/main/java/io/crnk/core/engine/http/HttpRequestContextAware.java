// ---docerion
// type: source
// title: HttpRequestContextAware
// summary: Interface that repositories can implement to gain access to the HTTP request context provider.
// ---

package io.crnk.core.engine.http;

/**
 * Can be implemented by repositories to get access to request parameters.
 */
public interface HttpRequestContextAware {

	void setHttpRequestContextProvider(HttpRequestContextProvider requestContextProvider);
}
