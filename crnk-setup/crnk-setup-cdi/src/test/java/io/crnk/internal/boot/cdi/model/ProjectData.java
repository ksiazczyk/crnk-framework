// ---docerion
// type: test
// title: ProjectData
// summary: A simple data holder class storing a single string value used as project data.
// ---

package io.crnk.internal.boot.cdi.model;

public class ProjectData {
	private String data;

	public String getData() {
		return data;
	}

	public ProjectData setData(@SuppressWarnings("SameParameterValue") String data) {
		this.data = data;
		return this;
	}
}
