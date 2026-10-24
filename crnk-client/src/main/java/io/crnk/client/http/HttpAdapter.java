// ---docerion
// type: source
// title: HttpAdapter interface
// summary: Defines the HttpAdapter interface that manages listeners, creates requests, and configures receive timeouts for HTTP communication.
// ---

package io.crnk.client.http;

import io.crnk.core.engine.http.HttpMethod;

import java.util.concurrent.TimeUnit;

public interface HttpAdapter {

    void addListener(HttpAdapterListener listener);

    HttpAdapterRequest newRequest(String url, HttpMethod method, String requestBody);

    void setReceiveTimeout(int timeout, TimeUnit unit);

}
