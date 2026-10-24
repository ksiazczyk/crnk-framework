// ---docerion
// type: source
// title: ApprovalManagerFactory provides a singleton instance
// summary: Provides a deprecated singleton instance of the ApprovalManager for use across the example.
// ---

package io.crnk.data.activiti.example.approval;

@Deprecated // TODO find a better solution without singleton
public class ApprovalManagerFactory {

	private static ApprovalManager instance;

	public ApprovalManager getInstance() {
		if (instance == null) {
			instance = new ApprovalManager();
		}
		return instance;
	}

}
