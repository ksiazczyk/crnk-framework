// ---docerion
// type: source
// title: QuerySpecUrlContext
// summary: Interface providing the registry, type parser, object mapper and URL builder used by query spec mapping.
// ---

package io.crnk.core.queryspec.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.crnk.core.engine.parser.TypeParser;
import io.crnk.core.engine.registry.ResourceRegistry;

public interface QuerySpecUrlContext {

    ResourceRegistry getResourceRegistry();

    TypeParser getTypeParser();

    ObjectMapper getObjectMapper();

    UrlBuilder getUrlBuilder();
}
