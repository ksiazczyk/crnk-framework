// ---docerion
// type: source
// title: TSEnumLiteral enum literal model
// summary: Class holding a single enum literal value in the TypeScript model.
// ---

package io.crnk.gen.typescript.model;

public class TSEnumLiteral {

	private String value;

	public TSEnumLiteral(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
