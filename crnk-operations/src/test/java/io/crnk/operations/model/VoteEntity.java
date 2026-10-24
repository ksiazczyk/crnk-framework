// ---docerion
// type: test
// title: VoteEntity JPA entity
// summary: A JPA entity representing a vote, storing a generated id and a number of stars.
// ---

package io.crnk.operations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class VoteEntity {

	@Id
	@SequenceGenerator(name = "vote_id", allocationSize = 1, sequenceName = "vote_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vote_id")
	private Long id;

	private int numStars;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumStars() {
		return numStars;
	}

	public void setNumStars(int numStars) {
		this.numStars = numStars;
	}
}
