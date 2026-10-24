// ---docerion
// type: source
// title: CrnkHomeProperties
// summary: Spring Boot configuration properties class binding the crnk.home prefix to an enabled flag.
// ---

package io.crnk.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-home
 */
@ConfigurationProperties("crnk.home")
public class CrnkHomeProperties {

	private boolean enabled = true;

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
