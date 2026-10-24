// ---docerion
// type: source
// title: MetaModuleConfigurer
// summary: Interface allowing custom configuration of the Crnk MetaModule configuration during auto-configuration.
// ---

package io.crnk.spring.setup.boot.meta;

import io.crnk.meta.MetaModuleConfig;

public interface MetaModuleConfigurer {

	void configure(MetaModuleConfig config);
}
