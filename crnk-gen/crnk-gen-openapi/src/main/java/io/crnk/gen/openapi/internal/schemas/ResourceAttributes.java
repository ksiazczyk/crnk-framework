// ---docerion
// type: source
// title: ResourceAttributes schema generator
// summary: Generates the OpenAPI schema for the attributes object of a resource, mapping non-association attributes.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.gen.openapi.internal.OASUtils;
import io.crnk.meta.model.resource.MetaResource;
import io.crnk.meta.model.resource.MetaResourceField;

import static java.util.stream.Collectors.toMap;

public class ResourceAttributes extends AbstractResourceAttributes {

	public ResourceAttributes(MetaResource metaResource) {
		super(metaResource, "attributes",
				OASUtils.notAssociationAttributes(metaResource, false)
						.collect(toMap(
								MetaResourceField::getName,
								e -> new ResourceAttribute(metaResource, e).$ref())));
	}
}
