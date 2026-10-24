// ---docerion
// type: source
// title: LinksContainer interface
// summary: Interface exposing an ObjectNode for links, used by list implementations that need Jackson node access.
// ---

package io.crnk.core.resource.list;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface LinksContainer {

	ObjectNode getLinks();

	void setLinks(ObjectNode meta);
}
