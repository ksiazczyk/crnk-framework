// ---docerion
// type: source
// title: JSON:API model class for schedule approval values
// summary: Model class implementing the ApprovalValues interface for schedule approval values.
// ---

package io.crnk.data.activiti.example.model;


import io.crnk.data.activiti.example.approval.ApprovalValues;

public class ScheduleApprovalValues implements ApprovalValues {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
