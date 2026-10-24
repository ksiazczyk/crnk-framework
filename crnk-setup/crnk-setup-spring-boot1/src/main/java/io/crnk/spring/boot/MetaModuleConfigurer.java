// ---docerion
// type: source
// title: MetaModuleConfigurer interface
// summary: Java interface that allows customizing the CRnK meta module configuration via a configure method.
// ---

package io.crnk.spring.boot;

import io.crnk.meta.MetaModuleConfig;

public interface MetaModuleConfigurer {

	void configure(MetaModuleConfig config);
}
