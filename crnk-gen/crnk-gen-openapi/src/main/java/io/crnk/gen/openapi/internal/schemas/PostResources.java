// ---docerion
// type: source
// title: PostResources schema generator
// summary: Generates the OpenAPI schema for a POST collection of resources as an array of PostResourceData.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;

public class PostResources extends AbstractSchemaGenerator {

	public PostResources(MetaResource metaResource) {
		super(metaResource);
	}

	@Override
	public Schema schema() {
		return new ObjectSchema()
				.addRequiredItem("data")
				.addProperties("data", new ArraySchema()
						.items(new PostResourceData(metaResource).$ref()));
	}
}
