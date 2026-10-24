// ---docerion
// type: source
// title: TSContainerElement container element interface
// summary: Interface defining container elements that hold a list of TypeScript elements.
// ---

package io.crnk.gen.typescript.model;

import java.util.List;

public interface TSContainerElement extends TSElement {

	List<TSElement> getElements();

	void addElement(TSElement element);

	void addElement(int insertIndex, TSElement element);
}
