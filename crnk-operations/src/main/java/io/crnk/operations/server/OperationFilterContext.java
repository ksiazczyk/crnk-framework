// ---docerion
// type: source
// title: OperationFilterContext
// summary: Interface providing context such as ordered operations, service discovery, and query context to operation filters.
// ---

package io.crnk.operations.server;

import io.crnk.core.engine.query.QueryContext;
import io.crnk.core.module.discovery.ServiceDiscovery;
import io.crnk.operations.server.order.OrderedOperation;

import java.util.List;

public interface OperationFilterContext {

    List<OrderedOperation> getOrderedOperations();

    ServiceDiscovery getServiceDiscovery();

    QueryContext getQueryContext();
}
