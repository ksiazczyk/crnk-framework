// ---docerion
// type: source
// title: OperationFilter
// summary: Interface defining a filter that transforms a list of operation responses within the operations filter chain.
// ---

package io.crnk.operations.server;

import io.crnk.operations.OperationResponse;

import java.util.List;


public interface OperationFilter {

	List<OperationResponse> filter(OperationFilterContext context, OperationFilterChain chain);

}
