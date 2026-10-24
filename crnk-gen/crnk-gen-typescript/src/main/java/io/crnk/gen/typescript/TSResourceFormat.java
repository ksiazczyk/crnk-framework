// ---docerion
// type: source
// title: TSResourceFormat
// summary: Enum describing the available JSON:API data formats the generator can produce, including the deprecated ngrx-crnk option.
// ---

package io.crnk.gen.typescript;

public enum TSResourceFormat {

	/**
	 * @deprecated use one of the other two. This library makes use of the deprecated crnk ngrx library.
	 */
	NGRX_CRNK,

	/**
	 * generates the simplified JSON:API-like data format.
	 */
	PLAINJSON,

	/**
	 * generates JSON:API data structures using ngrx-json-api library.
	 */
	NGRX

}
