// ---docerion
// type: source
// title: MetaEmbeddableAttribute meta attribute
// summary: Meta attribute describing an attribute of a JPA embeddable type.
// ---

package io.crnk.data.jpa.meta;

import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.meta.model.MetaAttribute;

@JsonApiResource(type = "meta/embeddableAttribute")
public class MetaEmbeddableAttribute extends MetaAttribute {
}