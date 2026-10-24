// ---docerion
// type: source
// title: InMemoryResourceRepository
// summary: Simple repository implementation backed by a ConcurrentHashMap, suited for testing and mocking where a real implementation is unavailable.
// ---

package io.crnk.core.repository.foward.strategy;

import java.io.Serializable;

public interface ForwardingStrategy<T, I , D, J > {

	void init(ForwardingStrategyContext context);

}
