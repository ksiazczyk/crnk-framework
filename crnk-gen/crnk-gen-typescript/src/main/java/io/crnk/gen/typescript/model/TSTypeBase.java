// ---docerion
// type: source
// title: TSTypeBase class
// summary: Abstract base class for TypeScript types providing name handling and type conversions.
// ---

package io.crnk.gen.typescript.model;

public abstract class TSTypeBase extends TSElementBase implements TSType {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public TSType asType() {
		return this;
	}

	@Override
	public TSInterfaceType asInterfaceType() {
		throw new UnsupportedOperationException("not an interface");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + "]";
	}
}
