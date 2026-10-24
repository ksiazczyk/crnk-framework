// ---docerion
// type: source
// title: ResourceFieldContributorContext
// summary: An interface providing the context for a resource field contributor, exposing the resource information and the information builder.
// ---

package io.crnk.core.engine.information.contributor;

import io.crnk.core.engine.information.InformationBuilder;
import io.crnk.core.engine.information.resource.ResourceInformation;

public interface ResourceFieldContributorContext {

	ResourceInformation getResourceInformation();

	InformationBuilder getInformationBuilder();

}
