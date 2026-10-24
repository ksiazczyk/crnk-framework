// ---docerion
// type: source
// title: InMemoryResourceRepository
// summary: In-memory repository implementation backed by a ConcurrentHashMap, suited for testing and mocking.
// ---

package io.crnk.core.repository;

import io.crnk.core.engine.information.resource.ResourceField;

import java.util.ArrayList;
import java.util.List;

/**
 * specifies to which relationships a relationship repository should be applied to.
 */
public class RelationshipMatcher {

	protected List<RelationshipMatcherRule> rules = new ArrayList<>();

	public RelationshipMatcherRule rule() {
		return new RelationshipMatcherRule(this);
	}

	public boolean matches(ResourceField field) {
		return rules.stream().filter(it -> it.matches(field)).findAny().isPresent();
	}
}
