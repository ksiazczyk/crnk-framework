// ---docerion
// type: source
// title: ResourceValidator validates entities (deprecated)
// summary: Deprecated interface for validating an entity against a request document.
// ---

package io.crnk.core.engine.information.resource;

import io.crnk.core.engine.document.Document;

/**
 * @deprecated
 */
@Deprecated
public interface ResourceValidator {

	void validate(Object entity, Document requestDocument);


}
