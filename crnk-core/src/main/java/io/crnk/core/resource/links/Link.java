// ---docerion
// type: source
// title: Link interface
// summary: Interface describing a link with href, rel, anchor, params, describedby and meta, deserialized to DefaultLink.
// ---

package io.crnk.core.resource.links;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = DefaultLink.class)
public interface Link {

	String getHref();

	void setHref(String href);

	String getRel();

	void setRel(String rel);

	String getAnchor();

	void setAnchor(String anchor);

	LinkParams getParams();

	void setParams(LinkParams params);

	String getDescribedby();

	void setDescribedby(String describedby);

	LinkMeta getMeta();

	void setMeta(LinkMeta meta);
}
