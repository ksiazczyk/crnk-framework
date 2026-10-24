// ---docerion
// type: test
// title: SingleTableInheritanceQuerydslTest for single table inheritance
// summary: Test that exercises single table inheritance queries through the Querydsl query factory.
// ---

package io.crnk.data.jpa.query.querydsl;

import io.crnk.data.jpa.query.JpaQueryFactory;
import io.crnk.data.jpa.query.SingleTableInheritanceQueryTestBase;

import javax.persistence.EntityManager;

public class SingleTableInheritanceQuerydslTest extends SingleTableInheritanceQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return QuerydslQueryFactory.newInstance();
	}
}
