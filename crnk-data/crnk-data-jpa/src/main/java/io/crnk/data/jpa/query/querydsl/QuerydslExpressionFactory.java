// ---docerion
// type: source
// title: QuerydslExpressionFactory interface
// summary: Interface that produces a QueryDSL Expression from a parent and a JPAQuery for computed attribute handling.
// ---

package io.crnk.data.jpa.query.querydsl;

import com.querydsl.core.types.Expression;
import com.querydsl.jpa.impl.JPAQuery;

public interface QuerydslExpressionFactory<T extends Expression<?>> {

	@SuppressWarnings("rawtypes")
	Expression getExpression(T parent, JPAQuery<?> jpaQuery);
}
