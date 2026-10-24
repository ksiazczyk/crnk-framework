// ---docerion
// type: source
// title: HttpStatusContext interface
// summary: Context passed to status behavior implementations, exposing the response document and HTTP method.
// ---

package io.crnk.core.engine.http;

import io.crnk.core.engine.document.Document;

public interface HttpStatusContext {

	Document getResponseDocument();

	HttpMethod getMethod();

}
