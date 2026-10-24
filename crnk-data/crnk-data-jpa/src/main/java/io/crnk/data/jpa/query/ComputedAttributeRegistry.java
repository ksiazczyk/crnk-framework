// ---docerion
// type: source
// title: ComputedAttributeRegistry for registered computed attributes
// summary: Interface holding the computed attributes registered to a JpaQueryFactory per entity type.
// ---

package io.crnk.data.jpa.query;

import java.util.Set;

/**
 * Holds the computed attributes registered to a JpaQueryFactory.
 */
public interface ComputedAttributeRegistry {

	/**
	 * @param entityType for whom to get the computed attributes.
	 * @return list of computed attribute names for the given entity type
	 */
	Set<String> getForType(Class<?> entityType);

}
