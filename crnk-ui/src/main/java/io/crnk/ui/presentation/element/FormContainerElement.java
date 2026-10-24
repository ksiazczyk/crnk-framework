// ---docerion
// type: source
// title: FormContainerElement
// summary: A container element that groups form elements and exposes their children and an optional maximum width.
// ---

package io.crnk.ui.presentation.element;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class FormContainerElement extends PresentationElement implements ContainerElement {

    private FormElements elements = new FormElements();

    private String maxWidth;

	@Override
	@JsonIgnore
	public List<PresentationElement> getChildren() {
		return new ArrayList<>(elements.getElements().values());
	}

    public FormElements getElements() {
        return elements;
    }

    public void setElements(FormElements elements) {
        this.elements = elements;
    }

    public String getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }
}
