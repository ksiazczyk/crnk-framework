// ---docerion
// type: test
// title: NoContentTest for the No Content response
// summary: Tests that the NoContent response returns a 'No Content' description with no content.
// ---

package io.crnk.gen.openapi.internal.responses;

import io.swagger.v3.oas.models.responses.ApiResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NoContentTest {

  @Test
  void response() {
    ApiResponse apiResponse = new NoContent().response();
    Assert.assertEquals("No Content", apiResponse.getDescription());
    Assert.assertNull(apiResponse.getContent());
  }
}