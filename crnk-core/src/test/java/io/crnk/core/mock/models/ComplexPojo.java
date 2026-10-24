// ---docerion
// type: source
// title: ComplexPojo JSON API resource model
// summary: JSON API resource model exposing an id, a contained relation and an updateable property.
// ---

package io.crnk.core.mock.models;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "complexpojos")
public class ComplexPojo {

	@JsonApiId
	Long id;
	ContainedPojo containedPojo;
	String updateableProperty;

	public ComplexPojo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContainedPojo getContainedPojo() {
		return containedPojo;
	}

	public void setContainedPojo(ContainedPojo containedPojo) {
		this.containedPojo = containedPojo;
	}

	public String getUpdateableProperty() {
		return updateableProperty;
	}

	public void setUpdateableProperty(String updateableProperty) {
		this.updateableProperty = updateableProperty;
	}

}
