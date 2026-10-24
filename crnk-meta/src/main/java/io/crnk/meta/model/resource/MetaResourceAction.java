// ---docerion
// type: source
// title: MetaResourceAction meta resource
// summary: A JSON:API meta resource describing a resource action and whether it applies to a repository or resource.
// ---

package io.crnk.meta.model.resource;

import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.meta.model.MetaElement;

@JsonApiResource(type = "metaResourceAction", resourcePath = "meta/resourceAction")
public class MetaResourceAction extends MetaElement {

	private MetaRepositoryActionType actionType;

	public MetaRepositoryActionType getActionType() {
		return actionType;
	}

	public void setActionType(MetaRepositoryActionType actionType) {
		this.actionType = actionType;
	}

	public enum MetaRepositoryActionType {
		REPOSITORY,
		RESOURCE
	}
}
