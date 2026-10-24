// ---docerion
// type: source
// title: SequenceDTO JSON:API resource
// summary: A JSON:API resource DTO defining a sequence data model with an id and a string value for the JPA test suite.
// ---

package io.crnk.data.jpa.model.dto;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "sequenceDTO")
public class SequenceDTO {

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
