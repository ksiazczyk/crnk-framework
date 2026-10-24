// ---docerion
// type: source
// title: PresentationLabel annotation
// summary: A Java runtime annotation that labels presentation fields with a metadata nature value.
// ---

package io.crnk.ui.presentation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PresentationLabel {

	String META_ELEMENT_NATURE = "PRESENTATION_NATURE";


}