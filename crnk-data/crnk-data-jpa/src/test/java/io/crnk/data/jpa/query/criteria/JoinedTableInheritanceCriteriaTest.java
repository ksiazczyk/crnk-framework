// ---docerion
// type: test
// title: JoinedTableInheritanceCriteriaTest for joined-table inheritance
// summary: Tests JPA criteria queries against entities mapped with joined-table inheritance.
// ---

package io.crnk.data.jpa.query.criteria;

import io.crnk.data.jpa.query.JoinedTableInheritanceQueryTestBase;
import io.crnk.data.jpa.query.JpaQueryFactory;

import javax.persistence.EntityManager;

public class JoinedTableInheritanceCriteriaTest extends JoinedTableInheritanceQueryTestBase {

	@Override
	protected JpaQueryFactory createQueryFactory(EntityManager em) {
		return JpaCriteriaQueryFactory.newInstance();
	}

}
