// ---docerion
// type: source
// title: FacetModuleConfigurer
// summary: Interface that lets customizers adjust the crnk FacetModuleConfig bean during auto-configuration.
// ---

package io.crnk.spring.setup.boot.data.facet;

import io.crnk.data.facet.FacetModuleConfig;

public interface FacetModuleConfigurer {

	void configure(FacetModuleConfig config);
}
