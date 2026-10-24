// ---docerion
// type: test
// title: Embeddable id query test base
// summary: Abstract base class testing queries against embeddable id entities.
// ---

package io.crnk.data.jpa.query;

import io.crnk.data.jpa.model.TestEmbeddedIdEntity;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@Transactional
public abstract class EmbeddableIdQueryTestBase extends AbstractJpaTest {

	private JpaQuery<TestEmbeddedIdEntity> builder() {
		return queryFactory.query(TestEmbeddedIdEntity.class);
	}

	@Test
	public void testAll() {
		assertEquals(5, builder().buildExecutor().getResultList().size());
	}

}
