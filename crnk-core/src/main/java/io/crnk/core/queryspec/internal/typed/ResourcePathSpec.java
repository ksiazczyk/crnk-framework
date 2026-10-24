// ---docerion
// type: source
// title: ResourcePathSpec abstract resource path spec
// summary: Abstract base class for typed resource path specs extending PathSpecBase.
// ---

package io.crnk.core.queryspec.internal.typed;

import io.crnk.core.queryspec.AbstractPathSpec;
import io.crnk.core.queryspec.PathSpec;

public abstract class ResourcePathSpec extends PathSpecBase {

    protected ResourcePathSpec(PathSpec pathSpec) {
        super(pathSpec);
    }

    protected ResourcePathSpec(AbstractPathSpec boundSpec) {
        super(boundSpec);
    }
}
