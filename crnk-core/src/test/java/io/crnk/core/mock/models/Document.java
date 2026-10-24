// ---docerion
// type: source
// title: Abstract Document model
// summary: Abstract JSON API document model extending Thing with a title property.
// ---

package io.crnk.core.mock.models;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "documents")
public abstract class Document extends Thing {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
