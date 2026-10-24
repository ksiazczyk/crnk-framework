// ---docerion
// type: source
// title: RuntimeExtension provides runtime configuration
// summary: A Gradle extension providing runtime configuration options such as Spring.
// ---

package io.crnk.gen.gradle;

import groovy.lang.Closure;
import io.crnk.gen.base.RuntimeConfiguration;
import io.crnk.gen.base.SpringRuntimeConfig;
import org.gradle.api.Project;

public class RuntimeExtension extends RuntimeConfiguration {

	private Project project;

	public RuntimeExtension(Project project) {
		this.project = project;
	}

	public SpringRuntimeConfig spring(Closure closure) {
		return (SpringRuntimeConfig) project.configure(getSpring(), closure);
	}
}
