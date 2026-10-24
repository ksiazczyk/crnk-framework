// ---docerion
// type: source
// title: FacetModuleConfig
// summary: Holds a map of facet resource information keyed by resource type, used to configure the facet module.
// ---

package io.crnk.data.facet;

import java.util.HashMap;
import java.util.Map;

import io.crnk.data.facet.config.FacetResourceInformation;

public class FacetModuleConfig {

	private Map<String, FacetResourceInformation> resources = new HashMap<>();

	public Map<String, FacetResourceInformation> getResources() {
		return resources;
	}

	public void addResource(FacetResourceInformation facetResesourceInformation) {
		resources.put(facetResesourceInformation.getResourceType(), facetResesourceInformation);
	}
}
