// ---docerion
// type: source
// title: ProcessInstanceResource JSON:API model
// summary: Extends ExecutionResource with business key, process definition key, and start time for process instance resources.
// ---

package io.crnk.data.activiti.resource;

import java.time.OffsetDateTime;

import io.crnk.core.resource.annotations.JsonApiField;

public class ProcessInstanceResource extends ExecutionResource {

	private String businessKey;

	@JsonApiField(patchable = false)
	private String processDefinitionKey;

	private OffsetDateTime startTime;

	public OffsetDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(OffsetDateTime startTime) {
		this.startTime = startTime;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}
}
