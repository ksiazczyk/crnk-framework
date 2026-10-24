// ---docerion
// type: source
// title: TSParameterizedType class
// summary: Class modeling a parameterized TypeScript type with a base type and type arguments.
// ---

package io.crnk.gen.typescript.model;

import java.util.Arrays;
import java.util.List;

public class TSParameterizedType extends TSTypeBase {

	private TSType baseType;

	private List<TSType> parameters;

	public TSParameterizedType(TSType baseType, TSType... parameters) {
		this.baseType = baseType;
		this.parameters = Arrays.asList(parameters);
	}

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}

	public TSType getBaseType() {
		return baseType;
	}

	public List<TSType> getParameters() {
		return parameters;
	}
}
