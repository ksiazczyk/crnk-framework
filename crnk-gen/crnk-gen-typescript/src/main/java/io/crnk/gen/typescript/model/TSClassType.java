// ---docerion
// type: source
// title: TSClassType TypeScript class type model
// summary: Class modeling a TypeScript class type with a super type and interface implementation checks.
// ---

package io.crnk.gen.typescript.model;

public class TSClassType extends TSObjectType {

	private TSType superType;

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}

	public TSType getSuperType() {
		return superType;
	}

	public void setSuperType(TSType superType) {
		this.superType = superType;
	}

	public boolean implementsInterface(TSInterfaceType interfaceType) {
		return super.implementsInterface(interfaceType) || superType instanceof TSObjectType &&
				((TSObjectType) superType).implementsInterface(interfaceType);
	}
}
