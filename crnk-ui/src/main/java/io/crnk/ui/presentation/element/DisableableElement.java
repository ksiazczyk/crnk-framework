// ---docerion
// type: source
// title: DisableableElement
// summary: Adds a disabled state to a presentation element.
// ---

package io.crnk.ui.presentation.element;


public class DisableableElement extends PresentationElement {

    private boolean disabled;

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
