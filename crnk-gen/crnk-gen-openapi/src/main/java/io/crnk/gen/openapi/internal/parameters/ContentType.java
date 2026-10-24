// ---docerion
// type: source
// title: Content-Type header parameter generator
// summary: Generates the Content-Type header parameter with the CRnk JSON API media type enum.
// ---

package io.crnk.gen.openapi.internal.parameters;

import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;

import java.util.Arrays;

public class ContentType extends AbstractParameterGenerator {

  public Parameter parameter() {
    return new Parameter()
        .name("Content-Type")
        .in("header")
        .schema(
            new StringSchema()
                ._default("application/vnd.api+json")
                ._enum(Arrays.asList("application/vnd.api+json", "application/json")))
        .required(true);
  }
}
