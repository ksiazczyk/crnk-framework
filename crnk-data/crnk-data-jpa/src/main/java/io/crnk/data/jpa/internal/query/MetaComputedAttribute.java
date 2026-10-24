// ---docerion
// type: source
// title: JpaResourceFieldInformationProvider
// summary: Derives resource field information such as sortability, filterability and type from JPA annotations on entity attributes.
// ---

package io.crnk.data.jpa.internal.query;

import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.meta.model.MetaAttribute;

@JsonApiResource(type = "metaComputedAttribute")
public class MetaComputedAttribute extends MetaAttribute {

	@Override
	public Object getValue(Object dataObject) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setValue(Object dataObject, Object value) {
		throw new UnsupportedOperationException();
	}

}
