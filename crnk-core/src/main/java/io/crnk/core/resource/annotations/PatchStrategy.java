// ---docerion
// type: source
// title: PatchStrategy enum
// summary: A Java enum defining patch strategies that decide whether content is merged or overridden during updates.
// ---

package io.crnk.core.resource.annotations;

public enum PatchStrategy {

	/**
	 * Defines that content is merged, if not
	 * set, this value will fall back to {@link PatchStrategy#MERGE} by default.
	 */
	DEFAULT,
	/**
	 * Defines that content is merged.
	 */
	MERGE,
	/**
	 * Defines that content is overriden.
	 */
	SET
}
