// ---docerion
// type: source
// title: ScheduleEntity JPA model
// summary: A JPA entity class defining a Schedule model with an id and name field, provided as test support code in the test source tree.
// ---

package io.crnk.spring.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScheduleEntity {

	@Id
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
