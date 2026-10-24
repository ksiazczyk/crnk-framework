// ---docerion
// type: source
// title: ReactiveOneRelationshipRepository interface
// summary: Interface for reactive repositories managing single-valued relationships, including finding and setting one relation.
// ---

package io.crnk.reactive.repository;

import io.crnk.core.engine.information.resource.ResourceField;
import io.crnk.core.queryspec.QuerySpec;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.Map;


public interface ReactiveOneRelationshipRepository<T, I, D, J>
		extends ReactiveRelationshipRepository<T, I, D, J> {

	Mono<Map<I, D>> findOneTargets(Collection<I> sourceIds, ResourceField field, QuerySpec querySpec);

	Mono<Void> setRelation(T source, J targetId, ResourceField field);

}
