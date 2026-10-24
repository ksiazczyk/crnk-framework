// ---docerion
// type: source
// title: Operation order strategy interface
// summary: Defines the interface contract for ordering a list of operations into an ordered sequence.
// ---

package io.crnk.operations.server.order;

import io.crnk.operations.Operation;

import java.util.List;

public interface OperationOrderStrategy {

	List<OrderedOperation> order(List<Operation> operations);
}
