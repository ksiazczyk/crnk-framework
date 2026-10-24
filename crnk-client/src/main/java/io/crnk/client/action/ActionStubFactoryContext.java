// ---docerion
// type: source
// title: ActionStubFactoryContext providing factory dependencies
// summary: Interface exposing the service URL provider and HTTP adapter that an action stub factory relies on.
// ---

package io.crnk.client.action;

import io.crnk.client.http.HttpAdapter;
import io.crnk.core.engine.url.ServiceUrlProvider;

public interface ActionStubFactoryContext {

	ServiceUrlProvider getServiceUrlProvider();

	HttpAdapter getHttpAdapter();

}
