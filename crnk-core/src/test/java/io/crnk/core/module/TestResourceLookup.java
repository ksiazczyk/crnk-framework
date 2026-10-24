// ---docerion
// type: test
// title: TestResourceLookup
// summary: Resource lookup returning the TestResource class for module discovery.
// ---

package io.crnk.core.module;

import io.crnk.core.module.discovery.ResourceLookup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class TestResourceLookup implements ResourceLookup {

	@Override
	public Set<Class<?>> getResourceClasses() {
		return new HashSet<Class<?>>(Arrays.asList(TestResource.class));
	}
}