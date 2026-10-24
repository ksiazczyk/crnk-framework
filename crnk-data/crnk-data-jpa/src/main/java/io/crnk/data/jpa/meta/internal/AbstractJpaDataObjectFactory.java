// ---docerion
// type: source
// title: MetaEmbeddable
// summary: Meta model element representing a JPA embeddable type, exposed as a JSON API resource of type meta/embeddable.
// ---

package io.crnk.data.jpa.meta.internal;

import io.crnk.core.engine.information.bean.BeanAttributeInformation;
import io.crnk.data.jpa.meta.MetaJpaDataObject;
import io.crnk.meta.internal.typed.MetaDataObjectProviderBase;

import javax.persistence.Transient;

public abstract class AbstractJpaDataObjectFactory<T extends MetaJpaDataObject> extends MetaDataObjectProviderBase<T> {

	@Override
	protected boolean isIgnored(BeanAttributeInformation information) {
		return super.isIgnored(information) || information.getAnnotation(Transient.class).isPresent();
	}
}
