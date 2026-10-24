// ---docerion
// type: source
// title: ResourcesResponseSchema generator
// summary: Composes a multi-resource JSON:API response combining the success envelope and an array of resource schemas.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.Schema;

import java.util.Arrays;
import java.util.Collections;

public class ResourcesResponseSchema extends AbstractSchemaGenerator {

  public ResourcesResponseSchema(MetaResource metaResource) {
    super(metaResource);
  }

  public Schema schema() {
    return new ComposedSchema()
        .allOf(
            Arrays.asList(
                new Success().$ref(),
                new Schema()
                    .addProperties(
                        "data",
                        new ArraySchema()
                            .items(new ResourceSchema(metaResource).$ref()))
                    .required(Collections.singletonList("data"))));
  }
}
