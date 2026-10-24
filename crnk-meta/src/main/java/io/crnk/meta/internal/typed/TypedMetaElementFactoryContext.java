// ---docerion
// type: source
// title: TypedMetaElementFactoryContext
// summary: Interface providing context for allocating meta elements and accessing the module context.
// ---

package io.crnk.meta.internal.typed;

import io.crnk.core.module.Module;
import io.crnk.meta.model.MetaElement;

import java.lang.reflect.Type;

public interface TypedMetaElementFactoryContext {


	MetaElement allocate(Type type);

	Module.ModuleContext getModuleContext();

}
