// ---docerion
// type: source
// title: MetaContainer interface
// summary: Interface for objects that expose and accept meta information as a Jackson ObjectNode.
// ---

package io.crnk.core.resource.meta;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface MetaContainer {

	ObjectNode getMeta();

	void setMeta(ObjectNode meta);
}
