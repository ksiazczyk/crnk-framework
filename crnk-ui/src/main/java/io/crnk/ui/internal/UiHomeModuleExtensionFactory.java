// ---docerion
// type: source
// title: UI Home Module Extension Factory
// summary: A factory that builds a HomeModuleExtension configured with the UI module path.
// ---

package io.crnk.ui.internal;

import io.crnk.home.HomeModuleExtension;
import io.crnk.ui.UIModuleConfig;

public class UiHomeModuleExtensionFactory {

	public static HomeModuleExtension create(UIModuleConfig config) {
		HomeModuleExtension ext = new HomeModuleExtension();
		ext.addPath(config.getPath());
		return ext;
	}
}
