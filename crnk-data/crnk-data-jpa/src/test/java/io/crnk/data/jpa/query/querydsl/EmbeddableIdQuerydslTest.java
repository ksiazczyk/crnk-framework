// ---docerion
// type: test
// title: EmbeddableIdQuerydslTest uses the Querydsl factory
// summary: Test that uses the Querydsl query factory for embeddable id query scenarios.
// ---

package io.crnk.data.jpa.query.querydsl;

import io.crnk.data.jpa.query.EmbeddableIdQueryTestBase;
import io.crnk.data.jpa.query.JpaQueryFactory;

import javax.persistence.EntityManager;

public class EmbeddableIdQuerydslTest extends EmbeddableIdQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return QuerydslQueryFactory.newInstance();
	}

}
