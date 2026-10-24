// ---docerion
// type: test
// title: ThingRepository mock in-memory resource repository
// summary: A mock in-memory repository for Thing resources.
// ---

package io.crnk.core.mock.repository;

import io.crnk.core.mock.models.Thing;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ThingRepository extends InMemoryResourceRepository<Thing, Long> {

    public ThingRepository() {
        super(Thing.class);
    }
}