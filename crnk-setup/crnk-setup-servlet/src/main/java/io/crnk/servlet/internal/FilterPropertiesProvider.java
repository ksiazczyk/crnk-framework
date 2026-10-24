// ---docerion
// type: source
// title: FilterPropertiesProvider servlet filter config
// summary: Provides crnk properties by delegating to the init parameters of a servlet FilterConfig.
// ---

package io.crnk.servlet.internal;

import io.crnk.core.engine.properties.PropertiesProvider;

import javax.servlet.FilterConfig;

public class FilterPropertiesProvider implements PropertiesProvider {

	private FilterConfig servletConfig;

	public FilterPropertiesProvider(FilterConfig servletConfig) {
		this.servletConfig = servletConfig;
	}

	@Override
	public String getProperty(String key) {
		return servletConfig.getInitParameter(key);
	}

}
