// ---docerion
// type: source
// title: RepositoryAdapterFactory for building repository adapters
// summary: Interface that accepts repositories and creates or decorates resource and relationship repository adapters.
// ---

package io.crnk.core.engine.internal.repository;

import io.crnk.core.engine.information.repository.RelationshipRepositoryInformation;
import io.crnk.core.engine.information.repository.ResourceRepositoryInformation;
import io.crnk.core.engine.information.resource.ResourceField;


public interface RepositoryAdapterFactory {

    boolean accepts(Object repository);

    ResourceRepositoryAdapter createResourceRepositoryAdapter(ResourceRepositoryInformation information, Object repository);

    RelationshipRepositoryAdapter createRelationshipRepositoryAdapter(ResourceField field, RelationshipRepositoryInformation information, Object repository);

    ResourceRepositoryAdapter decorate(ResourceRepositoryAdapter adapter);

    RelationshipRepositoryAdapter decorate(RelationshipRepositoryAdapter adapter);

}
