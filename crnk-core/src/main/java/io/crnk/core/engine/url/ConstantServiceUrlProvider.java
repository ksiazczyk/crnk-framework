// ---docerion
// type: source
// title: ConstantServiceUrlProvider
// summary: A Java class implementing ServiceUrlProvider that returns a fixed URL string supplied through its constructor.
// ---

package io.crnk.core.engine.url;


public class ConstantServiceUrlProvider implements ServiceUrlProvider {

	private String result = null;

	public ConstantServiceUrlProvider(String result) {
		this.result = result;
	}

	@Override
	public String getUrl() {
		return result;
	}
}
