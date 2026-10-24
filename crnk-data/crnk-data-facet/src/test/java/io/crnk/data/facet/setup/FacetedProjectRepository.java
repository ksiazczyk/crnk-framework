// ---docerion
// type: test
// title: FacetedProjectRepository
// summary: In-memory repository backing the FacetedProject resource in the test setup.
// ---

package io.crnk.data.facet.setup;

import io.crnk.core.repository.InMemoryResourceRepository;

public class FacetedProjectRepository extends InMemoryResourceRepository<FacetedProject, Long> {

	public FacetedProjectRepository() {
		super(FacetedProject.class);
	}
}
