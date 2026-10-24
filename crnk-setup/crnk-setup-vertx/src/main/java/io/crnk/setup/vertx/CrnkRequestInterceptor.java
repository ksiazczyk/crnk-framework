// ---docerion
// type: source
// title: CrnkRequestInterceptor
// summary: Interface for intercepting CRnK requests in a Vert.x handler to transform the request context before dispatch.
// ---

package io.crnk.setup.vertx;

import io.crnk.core.engine.http.HttpRequestContext;
import reactor.core.publisher.Mono;

public interface CrnkRequestInterceptor {

    Mono<HttpRequestContext> onRequest(Mono<HttpRequestContext> mono);
}
