// ---docerion
// type: source
// title: Specification JsonApiResource extending Document
// summary: JsonApiResource model extending Document with a design outline and a task relation.
// ---

package io.crnk.core.mock.models;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "specifications")
public class Specification extends Document {
	private String designOutlines;

	private Task task;

	public String getDesignOutlines() {
		return designOutlines;
	}

	public void setDesignOutlines(String designOutlines) {
		this.designOutlines = designOutlines;
	}

	public Task getTask() {
		return task;
	}

	public Specification setTask(Task task) {
		this.task = task;
		return this;
	}
}
