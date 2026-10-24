// ---docerion
// type: test
// title: ImmediateSlowResourceRepository
// summary: A test repository that extends the slow resource repository to exercise immediate, non-reactive repository behavior.
// ---

package io.crnk.reactive.model;

import io.crnk.reactive.repository.ImmediateRepository;

@ImmediateRepository
public class ImmediateSlowResourceRepository extends SlowResourceRepository {

}
