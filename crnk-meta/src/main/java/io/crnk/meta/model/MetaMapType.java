// ---docerion
// type: source
// title: MetaMapType map type meta model
// summary: Declares the MetaMapType meta model class holding a lazily serialized key type reference.
// ---

package io.crnk.meta.model;

import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.SerializeType;

@JsonApiResource(type = "metaMapType", resourcePath = "meta/mapType")
public class MetaMapType extends MetaType {

	@JsonApiRelation(serialize = SerializeType.LAZY)
	private MetaType keyType;

	public MetaType getKeyType() {
		return keyType;
	}

	public void setKeyType(MetaType keyType) {
		this.keyType = keyType;
	}

}
