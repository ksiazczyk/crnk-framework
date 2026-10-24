// ---docerion
// type: source
// title: AbstractResource base class for mock resources
// summary: Abstract base class delegating identity and JSON API ID to a wrapped Identifiable delegate for mock resources.
// ---

package io.crnk.core.mock.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.crnk.core.resource.annotations.JsonApiId;

public abstract class AbstractResource<T extends Identifiable<String>> {

	protected T delegate;

	public AbstractResource(T delegate) {
		this.delegate = delegate;
	}

	@JsonIgnore
	public T getDelegate() {
		return delegate;
	}

	@JsonApiId
	public String getId() {
		return delegate.getId();
	}
}