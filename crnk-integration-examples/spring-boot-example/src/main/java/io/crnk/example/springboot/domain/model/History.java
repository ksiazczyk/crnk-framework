// ---docerion
// type: source
// title: History domain model class
// summary: A CRNK JSON:API domain model class representing a history record with an UUID id and a name.
// ---

package io.crnk.example.springboot.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

import java.util.UUID;

@JsonApiResource(type = "history")
public class History {

	@JsonApiId
	private UUID id;

	@JsonProperty
	private String name;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
