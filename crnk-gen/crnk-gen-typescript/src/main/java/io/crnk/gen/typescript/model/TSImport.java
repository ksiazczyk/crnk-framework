// ---docerion
// type: source
// title: TSImport model class
// summary: Represents a TypeScript import element extending the import-export base class.
// ---

package io.crnk.gen.typescript.model;

public class TSImport extends TSImportExportBase {

	@Override
	public void accept(TSVisitor visitor) {
		visitor.visit(this);
	}
}