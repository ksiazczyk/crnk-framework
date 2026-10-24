// ---docerion
// type: source
// title: RequestDispatcher interface
// summary: Interface that processes an HTTP request context and dispatches requests, with deprecated methods retained for backward compatibility.
// ---

package io.crnk.core.engine.dispatcher;

import io.crnk.core.engine.document.Document;
import io.crnk.core.engine.http.HttpRequestContextBase;
import io.crnk.core.engine.http.HttpResponse;
import io.crnk.core.engine.result.Result;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface RequestDispatcher {

    Optional<Result<HttpResponse>> process(HttpRequestContextBase requestContextBase) throws IOException;

    /**
     * @deprecated make use of JsonApiRequestProcessor
     */
    @Deprecated
    Response dispatchRequest(String jsonPath, String method, Map<String, Set<String>> parameters,
                             Document requestBody);

    /**
     * @deprecated make use of JsonApiRequestProcessor
     */
    @Deprecated
    void dispatchAction(String jsonPath, String method, Map<String, Set<String>> parameters);

}
