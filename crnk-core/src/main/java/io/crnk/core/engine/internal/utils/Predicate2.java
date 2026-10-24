// ---docerion
// type: source
// title: ResourceRegistryImpl
// summary: Implements the resource registry by tracking resource definitions, caching base types and notifying listeners of changes.
// ---

package io.crnk.core.engine.internal.utils;

public interface Predicate2<T, U> {
	boolean test(T t, U u);
}
