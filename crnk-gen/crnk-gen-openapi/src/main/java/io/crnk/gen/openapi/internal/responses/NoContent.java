// ---docerion
// type: source
// title: No content response generator
// summary: Generates an OpenAPI response describing a 204 No Content result.
// ---

package io.crnk.gen.openapi.internal.responses;

import io.swagger.v3.oas.models.responses.ApiResponse;

public class NoContent extends AbstractResponseGenerator {
  public ApiResponse response() {
    return new ApiResponse()
        .description("No Content");
  }
}
