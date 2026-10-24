// ---docerion
// type: source
// title: RepositoryAnnotationNotFoundException
// summary: Exception thrown when a repository annotation for a resource cannot be found.
// ---

package io.crnk.core.exception;

public class RepositoryAnnotationNotFoundException extends InternalServerErrorException {// NOSONAR ignore deep class hierarchy

	public RepositoryAnnotationNotFoundException(String message) {
		super(message);
	}
}
