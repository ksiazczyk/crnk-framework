// ---docerion
// type: source
// title: QuerydslTranslationInterceptor interface
// summary: Interface for intercepting QueryDSL query translation, invoked with the query and its translation context.
// ---

package io.crnk.data.jpa.query.querydsl;

import io.crnk.data.jpa.internal.query.backend.querydsl.QuerydslQueryImpl;

public interface QuerydslTranslationInterceptor { // NOSONAR not a functional interface

	<T> void intercept(QuerydslQueryImpl<T> query, QuerydslTranslationContext<T> translationContext);

}
