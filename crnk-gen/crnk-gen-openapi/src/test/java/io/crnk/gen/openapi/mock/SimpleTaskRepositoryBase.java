// ---docerion
// type: test
// title: SimpleTaskRepositoryBase
// summary: Abstract base class extending CRNK ResourceRepositoryBase to support the SimpleTask repository hierarchy.
// ---

package io.crnk.gen.openapi.mock;

import io.crnk.core.repository.ResourceRepositoryBase;

abstract class SimpleTaskRepositoryBase extends ResourceRepositoryBase<SimpleTask, Long> {

  public SimpleTaskRepositoryBase(Class<SimpleTask> resourceClass) {
    super(resourceClass);
  }
}
