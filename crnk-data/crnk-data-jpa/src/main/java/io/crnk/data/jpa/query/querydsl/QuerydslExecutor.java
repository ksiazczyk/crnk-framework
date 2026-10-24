// ---docerion
// type: source
// title: QuerydslExecutor interface
// summary: Interface extending JpaQueryExecutor that exposes QueryDSL tuples, the underlying JPAQuery, and a setter to configure it.
// ---

package io.crnk.data.jpa.query.querydsl;

import com.querydsl.jpa.impl.JPAQuery;
import io.crnk.data.jpa.query.JpaQueryExecutor;

import java.util.List;

public interface QuerydslExecutor<T> extends JpaQueryExecutor<T> {

	@Override
	List<QuerydslTuple> getResultTuples();

	JPAQuery<T> getQuery();

	void setQuery(JPAQuery<T> query);
}
