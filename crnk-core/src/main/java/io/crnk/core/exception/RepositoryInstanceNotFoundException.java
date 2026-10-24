// ---docerion
// type: source
// title: RepositoryInstanceNotFoundException
// summary: Exception thrown when the repository instance for a resource cannot be found.
// ---

package io.crnk.core.exception;

/**
 * Thrown when repository instance for a resource cannot be found
 */
public final class RepositoryInstanceNotFoundException extends InternalServerErrorException {// NOSONAR ignore deep class hierarchy

	public RepositoryInstanceNotFoundException(String missingRepositoryClassName) {
		super("Instance of the repository not found: " + missingRepositoryClassName);
	}
}