// ---docerion
// type: source
// title: HttpClientBraveIntegration
// summary: Integrates Brave HTTP tracing into the Apache HttpClient adapter by providing a tracing HTTP client builder.
// ---

package io.crnk.monitor.brave.internal;

import brave.http.HttpTracing;
import brave.httpclient.TracingHttpClientBuilder;
import io.crnk.client.http.apache.HttpClientAdapterListener;
import io.crnk.client.http.apache.HttpClientBuilderFactory;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientBraveIntegration implements HttpClientAdapterListener, HttpClientBuilderFactory {


	private final HttpTracing httpTracing;

	public HttpClientBraveIntegration(HttpTracing httpTracing) {
		this.httpTracing = httpTracing;
	}

	@Override
	public void onBuild(HttpClientBuilder builder) {
		// nothing to do
	}

	@Override
	public HttpClientBuilder createBuilder() {
		return TracingHttpClientBuilder.create(httpTracing);
	}
}
