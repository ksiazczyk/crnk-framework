// ---docerion
// type: source
// title: TSArrayType TypeScript array type model
// summary: Class representing a TypeScript array type parameterized by its element type.
// ---

package io.crnk.gen.typescript.model;

public class TSArrayType extends TSTypeBase {

	private TSType elementType;

	public TSArrayType(TSType elementType) {
		this.elementType = elementType;
 		setName("Array<" + elementType.getName() + ">");
	}

	public TSType getElementType() {
		return elementType;
	}

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}
}
