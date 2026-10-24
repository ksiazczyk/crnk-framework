// ---docerion
// type: source
// title: Abstract Nested Delete Operation
// summary: Abstract class that builds the OpenAPI operation for deleting a nested resource relationship, adding the primary key parameter and default response mappings.
// ---

package io.crnk.gen.openapi.internal.operations;

import io.crnk.gen.openapi.internal.OperationType;
import io.crnk.gen.openapi.internal.parameters.PrimaryKey;
import io.crnk.meta.model.resource.MetaResource;
import io.crnk.meta.model.resource.MetaResourceField;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.responses.ApiResponse;

import java.util.Map;

abstract class AbstractNestedDeleteOperation extends AbstractNestedOperation {

  public static OperationType operationType = OperationType.DELETE;

  final Map<String, ApiResponse> responses;

  private final String prefix;

  AbstractNestedDeleteOperation(MetaResource metaResource, MetaResourceField metaResourceField, MetaResource relatedMetaResource) {
    super(metaResource, metaResourceField, relatedMetaResource);
    prefix = "";
    responses = defaultResponsesMap(relatedMetaResource);
  }

  Operation operation() {
    Operation operation = super.operation();
    operation.getParameters().add(new PrimaryKey(this.metaResource).$ref());
    return operation;
  }
}
