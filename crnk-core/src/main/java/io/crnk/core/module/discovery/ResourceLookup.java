// ---docerion
// type: source
// title: ResourceLookup
// summary: Interface exposing the set of resource classes known to a module.
// ---

package io.crnk.core.module.discovery;

import java.util.Set;

public interface ResourceLookup {

	Set<Class<?>> getResourceClasses();

}
