// ---docerion
// type: source
// title: JpaCriteriaExpressionFactory interface
// summary: Interface that produces a JPA Criteria expression for a parent entity within a criteria query.
// ---

package io.crnk.data.jpa.query.criteria;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.From;

public interface JpaCriteriaExpressionFactory<T extends From<?, ?>> {

	Expression getExpression(T parent, CriteriaQuery<?> query);
}
