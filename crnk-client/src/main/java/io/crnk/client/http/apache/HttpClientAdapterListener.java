// ---docerion
// type: source
// title: HttpClientAdapterListener interface
// summary: Interface for listeners that can customize the Apache HttpClientBuilder during client construction.
// ---

package io.crnk.client.http.apache;

import org.apache.http.impl.client.HttpClientBuilder;

public interface HttpClientAdapterListener {

	void onBuild(HttpClientBuilder builder);

}
