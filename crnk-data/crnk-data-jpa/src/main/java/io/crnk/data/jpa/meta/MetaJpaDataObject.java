// ---docerion
// type: source
// title: MetaJpaDataObject abstract base class
// summary: Abstract base class for JPA data object meta elements exposed as a JSON API resource.
// ---

package io.crnk.data.jpa.meta;

import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.meta.model.MetaDataObject;

@JsonApiResource(type = "meta/jpaDataObject")
public abstract class MetaJpaDataObject extends MetaDataObject {

}
