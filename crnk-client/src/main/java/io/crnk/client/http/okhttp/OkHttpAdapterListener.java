// ---docerion
// type: source
// title: OkHttpAdapterListener interface
// summary: Interface for native OkHttp listeners that receive a request builder during adapter initialization.
// ---

package io.crnk.client.http.okhttp;

import okhttp3.OkHttpClient.Builder;

public interface OkHttpAdapterListener {

	void onBuild(Builder builder);

}
