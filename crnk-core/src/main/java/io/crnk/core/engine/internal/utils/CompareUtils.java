// ---docerion
// type: source
// title: CompareUtils compares two objects for equality
// summary: Provides a null-safe equality check that treats null and equal objects as equal.
// ---

package io.crnk.core.engine.internal.utils;

public class CompareUtils {

	private CompareUtils() {
	}

	public static boolean isEquals(Object a, Object b) {
		return (a == b) || (a != null && a.equals(b));
	}
}
