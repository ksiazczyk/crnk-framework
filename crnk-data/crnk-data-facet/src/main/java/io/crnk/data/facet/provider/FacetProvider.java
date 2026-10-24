// ---docerion
// type: source
// title: FacetProvider interface for computing facet values
// summary: Defines the contract for providers that compute facet values from resources, including initialization and entry acceptance.
// ---

package io.crnk.data.facet.provider;

import io.crnk.core.engine.registry.RegistryEntry;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.data.facet.FacetValue;
import io.crnk.data.facet.config.FacetInformation;

import java.util.List;

public interface FacetProvider {

	List<FacetValue> findValues(FacetInformation facetInformation, QuerySpec querySpec);

	void init(FacetProviderContext providerContext);

	boolean accepts(RegistryEntry entry);
}
