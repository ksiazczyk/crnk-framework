// ---docerion
// type: source
// title: CrnkBootConfigurer
// summary: Java interface allowing customizers to configure a CrnkBoot instance during Spring Boot application startup.
// ---

package io.crnk.spring.setup.boot.core;

import io.crnk.core.boot.CrnkBoot;

public interface CrnkBootConfigurer {

	void configure(CrnkBoot boot);
}
