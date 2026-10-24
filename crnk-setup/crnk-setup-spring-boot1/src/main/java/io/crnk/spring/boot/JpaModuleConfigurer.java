// ---docerion
// type: source
// title: JpaModuleConfigurer interface
// summary: Java interface that lets users customize the CRnK JPA module configuration through a configure method.
// ---

package io.crnk.spring.boot;

import io.crnk.data.jpa.JpaModuleConfig;

public interface JpaModuleConfigurer {

	void configure(JpaModuleConfig config);
}
