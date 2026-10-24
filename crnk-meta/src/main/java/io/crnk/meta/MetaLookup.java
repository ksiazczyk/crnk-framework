// ---docerion
// type: source
// title: MetaLookup interface
// summary: Java interface declaring methods to look up meta elements by type, id, or implementation class.
// ---

package io.crnk.meta;

import io.crnk.meta.model.MetaElement;

import java.util.List;

public interface MetaLookup {
    <T extends MetaElement> T findElement(Class<T> metaType, String id);

    <T extends MetaElement> List<T> findElements(Class<T> metaType);

    <T extends MetaElement> T findElement(Class<T> metaType, Class<?> implementationClass);
}
