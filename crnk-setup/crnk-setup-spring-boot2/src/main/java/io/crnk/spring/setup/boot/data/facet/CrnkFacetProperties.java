// ---docerion
// type: source
// title: CrnkFacetProperties
// summary: Configuration properties bound to the crnk.facet prefix that control whether the crnk facet feature is enabled.
// ---

package io.crnk.spring.setup.boot.data.facet;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for crnk-data-facet
 */
@ConfigurationProperties("crnk.facet")
public class CrnkFacetProperties {

	/**
	 * Whether to enable the crnk jpa auto configuration.
	 */
	private Boolean enabled = true;

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
