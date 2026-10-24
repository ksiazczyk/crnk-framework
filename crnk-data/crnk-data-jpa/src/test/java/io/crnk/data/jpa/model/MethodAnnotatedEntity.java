// ---docerion
// type: test
// title: Method-annotated JPA test entity
// summary: A JPA test entity that maps its ID and column attributes using method-level annotations.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MethodAnnotatedEntity {

	public static final String ATTR_id = "id";

	public static final String ATTR_stringValue = "stringValue";

	private Long _id;

	private String _stringValue;

	public MethodAnnotatedEntity() {

	}

	@Id
	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getStringValue() {
		return _stringValue;
	}

	@Column
	public void setStringValue(String stringValue) {
		this._stringValue = stringValue;
	}
}
