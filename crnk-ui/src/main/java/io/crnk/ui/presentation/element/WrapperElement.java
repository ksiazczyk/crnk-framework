// ---docerion
// type: source
// title: WrapperElement source class
// summary: A wrapper element that holds a nested PresentationElement component.
// ---

package io.crnk.ui.presentation.element;

public class WrapperElement extends SingularValueElement {

	private PresentationElement component;

	public PresentationElement getComponent() {
		return component;
	}

	public void setComponent(PresentationElement component) {
		this.component = component;
	}
}
