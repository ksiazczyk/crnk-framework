// ---docerion
// type: test
// title: BulkSimpleTaskRespository
// summary: Interface declaring a bulk repository for SimpleTask resources, used as a test fixture in OpenAPI generation tests.
// ---

package io.crnk.gen.openapi.mock;

import io.crnk.core.repository.BulkResourceRepository;

interface BulkSimpleTaskRespository extends BulkResourceRepository<SimpleTask, Long> {
}
