// ---docerion
// type: source
// title: TypeSchema OpenAPI schema generator
// summary: Generates the OpenAPI schema for the JSON:API resource type field, producing a string schema with the resource type as an enum value.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;

public class TypeSchema extends AbstractSchemaGenerator {

  TypeSchema(MetaResource metaResource) {
    super(metaResource);
  }

  public Schema schema() {
    Schema typeSchema = new StringSchema()
        .description("The JSON:API resource type (" + metaResource.getResourceType() + ")");
    typeSchema.addEnumItemObject(metaResource.getResourceType());
    return typeSchema;
  }
}
