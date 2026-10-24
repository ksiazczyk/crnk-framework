// ---docerion
// type: test
// title: SingleTableInheritanceCriteriaTest for single-table inheritance
// summary: Tests JPA criteria queries against entities mapped with single-table inheritance.
// ---

package io.crnk.data.jpa.query.criteria;

import io.crnk.data.jpa.query.JpaQueryFactory;
import io.crnk.data.jpa.query.SingleTableInheritanceQueryTestBase;

import javax.persistence.EntityManager;

public class SingleTableInheritanceCriteriaTest extends SingleTableInheritanceQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return JpaCriteriaQueryFactory.newInstance();
	}

}
