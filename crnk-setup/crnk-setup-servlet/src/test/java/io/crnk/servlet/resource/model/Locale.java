// ---docerion
// type: source
// title: Locale resource model
// summary: JSON:API resource model representing a language locale with a java.util.Locale field.
// ---

package io.crnk.servlet.resource.model;

import io.crnk.core.resource.annotations.JsonApiResource;


@JsonApiResource(type = "lang-locales")
public class Locale extends AbstractResource {

	private java.util.Locale locale;

	public Locale(Long id, java.util.Locale locale) {
		super(id);
		this.locale = locale;
	}

	public java.util.Locale getLocale() {
		return locale;
	}

	public void setLocale(java.util.Locale locale) {
		this.locale = locale;
	}
}
