// ---docerion
// type: source
// title: FormElement
// summary: A wrapper element representing a form with a label and an editable flag.
// ---

package io.crnk.ui.presentation.element;


public class FormElement extends WrapperElement {

	private String label;

	private boolean editable;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
