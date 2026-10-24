// ---docerion
// type: config
// title: build.gradle
// summary: Gradle build configuration for the crnk-security module that applies the Java plugin and declares project dependencies.
// ---

package io.crnk.security;

import io.crnk.core.engine.http.HttpMethod;
import io.crnk.core.engine.security.SecurityProvider;
import io.crnk.core.queryspec.QuerySpec;

/**
 * Allows to limit access to individual resources based on the data held by the resources. This is implemented
 * by applying further {@link io.crnk.core.queryspec.FilterSpec} to {@link QuerySpec}. This interface complements
 * {@link io.crnk.core.engine.filter.ResourceFilter} that allows to hide resource types and attributes.
 */
public interface DataRoomFilter {

    QuerySpec filter(QuerySpec querySpec, HttpMethod method, SecurityProvider securityProvider);

}
