// ---docerion
// type: source
// title: RestTemplateAdapterListener
// summary: Interface for native listeners notified when the underlying RestTemplate is built.
// ---

package io.crnk.spring.client;

import org.springframework.web.client.RestTemplate;

public interface RestTemplateAdapterListener {

	void onBuild(RestTemplate template);

}
