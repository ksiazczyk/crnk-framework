// ---docerion
// type: source
// title: MetaEntity JSON API resource
// summary: JSON API resource representing the meta model of a JPA entity type.
// ---

package io.crnk.data.jpa.meta;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "meta/entity")
public class MetaEntity extends MetaJpaDataObject {

}