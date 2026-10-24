// ---docerion
// type: source
// title: BasicFacetInformation
// summary: BasicFacetInformation extends FacetInformation to associate a facet with a query PathSpec.
// ---

package io.crnk.data.facet.config;

import io.crnk.core.queryspec.PathSpec;

public class BasicFacetInformation extends FacetInformation {

	private PathSpec path;

	public PathSpec getPath() {
		return path;
	}

	public void setPath(PathSpec path) {
		this.path = path;
	}
}
