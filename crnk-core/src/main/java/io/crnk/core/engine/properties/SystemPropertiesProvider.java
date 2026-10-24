// ---docerion
// type: source
// title: SystemPropertiesProvider
// summary: Properties provider that reads values from the JVM system properties.
// ---

package io.crnk.core.engine.properties;

public class SystemPropertiesProvider implements PropertiesProvider {

	@Override
	public String getProperty(String key) {
		return System.getProperty(key);
	}
}