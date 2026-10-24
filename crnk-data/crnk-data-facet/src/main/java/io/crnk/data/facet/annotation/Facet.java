// ---docerion
// type: source
// title: Facet annotation
// summary: Java annotation interface that marks fields with facet metadata, retained at runtime and applicable to fields.
// ---

package io.crnk.data.facet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Facet {
}
