// ---docerion
// type: test
// title: ProjectData mock model
// summary: Simple model holding a NotNull value field, used as a test fixture for validation.
// ---

package io.crnk.validation.mock.models;

import javax.validation.constraints.NotNull;

public class ProjectData {

	@NotNull
	private String value;

	public String getValue() {
		return value;
	}

	public ProjectData setValue(@SuppressWarnings("SameParameterValue") String value) {
		this.value = value;
		return this;
	}
}
