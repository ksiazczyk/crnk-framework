// ---docerion
// type: source
// title: TaskSubType
// summary: Subtype of Task annotated as a JSON:API resource with an additional subtype value.
// ---

package io.crnk.test.mock.models;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "tasksSubType")
public class TaskSubType extends Task {

	private int subTypeValue;

	public int getSubTypeValue() {
		return subTypeValue;
	}

	public void setSubTypeValue(int subTypeValue) {
		this.subTypeValue = subTypeValue;
	}
}
