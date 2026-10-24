// ---docerion
// type: test
// title: EntityManagerProducer test helper
// summary: Test helper exposing a persistence-context EntityManager for use in JPA test cases.
// ---

package io.crnk.data.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}

}
