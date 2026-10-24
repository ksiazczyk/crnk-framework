// ---docerion
// type: source
// title: CyclicResourceCRepository
// summary: A repository implementation for CyclicResourceC that extends ResourceRepositoryBase and returns an empty list for findAll queries.
// ---

package io.crnk.client.inheritance.repositories.cyclic;

import java.util.Collections;

import io.crnk.client.inheritance.resources.cyclic.CyclicResourceC;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

/*
 * @author syri.
 */
public class CyclicResourceCRepository extends ResourceRepositoryBase<CyclicResourceC, Long> {

	public CyclicResourceCRepository() {
		super(CyclicResourceC.class);
	}

	@Override
	public ResourceList<CyclicResourceC> findAll(QuerySpec querySpec) {
		return querySpec.apply(Collections.emptyList());
	}
}
