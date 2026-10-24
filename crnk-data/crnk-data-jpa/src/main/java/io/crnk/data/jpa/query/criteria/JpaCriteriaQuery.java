// ---docerion
// type: source
// title: JpaCriteriaQuery interface
// summary: Interface representing a JPA criteria query that builds a criteria query executor.
// ---

package io.crnk.data.jpa.query.criteria;

import io.crnk.data.jpa.query.JpaQuery;

public interface JpaCriteriaQuery<T> extends JpaQuery<T> {

	@Override
	JpaCriteriaQueryExecutor<T> buildExecutor();
}
