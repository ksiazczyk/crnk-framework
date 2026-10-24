// ---docerion
// type: test
// title: QuerydslUtilsTest
// summary: JUnit test covering QuerydslUtils, verifying the private constructor and exception handling for invalid entity paths and query classes.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Embeddable;

@Embeddable
public class AnnotationEmbeddable {

	private String embeddedValue;

	public String getEmbeddedValue() {
		return embeddedValue;
	}

	public void setEmbeddedValue(String embeddedValue) {
		this.embeddedValue = embeddedValue;
	}
}
