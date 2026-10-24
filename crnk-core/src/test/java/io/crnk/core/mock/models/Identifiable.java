// ---docerion
// type: source
// title: Identifiable interface
// summary: Interface returning a comparable identifier for mock resources.
// ---

package io.crnk.core.mock.models;

public interface Identifiable<T extends Comparable<T>> {

    T getId();
}