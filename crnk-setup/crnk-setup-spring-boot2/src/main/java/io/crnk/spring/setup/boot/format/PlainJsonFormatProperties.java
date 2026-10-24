// ---docerion
// type: source
// title: PlainJsonFormatProperties
// summary: Configuration properties bound to the crnk.format.plain prefix that expose an enabled flag for the plain-json format.
// ---

package io.crnk.spring.setup.boot.format;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-format-plain-json
 */
@ConfigurationProperties("crnk.format.plain")
public class PlainJsonFormatProperties {

	private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
