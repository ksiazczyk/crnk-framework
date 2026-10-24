// ---docerion
// type: source
// title: SecurityProviderContext interface
// summary: Java interface exposing the query context that security providers use during authentication and role checks.
// ---

package io.crnk.core.engine.security;

import io.crnk.core.engine.query.QueryContext;

public interface SecurityProviderContext {
	QueryContext getQueryContext();
}
