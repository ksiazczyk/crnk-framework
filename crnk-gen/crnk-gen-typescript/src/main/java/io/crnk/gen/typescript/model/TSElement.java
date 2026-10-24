// ---docerion
// type: source
// title: TSElement element interface
// summary: Interface for TypeScript elements supporting parent linkage and visitor pattern.
// ---

package io.crnk.gen.typescript.model;

public interface TSElement {

	TSElement getParent();

	void accept(TSVisitor visitor);

	void setParent(TSElement parent);

	TSType asType();
}
