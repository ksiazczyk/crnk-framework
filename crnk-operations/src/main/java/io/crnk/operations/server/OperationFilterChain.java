// ---docerion
// type: source
// title: OperationFilterChain
// summary: Interface representing the chain of operation filters invoked to process a set of operations.
// ---

package io.crnk.operations.server;

import io.crnk.operations.OperationResponse;

import java.util.List;

public interface OperationFilterChain {

	List<OperationResponse> doFilter(OperationFilterContext context);

}
