// ---docerion
// type: source
// title: StringParser
// summary: Interface that parses a string into a typed value.
// ---

package io.crnk.core.engine.parser;

public interface StringParser<T> {
	T parse(String input);
}
