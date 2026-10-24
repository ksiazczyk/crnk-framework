// ---docerion
// type: source
// title: PropertiesProvider
// summary: Interface defining the contract for retrieving configuration properties by key.
// ---

package io.crnk.core.engine.properties;

public interface PropertiesProvider {

	String getProperty(String key);
}
