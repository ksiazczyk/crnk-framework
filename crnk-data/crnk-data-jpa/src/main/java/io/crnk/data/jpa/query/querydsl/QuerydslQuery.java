// ---docerion
// type: source
// title: QuerydslQuery interface
// summary: Interface extending JpaQuery that returns a QuerydslExecutor from its buildExecutor method.
// ---

package io.crnk.data.jpa.query.querydsl;

import io.crnk.data.jpa.query.JpaQuery;

public interface QuerydslQuery<T> extends JpaQuery<T> {

	@Override
	QuerydslExecutor<T> buildExecutor();
}
