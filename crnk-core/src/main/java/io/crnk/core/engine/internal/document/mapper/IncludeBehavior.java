// ---docerion
// type: source
// title: PathBuilder for parsing URL paths
// summary: Builder responsible for parsing URL paths into a doubly-linked list of path objects using the resource registry and type parser.
// ---

package io.crnk.core.engine.internal.document.mapper;

import io.crnk.core.boot.CrnkProperties;

/**
 * See {@link CrnkProperties#INCLUDE_BEHAVIOR} for more information.
 */
public enum IncludeBehavior {
	PER_TYPE, PER_ROOT_PATH
}
