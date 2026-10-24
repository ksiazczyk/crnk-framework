// ---docerion
// type: source
// title: SpringSecurityModule Crnk module for Spring exception mappers
// summary: A Crnk module that registers the Spring exception mappers, such as the access-denied mapper, with the Crnk framework.
// ---

package io.crnk.spring.security;

import io.crnk.core.module.Module;
import io.crnk.spring.internal.AccessDeniedExceptionMapper;

/**
 * Module to register the Spring exception mappers with Crnk.
 */
public class SpringSecurityModule implements Module {

	private SpringSecurityModule() {
	}

	public static SpringSecurityModule create() {
		return new SpringSecurityModule();
	}

	@Override
	public String getModuleName() {
		return "spring.security";
	}

	@Override
	public void setupModule(ModuleContext context) {
		context.addExceptionMapper(new AccessDeniedExceptionMapper());
	}
}
