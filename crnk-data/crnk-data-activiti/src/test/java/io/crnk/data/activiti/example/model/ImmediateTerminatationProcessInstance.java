// ---docerion
// type: source
// title: JSON:API model class for an immediately terminated process instance
// summary: Model class annotated as a JSON:API resource representing an immediately terminated process instance.
// ---

package io.crnk.data.activiti.example.model;

import io.crnk.data.activiti.resource.ProcessInstanceResource;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "approval/termination")
public class ImmediateTerminatationProcessInstance extends ProcessInstanceResource {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}