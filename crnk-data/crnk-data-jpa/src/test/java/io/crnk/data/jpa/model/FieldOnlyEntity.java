// ---docerion
// type: test
// title: FieldOnlyEntity test entity
// summary: A JPA test entity exposing attributes through public fields annotated with JPA annotations.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FieldOnlyEntity {

	public static final String ATTR_id = "id";

	public static final String ATTR_longValue = "longValue";

	@Id
	public Long id;

	@Column
	public long longValue;
}