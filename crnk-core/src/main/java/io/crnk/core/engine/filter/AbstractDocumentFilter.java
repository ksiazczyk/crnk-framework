// ---docerion
// type: source
// title: AbstractDocumentFilter
// summary: Empty DocumentFilter implementation serving as a starting point for writing new filters.
// ---

package io.crnk.core.engine.filter;

import io.crnk.core.engine.dispatcher.Response;

/**
 * Empty {@link DocumentFilter} implementation useful as a starting point to write new filters.
 */
public class AbstractDocumentFilter implements DocumentFilter {

	@Override
	public Response filter(DocumentFilterContext context, DocumentFilterChain chain) {
		return chain.doFilter(context);
	}
}
