// ---docerion
// type: source
// title: DefaultSelfLinksInformation self link
// summary: Default implementation of SelfLinksInformation holding the self link of a resource.
// ---

package io.crnk.core.resource.links;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DefaultSelfLinksInformation implements SelfLinksInformation {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Link self;

	public Link getSelf() {
		return self;
	}

	public void setSelf(final Link self) {
		this.self = self;
	}
}
