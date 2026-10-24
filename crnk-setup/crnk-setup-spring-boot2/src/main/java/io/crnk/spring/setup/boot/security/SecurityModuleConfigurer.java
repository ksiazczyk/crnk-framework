// ---docerion
// type: source
// title: SecurityModuleConfigurer
// summary: Interface allowing customizers to configure a SecurityConfig.Builder during Crnk security module setup.
// ---

package io.crnk.spring.setup.boot.security;

import io.crnk.security.SecurityConfig;

public interface SecurityModuleConfigurer {

	void configure(SecurityConfig.Builder config);
}
