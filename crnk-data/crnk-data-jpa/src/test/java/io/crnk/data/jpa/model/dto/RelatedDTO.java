// ---docerion
// type: source
// title: RelatedDTO JSON:API resource
// summary: A JSON:API resource DTO defining a related data model with an id and a string value, used as a fixture in the JPA test suite.
// ---

package io.crnk.data.jpa.model.dto;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "relatedDTO")
public class RelatedDTO {

	@JsonApiId
	private Long id;

	private String stringValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
}
