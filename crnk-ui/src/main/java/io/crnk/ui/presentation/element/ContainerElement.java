// ---docerion
// type: source
// title: ContainerElement
// summary: Interface defining a container element that exposes a list of child presentation elements.
// ---

package io.crnk.ui.presentation.element;

import java.util.List;

public interface ContainerElement {

    List<PresentationElement> getChildren();

}
