// ---docerion
// type: source
// title: ToStringStringMapper
// summary: Abstract mapper that converts values to strings using toString.
// ---

package io.crnk.core.engine.parser;

abstract class ToStringStringMapper<T> implements StringMapper<T> {

	@Override
	public String toString(T input) {
		return input.toString();
	}
}