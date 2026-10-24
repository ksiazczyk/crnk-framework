// ---docerion
// type: source
// title: TSType interface
// summary: Interface for TypeScript types that can be converted to an interface type.
// ---

package io.crnk.gen.typescript.model;

public interface TSType extends TSNamedElement {

	TSInterfaceType asInterfaceType();
}
