// ---docerion
// type: source
// title: ObjectProxy interface
// summary: Interface describing proxy objects with a URL and a loaded state.
// ---

package io.crnk.client.internal.proxy;

public interface ObjectProxy {

	String getUrl();

	boolean isLoaded();
}
