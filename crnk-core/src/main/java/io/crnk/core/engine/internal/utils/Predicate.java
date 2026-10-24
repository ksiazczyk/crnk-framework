// ---docerion
// type: source
// title: RegistryEntryImpl
// summary: Holds information about a resource of a given type and its repositories, including relationship repositories and parent entries.
// ---

package io.crnk.core.engine.internal.utils;

public interface Predicate<T> {

	boolean test(T t);
}
