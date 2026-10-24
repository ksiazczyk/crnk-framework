// ---docerion
// type: source
// title: ResourceRegistryAware
// summary: An interface allowing repositories to obtain a ResourceRegistry instance via a setter.
// ---

package io.crnk.core.engine.registry;

/**
 * Can be used by repositories to obtain a ResourceRegistry instance.
 */
public interface ResourceRegistryAware {

	void setResourceRegistry(ResourceRegistry resourceRegistry);
}
