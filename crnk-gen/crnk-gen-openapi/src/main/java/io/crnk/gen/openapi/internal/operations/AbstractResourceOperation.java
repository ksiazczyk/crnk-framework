// ---docerion
// type: source
// title: AbstractResourceOperation
// summary: Abstract base class for resource operations extending the abstract operation with resource-scoped responses.
// ---

package io.crnk.gen.openapi.internal.operations;

import io.crnk.meta.model.resource.MetaResource;
import io.swagger.v3.oas.models.responses.ApiResponse;

import java.util.Map;


abstract class AbstractResourceOperation extends AbstractOperation  {

  protected final Map<String, ApiResponse> responses;

  protected final MetaResource metaResource;

  private final String prefix;

  AbstractResourceOperation(MetaResource metaResource) {
    this.metaResource = metaResource;
    prefix = "";
    responses = defaultResponsesMap(metaResource);
  }
}
