// ---docerion
// type: test
// title: PostResourceTest schema test
// summary: JUnit test verifying that the PostResource schema is an ObjectSchema with a data property referencing the post resource data schema.
// ---

package io.crnk.gen.openapi.internal.schemas;

import io.crnk.gen.openapi.internal.MetaResourceBaseTest;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singleton;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PostResourceTest extends MetaResourceBaseTest {

	@Test
	void schema() {
		Schema requestSchema = new PostResource(metaResource).schema();

		assertNotNull(requestSchema);
		assertEquals(ObjectSchema.class, requestSchema.getClass());
		ObjectSchema topLevelSchema = (ObjectSchema) requestSchema;
		assertIterableEquals(singleton("data"), topLevelSchema.getProperties().keySet());
		Schema dataSchema = topLevelSchema.getProperties().get("data");

		assertEquals("#/components/schemas/ResourceTypePostResourceData", dataSchema.get$ref());
	}
}
