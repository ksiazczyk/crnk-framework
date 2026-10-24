// ---docerion
// type: source
// title: ResourceIdNotFoundException
// summary: A resource exception thrown when a class does not contain a field annotated with JsonApiId.
// ---

package io.crnk.core.exception;

/**
 * A resource does not contain field annotated with JsonApiId annotation.
 */
public final class ResourceIdNotFoundException extends CrnkInitializationException {

	public ResourceIdNotFoundException(String className) {
		super("Id field not found in class: " + className);
	}
}
