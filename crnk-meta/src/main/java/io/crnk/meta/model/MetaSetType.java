// ---docerion
// type: source
// title: MetaSetType set type meta model
// summary: Declares the MetaSetType meta model class, a set collection type exposed as a JSON:API resource.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "meta/setType")
public class MetaSetType extends MetaCollectionType {

}
