// ---docerion
// type: source
// title: UntypedResourceRepository
// summary: A Java interface for a resource repository that operates without a specific type, extending ResourceRepository and exposing the resource type.
// ---

package io.crnk.core.repository;

import java.io.Serializable;

public interface UntypedResourceRepository<T, I > extends ResourceRepository<T, I> {

	String getResourceType();

}