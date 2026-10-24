// ---docerion
// type: source
// title: TSInterfaceType model class
// summary: Represents a TypeScript interface type extending the object type model.
// ---

package io.crnk.gen.typescript.model;

public class TSInterfaceType extends TSObjectType {

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public TSInterfaceType asInterfaceType() {
		return this;
	}
}
