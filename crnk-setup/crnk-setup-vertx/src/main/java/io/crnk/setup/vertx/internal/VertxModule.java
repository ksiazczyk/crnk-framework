// ---docerion
// type: source
// title: VertxModule CRnK module for Vert.x
// summary: A CRnK module class that registers the vertx module and provides its setup hook.
// ---

package io.crnk.setup.vertx.internal;

import io.crnk.core.module.Module;

public class VertxModule implements Module {


	@Override
	public void setupModule(ModuleContext context) {
	}

	@Override
	public String getModuleName() {
		return "vertx";
	}
}
