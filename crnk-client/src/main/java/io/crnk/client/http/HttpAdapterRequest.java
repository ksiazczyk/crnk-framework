// ---docerion
// type: source
// title: HttpAdapterRequest interface
// summary: Declares the HttpAdapterRequest interface that builds headers, executes requests, and exposes request details.
// ---

package io.crnk.client.http;

import io.crnk.core.engine.http.HttpMethod;

import java.io.IOException;
import java.util.Set;

public interface HttpAdapterRequest {

    void header(String name, String value);

    HttpAdapterResponse execute() throws IOException;

    String getBody();

    String getUrl();

    HttpMethod getHttpMethod();

    Set<String> getHeadersNames();

    String getHeaderValue(String name);

}
