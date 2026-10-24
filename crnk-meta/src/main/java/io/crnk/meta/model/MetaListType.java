// ---docerion
// type: source
// title: MetaListType meta model class
// summary: Declares the MetaListType meta model class, a list collection type exposed as a JSON:API resource.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "metaListType", resourcePath = "meta/listType")
public class MetaListType extends MetaCollectionType {

}
