// ---docerion
// type: source
// title: CrnkSecurityProperties
// summary: Binds the crnk.security configuration properties, including the enabled flag that controls whether the security module is active.
// ---

package io.crnk.spring.setup.boot.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-security
 */
@ConfigurationProperties("crnk.security")
public class CrnkSecurityProperties {

	private boolean enabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
