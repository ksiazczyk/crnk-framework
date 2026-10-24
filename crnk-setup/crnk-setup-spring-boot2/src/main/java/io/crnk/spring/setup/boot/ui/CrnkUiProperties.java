// ---docerion
// type: source
// title: CrnkUiProperties
// summary: Configuration properties binding the crnk.ui prefix to toggles for enabling the UI module and its browser.
// ---

package io.crnk.spring.setup.boot.ui;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-ui
 */
@ConfigurationProperties("crnk.ui")
public class CrnkUiProperties {

	private boolean enabled = true;

	private boolean browserEnabled = true;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isBrowserEnabled() {
		return browserEnabled;
	}

	public void setBrowserEnabled(boolean browserEnabled) {
		this.browserEnabled = browserEnabled;
	}
}
