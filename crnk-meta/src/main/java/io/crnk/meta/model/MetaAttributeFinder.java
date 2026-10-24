// ---docerion
// type: source
// title: TypedMetaElementFactory
// summary: Interface for factories that create meta elements for a given Java type within a factory context.
// ---

package io.crnk.meta.model;

/**
 * Allows to modifier the behavior of looking up attributes. Used to add
 * "non-existing" virtual attributes to data objects.
 */
public interface MetaAttributeFinder {

	MetaAttribute getAttribute(MetaDataObject meta, String name);

}
