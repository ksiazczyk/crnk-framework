// ---docerion
// type: source
// title: OkHttpBraveIntegration
// summary: Adds a Brave tracing network interceptor and dispatcher to the OkHttp client builder for HTTP tracing.
// ---

package io.crnk.monitor.brave.internal;

import brave.http.HttpTracing;
import brave.okhttp3.TracingInterceptor;
import io.crnk.client.http.okhttp.OkHttpAdapterListener;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class OkHttpBraveIntegration implements OkHttpAdapterListener {

	private HttpTracing httpTracing;

	public OkHttpBraveIntegration(HttpTracing httpTracing) {
		this.httpTracing = httpTracing;
	}

	@Override
	public void onBuild(OkHttpClient.Builder builder) {
		Interceptor interceptor = TracingInterceptor.create(httpTracing);
		builder.addNetworkInterceptor(interceptor);
		builder.dispatcher(new Dispatcher(
				httpTracing.tracing().currentTraceContext()
						.executorService(new Dispatcher().executorService())
		));
	}
}
