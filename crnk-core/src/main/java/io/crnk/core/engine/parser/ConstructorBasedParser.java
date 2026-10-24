// ---docerion
// type: source
// title: ConstructorBasedParser
// summary: A StringParser implementation that converts input strings into objects by invoking a supplied constructor via reflection.
// ---

package io.crnk.core.engine.parser;

import io.crnk.core.engine.internal.utils.ExceptionUtil;

import java.lang.reflect.Constructor;
import java.util.concurrent.Callable;

public class ConstructorBasedParser<T> implements StringParser<T> {

	private final Constructor constructor;

	public ConstructorBasedParser(Constructor constructor) {
		this.constructor = constructor;
	}

	@Override
	public T parse(String input) {

		return ExceptionUtil.wrapCatchedExceptions(new Callable<T>() {
			@Override
			public T call() throws Exception {
				return (T) constructor.newInstance(input);
			}
		});

	}
}
