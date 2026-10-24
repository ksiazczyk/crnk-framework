// ---docerion
// type: source
// title: ResourceFilterContext interface
// summary: Interface providing access to the query context during resource filtering.
// ---

package io.crnk.core.engine.filter;

import io.crnk.core.engine.query.QueryContext;

public interface ResourceFilterContext {

    QueryContext getQueryContext();
}
