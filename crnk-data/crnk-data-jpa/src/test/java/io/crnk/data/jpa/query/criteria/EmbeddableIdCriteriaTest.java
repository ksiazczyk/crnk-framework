// ---docerion
// type: test
// title: EmbeddableIdCriteriaTest for embeddable id queries
// summary: Tests JPA criteria queries against entities using an embeddable identifier.
// ---

package io.crnk.data.jpa.query.criteria;

import io.crnk.data.jpa.query.EmbeddableIdQueryTestBase;
import io.crnk.data.jpa.query.JpaQueryFactory;

import javax.persistence.EntityManager;

public class EmbeddableIdCriteriaTest extends EmbeddableIdQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return JpaCriteriaQueryFactory.newInstance();
	}

}
