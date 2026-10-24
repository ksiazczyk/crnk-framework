// ---docerion
// type: source
// title: TSExportedElement interface
// summary: Interface that marks TypeScript model elements as exported, exposing an isExported() check.
// ---

package io.crnk.gen.typescript.model;

public interface TSExportedElement extends TSElement {

	boolean isExported();

}
