// ---docerion
// type: source
// title: TestEmbeddableBase embeddable superclass
// summary: Embeddable and mapped superclass providing a shared integer attribute.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@Embeddable
@MappedSuperclass
public class TestEmbeddableBase {

	@Column
	private Integer embIntValue;

	public Integer getEmbIntValue() {
		return embIntValue;
	}

	public void setEmbIntValue(Integer embIntValue) {
		this.embIntValue = embIntValue;
	}
}
