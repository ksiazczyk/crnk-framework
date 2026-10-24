// ---docerion
// type: test
// title: ManyToManyOppositeEntity test entity
// summary: The opposite side of a many-to-many relationship used in JPA relation tests.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class ManyToManyOppositeEntity {

	@Id
	private Long id;

	@ManyToMany(mappedBy = "opposites")
	private Set<ManyToManyTestEntity> tests;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<ManyToManyTestEntity> getTests() {
		return tests;
	}

	public void setTests(Set<ManyToManyTestEntity> tests) {
		this.tests = tests;
	}
}
