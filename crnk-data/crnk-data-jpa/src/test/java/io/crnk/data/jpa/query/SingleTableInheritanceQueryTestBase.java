// ---docerion
// type: test
// title: Single table inheritance query test base
// summary: Abstract base class testing single table inheritance queries.
// ---

package io.crnk.data.jpa.query;

import io.crnk.data.jpa.model.SingleTableBaseEntity;
import io.crnk.data.jpa.model.SingleTableChildEntity;

public abstract class SingleTableInheritanceQueryTestBase
		extends AbstractInheritanceTest<SingleTableBaseEntity, SingleTableChildEntity> {

	public SingleTableInheritanceQueryTestBase() {
		super(SingleTableBaseEntity.class, SingleTableChildEntity.class);
	}

}
