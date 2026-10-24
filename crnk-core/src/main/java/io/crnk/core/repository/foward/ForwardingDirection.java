// ---docerion
// type: source
// title: ForwardingDirection
// summary: Enum that selects whether relationship calls are forwarded to the owning or the opposite side resource repository.
// ---

package io.crnk.core.repository.foward;

public enum ForwardingDirection {

	/**
	 * Forwards calls to resource repository of resource owning the relationship.
	 */
	OWNER,

	/**
	 * Forwards calls to resource repository of opposite side.
	 */
	OPPOSITE
}
