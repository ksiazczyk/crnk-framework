// ---docerion
// type: source
// title: HttpAdapterListener interface
// summary: Declares the HttpAdapterListener interface that receives callbacks for outgoing requests and incoming responses.
// ---

package io.crnk.client.http;

public interface HttpAdapterListener {

    void onRequest(HttpAdapterRequest request);

    void onResponse(HttpAdapterRequest request, HttpAdapterResponse response);
}
