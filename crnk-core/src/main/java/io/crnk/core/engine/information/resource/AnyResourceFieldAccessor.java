// ---docerion
// type: source
// title: RelationshipRepositoryInformation interface
// summary: Interface holding information about the type of a relationship repository, exposing its matcher.
// ---

package io.crnk.core.engine.information.resource;

import io.crnk.core.engine.internal.information.resource.ReflectionFieldAccessor;

import java.util.Map;

/**
 * Provides access to a field of a resource. See {@link ReflectionFieldAccessor}
 * for a default implementation.
 *
 * @author Remo
 */
public interface AnyResourceFieldAccessor {

	Map<String, Object> getValues(Object resource);

	void setValue(Object resource, String name, Object fieldValue);

}
