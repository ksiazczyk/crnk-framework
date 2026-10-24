// ---docerion
// type: test
// title: RenamedIdResource
// summary: A JSON API resource using a non-default attribute name as its identifier.
// ---

package io.crnk.test.mock.models;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "renamedId")
public class RenamedIdResource {

	@JsonApiId
	private String notId;

	public String getNotId() {
		return notId;
	}

	public void setNotId(String notId) {
		this.notId = notId;
	}
}