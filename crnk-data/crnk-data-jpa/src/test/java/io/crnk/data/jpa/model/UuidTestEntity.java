// ---docerion
// type: test
// title: UuidTestEntity
// summary: Entity using a UUID as its primary key for identifier type testing.
// ---

package io.crnk.data.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class UuidTestEntity {

	@Id
	private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
