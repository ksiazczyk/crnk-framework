// ---docerion
// type: source
// title: MatchedRelationshipRepository interface
// summary: Interface exposing the relationship matcher used by relationship repositories.
// ---

package io.crnk.core.repository;

public interface MatchedRelationshipRepository extends Repository {

    RelationshipMatcher getMatcher();
}
