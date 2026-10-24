// ---docerion
// type: source
// title: Ordered operation wrapper
// summary: Wraps an operation with an ordinal index and an optional JSON path used during ordering.
// ---

package io.crnk.operations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}

}
