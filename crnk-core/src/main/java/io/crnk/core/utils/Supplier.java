// ---docerion
// type: source
// title: Supplier interface
// summary: A minimal interface that supplies a result value, used as a functional supplier.
// ---

package io.crnk.core.utils;

public interface Supplier<T> {

	/**
	 * Gets a result.
	 *
	 * @return a result
	 */
	T get();
}
