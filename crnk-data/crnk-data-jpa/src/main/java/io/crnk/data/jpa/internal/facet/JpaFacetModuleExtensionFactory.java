// ---docerion
// type: source
// title: JpaFacetModuleExtensionFactory
// summary: Abstract factory that builds a FacetModuleExtension and registers the JpaFacetProvider for JPA-based data facets.
// ---

package io.crnk.data.jpa.internal.facet;


import io.crnk.data.facet.FacetModuleExtension;

public abstract class JpaFacetModuleExtensionFactory {

	public static FacetModuleExtension create() {
		FacetModuleExtension ext = new FacetModuleExtension();
		ext.addProvider(new JpaFacetProvider());
		return ext;
	}
}
