// ---docerion
// type: source
// title: Relationship repository information interface
// summary: Interface holding information about the type of a relationship repository, exposing a relationship matcher.
// ---

package io.crnk.core.engine.information.repository;

import io.crnk.core.repository.RelationshipMatcher;

/**
 * Holds information about the type of a relationship repository.
 */
public interface RelationshipRepositoryInformation extends RepositoryInformation {

	RelationshipMatcher getMatcher();

}
