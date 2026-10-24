// ---docerion
// type: source
// title: TSIndexSignatureType model class
// summary: Models a TypeScript index signature type with a key type and a value type.
// ---

package io.crnk.gen.typescript.model;

public class TSIndexSignatureType extends TSTypeBase {

	private TSType keyType;

	private TSType valueType;

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}

	public TSType getKeyType() {
		return keyType;
	}

	public void setKeyType(TSType keyType) {
		this.keyType = keyType;
	}

	public TSType getValueType() {
		return valueType;
	}

	public void setValueType(TSType valueType) {
		this.valueType = valueType;
	}
}
