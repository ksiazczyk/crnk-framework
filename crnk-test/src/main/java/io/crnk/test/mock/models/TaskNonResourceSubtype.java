// ---docerion
// type: source
// title: TaskNonResourceSubtype
// summary: Subtype of Task without a JsonApiResource annotation, used to verify reflection-based discovery ignores it.
// ---

package io.crnk.test.mock.models;

/**
 * Does not carry a @JsonApiResource annotation. Make sure it works everywhere. e.g.
 * generation with reflection-based discovery, it must be ignored.
 */
public class TaskNonResourceSubtype extends Task {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

