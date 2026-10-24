// ---docerion
// type: test
// title: BasicQuerydslTest wires the Querydsl query factory
// summary: Test that wires the Querydsl query factory into the basic query test base to exercise default JPA query behavior.
// ---

package io.crnk.data.jpa.query.querydsl;

import io.crnk.data.jpa.query.BasicQueryTestBase;
import io.crnk.data.jpa.query.JpaQueryFactory;

import javax.persistence.EntityManager;

public class BasicQuerydslTest extends BasicQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return QuerydslQueryFactory.newInstance();
	}
}
