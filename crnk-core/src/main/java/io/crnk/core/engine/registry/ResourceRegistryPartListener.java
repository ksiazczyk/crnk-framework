// ---docerion
// type: source
// title: ResourceRegistryPartListener
// summary: A listener interface that receives onChanged callbacks when a ResourceRegistryPartEvent occurs in the resource registry.
// ---

package io.crnk.core.engine.registry;

public interface ResourceRegistryPartListener {


	void onChanged(ResourceRegistryPartEvent event);
}
