// ---docerion
// type: source
// title: StringMapper
// summary: An interface extending StringParser that adds a toString method for mapping objects to their string representation.
// ---

package io.crnk.core.engine.parser;

public interface StringMapper<T> extends StringParser<T> {

	String toString(T input);

}
