// ---docerion
// type: source
// title: EmptyServiceDiscovery
// summary: A no-op ServiceDiscovery that returns empty lists for all instance lookups.
// ---

package io.crnk.core.module.discovery;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public class EmptyServiceDiscovery implements ServiceDiscovery {


	@Override
	public <T> List<T> getInstancesByType(Class<T> clazz) {
		return Collections.emptyList();
	}

	@Override
	public <A extends Annotation> List<Object> getInstancesByAnnotation(Class<A> annotation) {
		return Collections.emptyList();
	}
}
