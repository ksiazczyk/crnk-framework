// ---docerion
// type: source
// title: RestTemplateAdapterListenerBase
// summary: Base class providing a default no-op implementation of the RestTemplateAdapterListener interface.
// ---

package io.crnk.spring.client;


import org.springframework.web.client.RestTemplate;

public class RestTemplateAdapterListenerBase implements RestTemplateAdapterListener {

	@Override
	public void onBuild(RestTemplate template) {
		// nothing to do
	}
}
