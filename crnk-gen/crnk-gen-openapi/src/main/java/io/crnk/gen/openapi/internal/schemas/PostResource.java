// ---docerion
// type: source
// title: PostResource schema generator
// summary: Generates the OpenAPI schema for a JSON:API POST resource payload wrapping a PostResourceData object.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;

public class PostResource extends AbstractSchemaGenerator {

	public PostResource(MetaResource metaResource) {
		super(metaResource);
	}

	@Override
	public Schema schema() {
		return new ObjectSchema()
				.addRequiredItem("data")
				.addProperties("data", new PostResourceData(metaResource).$ref());
	}
}
