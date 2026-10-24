// ---docerion
// type: source
// title: FormResource JSON:API model
// summary: Defines a minimal JSON:API resource model for Activiti forms with only an identifier field.
// ---

package io.crnk.data.activiti.resource;

import io.crnk.core.resource.annotations.JsonApiId;

public class FormResource {

	@JsonApiId
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
