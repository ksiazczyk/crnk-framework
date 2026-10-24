// ---docerion
// type: source
// title: FilterBehavior
// summary: Enum describing filter behavior levels and how they merge with each other.
// ---

package io.crnk.core.engine.filter;

public enum FilterBehavior {

	/**
	 * No filtering
	 */
	NONE,

	/**
	 * Silently ignores the given element
	 */
	IGNORED,

	/**
	 * Raises an exception.
	 */
	FORBIDDEN,

	/**
	 * Raises an exception for the user to authenticate.
	 */
	UNAUTHORIZED;


	/**
	 * FORBIDDEN wins over IGNORED, IGNORED wins over NONE.
	 */
	public FilterBehavior merge(FilterBehavior other) {
		return this.ordinal() > other.ordinal() ? this : other;
	}
}
