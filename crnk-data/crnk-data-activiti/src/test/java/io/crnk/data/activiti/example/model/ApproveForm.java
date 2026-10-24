// ---docerion
// type: source
// title: JSON:API model class for an approval form
// summary: Model class annotated as a JSON:API resource representing an approval form with an approved flag.
// ---

package io.crnk.data.activiti.example.model;

import io.crnk.data.activiti.resource.FormResource;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "approval/approveForm")
public class ApproveForm extends FormResource {

	private boolean approved;

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
