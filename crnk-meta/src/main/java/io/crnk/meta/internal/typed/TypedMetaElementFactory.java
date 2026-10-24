// ---docerion
// type: source
// title: TypedMetaElementFactory
// summary: Interface defining factory methods to accept, initialize and create meta elements for a given Java type.
// ---

package io.crnk.meta.internal.typed;

import io.crnk.meta.model.MetaElement;

import java.lang.reflect.Type;

public interface TypedMetaElementFactory {

	void init(TypedMetaElementFactoryContext context);

	boolean accept(Type type);

	MetaElement create(Type type);
}



