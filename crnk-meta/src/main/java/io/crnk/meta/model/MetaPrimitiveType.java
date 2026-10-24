// ---docerion
// type: source
// title: MetaPrimitiveType primitive type meta model
// summary: Declares the MetaPrimitiveType meta model class with constants for base primitive type identifiers.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "metaPrimitiveType", resourcePath = "meta/primitiveType")
public class MetaPrimitiveType extends MetaType {

	public static final String ID_STRING = "base.string";

	public static final String ID_INT = "base.integer";

	public static final String ID_BYTE = "base.byte";

	public static final String ID_SHORT = "base.short";

	public static final String ID_LONG = "base.long";
}
