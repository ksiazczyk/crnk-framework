// ---docerion
// type: test
// title: SlowTask
// summary: A JSON:API resource model representing a slow task used by the slow resource repository test.
// ---

package io.crnk.reactive.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "slow/task")
public class SlowTask {

	@JsonApiId
	private Long id;

	private String name;


	public Long getId() {
		return id;
	}

	public SlowTask setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
