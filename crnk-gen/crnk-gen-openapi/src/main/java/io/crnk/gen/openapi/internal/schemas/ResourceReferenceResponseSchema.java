// ---docerion
// type: source
// title: ResourceReferenceResponseSchema generator
// summary: Wraps a single resource reference inside a JSON:API response data property.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;

public class ResourceReferenceResponseSchema extends AbstractSchemaGenerator {

  public ResourceReferenceResponseSchema(MetaResource metaResource) {
    super(metaResource);
  }

  public Schema schema() {
    return new ObjectSchema()
        .addProperties(
            "data",
            new ResourceReference(metaResource).$ref());
  }
}
