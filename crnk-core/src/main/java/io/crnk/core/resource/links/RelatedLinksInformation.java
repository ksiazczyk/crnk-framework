// ---docerion
// type: source
// title: RelatedLinksInformation interface
// summary: Interface for links information exposing a related link, with a convenience string setter.
// ---

package io.crnk.core.resource.links;

public interface RelatedLinksInformation extends LinksInformation {

	Link getRelated();

	void setRelated(Link related);

	default void setRelated(String related) {
		setRelated(new DefaultLink(related));
	}
}
