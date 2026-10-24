// ---docerion
// type: source
// title: Repository information interface
// summary: Interface holding information about the type of a repository, exposing its method access.
// ---

package io.crnk.core.engine.information.repository;

/**
 * Holds information about the type of a repository.
 */
public interface RepositoryInformation {


	RepositoryMethodAccess getAccess();
}
