// ---docerion
// type: source
// title: MetaJsonObject resource class
// summary: A JSON:API meta resource class representing a JSON object, extending MetaDataObject.
// ---

package io.crnk.meta.model.resource;

import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.meta.model.MetaDataObject;

@JsonApiResource(type = "metaJsonObject", resourcePath = "meta/jsonObject")
public class MetaJsonObject extends MetaDataObject {

}
