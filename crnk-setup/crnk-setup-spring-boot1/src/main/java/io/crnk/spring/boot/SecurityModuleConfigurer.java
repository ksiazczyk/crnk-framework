// ---docerion
// type: source
// title: SecurityModuleConfigurer interface
// summary: Java interface that enables customizing the CRnK security configuration through a configure method.
// ---

package io.crnk.spring.boot;

import io.crnk.security.SecurityConfig;

public interface SecurityModuleConfigurer {

	void configure(SecurityConfig.Builder config);
}
