// ---docerion
// type: test
// title: TablePerClassInhertitanceQueryTestBase
// summary: Abstract test base class for table-per-class inheritance query tests, wiring the base and child entities into the shared inheritance test.
// ---

package io.crnk.data.jpa.query;

import io.crnk.data.jpa.model.TablePerClassBaseEntity;
import io.crnk.data.jpa.model.TablePerClassChildEntity;

public abstract class TablePerClassInhertitanceQueryTestBase extends AbstractInheritanceTest<TablePerClassBaseEntity, TablePerClassChildEntity> {

	public TablePerClassInhertitanceQueryTestBase() {
		super(TablePerClassBaseEntity.class, TablePerClassChildEntity.class);
	}

}
