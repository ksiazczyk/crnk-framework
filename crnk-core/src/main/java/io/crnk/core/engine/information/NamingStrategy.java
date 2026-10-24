// ---docerion
// type: source
// title: NamingStrategy
// summary: Experimental interface for customizing resource paths and other namings in the engine.
// ---

package io.crnk.core.engine.information;

/**
 * Experimental, in the future to be used to adapt all kind of namings. As a first
 * step the resource paths can be customized.
 */
public interface NamingStrategy {

	String adaptPath(String path);
}
