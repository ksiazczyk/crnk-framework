// ---docerion
// type: source
// title: MetaDataObjectProvider
// summary: Abstract provider that creates meta data objects and their attributes for a given Java type and wires subtype relationships.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "metaArrayType", resourcePath = "meta/arrayType")
public class MetaArrayType extends MetaType {

}
