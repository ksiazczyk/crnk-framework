// ---docerion
// type: config
// title: crnk-gen-base build configuration
// summary: Gradle build configuration for the crnk-gen-base module that applies the Java plugin and declares project dependencies.
// ---

package io.crnk.gen.openapi.internal.operations;

import io.crnk.gen.openapi.internal.OperationType;
import io.swagger.v3.oas.models.Operation;

public interface OASOperation {

  OperationType operationType();

  boolean isEnabled();

  Operation operation();

  String path();
}
