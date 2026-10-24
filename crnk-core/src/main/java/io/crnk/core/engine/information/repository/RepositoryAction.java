// ---docerion
// type: source
// title: Repository action interface
// summary: Interface describing a repository or resource action, including its name and whether it applies to a repository or resource.
// ---

package io.crnk.core.engine.information.repository;

public interface RepositoryAction {

	String getName();

	/**
	 * @return whether a resource or repository action
	 */
	RepositoryActionType getActionType();

	enum RepositoryActionType {
		REPOSITORY,
		RESOURCE
	}
}
