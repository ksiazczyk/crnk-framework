// ---docerion
// type: source
// title: Memorandum document subclass
// summary: JSON API document subclass adding a body property to the abstract Document model.
// ---

package io.crnk.core.mock.models;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "memoranda")
public class Memorandum extends Document {
	private String body;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
