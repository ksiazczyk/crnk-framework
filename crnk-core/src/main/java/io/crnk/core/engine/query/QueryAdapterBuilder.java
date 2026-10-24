// ---docerion
// type: source
// title: QueryAdapterBuilder
// summary: Interface that builds query adapters from parameters, producing either a queryParams or querySpec adapter.
// ---

package io.crnk.core.engine.query;

import io.crnk.core.engine.information.resource.ResourceInformation;

import java.util.Map;
import java.util.Set;

/**
 * Builds the query adapter for the given parameters, resulting in either a queryParams or querySpec adapter depending on the chosen implementation.
 */
public interface QueryAdapterBuilder {

	QueryAdapter build(ResourceInformation resourceInformation, Map<String, Set<String>> parameters, QueryContext queryContext);

}
