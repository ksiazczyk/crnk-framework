// ---docerion
// type: source
// title: DataRoomFilterContext interface
// summary: Java interface defining the context passed to security filters, exposing the current query spec and HTTP method.
// ---

package io.crnk.security;

import io.crnk.core.engine.http.HttpMethod;
import io.crnk.core.queryspec.QuerySpec;

public interface DataRoomFilterContext {

    QuerySpec getQuerySpec();

    HttpMethod getMethod();
}
