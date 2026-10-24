// ---docerion
// type: source
// title: ResourceDuplicateIdException
// summary: Exception thrown when a resource contains more than one field annotated with JsonApiId.
// ---

package io.crnk.core.exception;

/**
 * A resource contains more then one field annotated with JsonApiId annotation.
 */
public final class ResourceDuplicateIdException extends CrnkInitializationException {

	public ResourceDuplicateIdException(String className) {
		super("Duplicated Id field found in class: " + className);
	}
}
