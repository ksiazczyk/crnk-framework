// ---docerion
// type: test
// title: TestSubclassWithSuperclassGenerics
// summary: Entity subclass extending a generic mapped superclass with a long primary key.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestSubclassWithSuperclassGenerics extends TestMappedSuperclassWithGenerics<String> {
	@Id
	private Long id;

	public TestSubclassWithSuperclassGenerics() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
