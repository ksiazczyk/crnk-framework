// ---docerion
// type: test
// title: DottedResourceName test fixture
// summary: A minimal JSON:API resource class used as a test fixture for TypeScript code generation.
// ---

package io.crnk.gen.typescript.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "some.DottedResource")
public class DottedResourceName {

	@JsonApiId
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
