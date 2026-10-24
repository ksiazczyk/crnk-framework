// ---docerion
// type: source
// title: PresentationFullTextSearchable annotation
// summary: A Java runtime annotation that marks fields as full-text searchable in the presentation layer, exposing a metadata nature constant.
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
public @interface PresentationFullTextSearchable {

	String META_ELEMENT_NATURE = "PRESENTATION_FULL_TEXT_SEARCHABLE";
}