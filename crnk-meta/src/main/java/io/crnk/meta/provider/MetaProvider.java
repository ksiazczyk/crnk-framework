// ---docerion
// type: source
// title: MetaProvider interface
// summary: Interface for a meta provider exposing dependencies, partitions, filters and meta types.
// ---

package io.crnk.meta.provider;

import io.crnk.meta.model.MetaElement;

import java.util.Collection;
import java.util.Set;

public interface MetaProvider {

	void init(MetaProviderContext context);

	Collection<MetaProvider> getDependencies();

	Collection<MetaPartition> getPartitions();

	Collection<MetaFilter> getFilters();

	Set<Class<? extends MetaElement>> getMetaTypes();

}