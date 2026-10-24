// ---docerion
// type: source
// title: TSAny TypeScript any type model
// summary: Singleton class modeling the TypeScript 'any' type within the generated model hierarchy.
// ---

package io.crnk.gen.typescript.model;

public class TSAny extends TSTypeBase {

	public static final TSAny INSTANCE = new TSAny();

	private TSAny() {
		setName("any");
	}

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}
}
