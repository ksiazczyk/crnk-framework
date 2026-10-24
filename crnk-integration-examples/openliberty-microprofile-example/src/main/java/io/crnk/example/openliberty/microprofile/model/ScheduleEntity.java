// ---docerion
// type: source
// title: ScheduleEntity JPA entity
// summary: A JPA entity class representing a schedule with an identifier and a name, using javax.persistence annotations.
// ---

package io.crnk.example.openliberty.microprofile.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScheduleEntity {

	public ScheduleEntity() {

	}

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

	public ScheduleEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
