// ---docerion
// type: source
// title: ActionStubFactory interface for creating action stubs
// summary: Interface that creates stubs for repository interfaces with action methods, used only to invoke actions rather than jsonapi methods.
// ---

package io.crnk.client.action;

/**
 * Used to create stubs for repository interface having action methods. Stub is only used
 * to invoke the action, not the jsonapi methods.
 */
public interface ActionStubFactory {

	void init(ActionStubFactoryContext context);

	<T> T createStub(Class<T> interfaceClass);
}
