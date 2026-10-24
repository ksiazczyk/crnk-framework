// ---docerion
// type: source
// title: Crnk Home configuration properties
// summary: Spring Boot configuration properties bound to the crnk.home prefix, exposing an enabled flag to toggle the Crnk Home module.
// ---

package io.crnk.spring.setup.boot.home;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-home
 */
@ConfigurationProperties("crnk.home")
public class CrnkHomeProperties {

	private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
