// ---docerion
// type: test
// title: WriteOnlyAttributeTestEntity JPA test model
// summary: A JPA entity exposing a write-only attribute, used as a test model for the CRNK JPA module.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WriteOnlyAttributeTestEntity {

	@Id
	private Long id;

	@Column
	private Long writeOnlyValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setWriteOnlyValue(Long writeOnlyValue) {
		this.writeOnlyValue = writeOnlyValue;
	}
}
