// ---docerion
// type: source
// title: HttpAdapterResponse interface
// summary: Declares the HttpAdapterResponse interface that exposes response status, body, and header information.
// ---

package io.crnk.client.http;

import java.io.IOException;
import java.util.Set;

public interface HttpAdapterResponse {

    boolean isSuccessful();

    String body() throws IOException;

    int code();

    String message();

    String getResponseHeader(String name);

    Set<String> getHeaderNames();

}
