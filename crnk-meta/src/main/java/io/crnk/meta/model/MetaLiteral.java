// ---docerion
// type: source
// title: MetaLiteral enum literal meta model
// summary: Declares the MetaLiteral meta model class representing an enum literal as a JSON:API resource.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "metaEnumLiteral", resourcePath = "meta/enumLiteral")
public class MetaLiteral extends MetaElement {

}
