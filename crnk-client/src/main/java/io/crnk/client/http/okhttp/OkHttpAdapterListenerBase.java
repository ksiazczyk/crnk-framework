// ---docerion
// type: source
// title: OkHttpAdapterListenerBase default listener
// summary: Base class providing a default no-op implementation of the OkHttpAdapterListener interface.
// ---

package io.crnk.client.http.okhttp;

import okhttp3.OkHttpClient.Builder;

public class OkHttpAdapterListenerBase implements OkHttpAdapterListener {

	@Override
	public void onBuild(Builder builder) {
		// nothing to do
	}
}
