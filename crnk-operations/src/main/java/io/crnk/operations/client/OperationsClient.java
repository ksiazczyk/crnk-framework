// ---docerion
// type: source
// title: OperationsClient wraps CrnkClient for operations
// summary: Wraps a CrnkClient and creates OperationsCall instances to queue and execute operations.
// ---

package io.crnk.operations.client;


import io.crnk.client.CrnkClient;

public class OperationsClient {

	private CrnkClient crnk;

	public OperationsClient(CrnkClient crnk) {
		this.crnk = crnk;
	}

	public OperationsCall createCall() {
		return new OperationsCall(this);
	}

	protected CrnkClient getCrnk() {
		return crnk;
	}
}
