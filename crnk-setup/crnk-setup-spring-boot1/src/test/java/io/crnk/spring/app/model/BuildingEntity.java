// ---docerion
// type: source
// title: BuildingEntity JPA model
// summary: A JPA entity class defining a Building model with an id and name field for use in the Crnk Spring Boot test application.
// ---

package io.crnk.spring.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BuildingEntity {

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
