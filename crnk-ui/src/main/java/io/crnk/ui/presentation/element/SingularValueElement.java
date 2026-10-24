// ---docerion
// type: source
// title: SingularValueElement source class
// summary: A presentation element holding a single value with a PathSpec attribute path and its accessors.
// ---

package io.crnk.ui.presentation.element;

import io.crnk.core.queryspec.PathSpec;

public class SingularValueElement extends PresentationElement {

    private PathSpec attributePath;

    public PathSpec getAttributePath() {
        return attributePath;
    }

    public void setAttributePath(PathSpec attributePath) {
        this.attributePath = attributePath;
    }
}
