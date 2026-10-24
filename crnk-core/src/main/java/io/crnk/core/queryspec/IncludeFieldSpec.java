// ---docerion
// type: source
// title: IncludeFieldSpec
// summary: Represents a path of fields to include in a query response.
// ---

package io.crnk.core.queryspec;

import java.util.List;

public class IncludeFieldSpec extends IncludeSpec {

	private static final long serialVersionUID = -1343366742266390343L;

	public IncludeFieldSpec(List<String> path) {
		this(PathSpec.of(path));
	}

	public IncludeFieldSpec(PathSpec path) {
		super(path);
	}

	public IncludeFieldSpec clone() {
		return new IncludeFieldSpec(path.clone());
	}
}
