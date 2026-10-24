// ---docerion
// type: source
// title: JpaModuleConfigurer
// summary: Interface allowing custom configuration of the Crnk JPA module configuration.
// ---

package io.crnk.spring.setup.boot.jpa;

import io.crnk.data.jpa.JpaModuleConfig;

public interface JpaModuleConfigurer {

	void configure(JpaModuleConfig config);
}
