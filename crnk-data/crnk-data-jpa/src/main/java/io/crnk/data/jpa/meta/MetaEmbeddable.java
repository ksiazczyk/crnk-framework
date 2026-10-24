// ---docerion
// type: source
// title: MetaEmbeddable JSON API resource
// summary: JSON API resource representing the meta model of a JPA embeddable type.
// ---

package io.crnk.data.jpa.meta;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "meta/embeddable")
public class MetaEmbeddable extends MetaJpaDataObject {
}
