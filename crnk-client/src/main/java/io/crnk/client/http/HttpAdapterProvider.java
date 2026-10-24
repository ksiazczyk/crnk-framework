// ---docerion
// type: source
// title: HttpAdapterProvider interface
// summary: Declares the HttpAdapterProvider interface that reports adapter availability and creates new adapter instances.
// ---

package io.crnk.client.http;

public interface HttpAdapterProvider {

	boolean isAvailable();

	HttpAdapter newInstance();

}
