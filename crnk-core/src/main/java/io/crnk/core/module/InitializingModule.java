// ---docerion
// type: source
// title: InitializingModule interface
// summary: Interface that modules implement to receive a callback once Crnk is fully initialized and can access the resource registry.
// ---

package io.crnk.core.module;

public interface InitializingModule extends Module {

	/**
	 * Called once Crnk is fully initialized. From this point in time, the module is, for example,
	 * allowed to access the resource registry.
	 */
	void init();

}
