// ---docerion
// type: test
// title: Custom paging Pojo repository
// summary: In-memory repository for CustomPagingPojo used to exercise custom paging behavior.
// ---

package io.crnk.core.mock.repository;

import io.crnk.core.mock.models.CustomPagingPojo;
import io.crnk.core.repository.InMemoryResourceRepository;

public class CustomPagingPojoRepository extends InMemoryResourceRepository<CustomPagingPojo, Long> {

    public CustomPagingPojoRepository() {
        super(CustomPagingPojo.class);
    }
}