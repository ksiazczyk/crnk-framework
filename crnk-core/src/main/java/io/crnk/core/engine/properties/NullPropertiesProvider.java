// ---docerion
// type: source
// title: NullPropertiesProvider
// summary: An empty properties provider implementation that always returns null for any key.
// ---

package io.crnk.core.engine.properties;

/**
 * Just an empty properties provider. Always returns a null.
 */
public class NullPropertiesProvider implements PropertiesProvider {

	@Override
	public String getProperty(String key) {
		return null;
	}
}
