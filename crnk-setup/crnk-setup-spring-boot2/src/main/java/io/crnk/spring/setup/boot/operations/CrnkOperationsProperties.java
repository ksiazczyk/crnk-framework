// ---docerion
// type: source
// title: CrnkOperationsProperties
// summary: Configuration properties binding the crnk.operations settings, exposing an enabled flag to turn the operations module on or off.
// ---

package io.crnk.spring.setup.boot.operations;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-operations
 */
@ConfigurationProperties("crnk.operations")
public class CrnkOperationsProperties {

	private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
