// ---docerion
// type: source
// title: SpringExceptionModule registers the bean exception mapper
// summary: CRNK module that registers the BeanExceptionMapper so Spring bean creation errors are handled consistently.
// ---

package io.crnk.spring.exception;

import io.crnk.core.module.Module;

public class SpringExceptionModule implements Module {

	@Override
	public String getModuleName() {
		return "spring.exception";
	}

	@Override
	public void setupModule(ModuleContext context) {
		context.addExceptionMapper(new BeanExceptionMapper(context));
	}
}
