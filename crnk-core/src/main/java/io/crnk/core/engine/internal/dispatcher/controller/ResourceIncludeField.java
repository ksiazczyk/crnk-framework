// ---docerion
// type: source
// title: ResourceIncludeField
// summary: Abstract base controller that validates the presence of a request document before processing.
// ---

package io.crnk.core.engine.internal.dispatcher.controller;

import io.crnk.core.engine.document.Document;
import io.crnk.core.engine.http.HttpMethod;
import io.crnk.core.exception.RequestBodyNotFoundException;

public abstract class ResourceIncludeField extends BaseController {


	protected void assertRequestDocument(Document requestDocument, HttpMethod method, String resourceType) {
		if (requestDocument == null) {
			throw new RequestBodyNotFoundException(method, resourceType);
		}
	}
}
