// ---docerion
// type: source
// title: ManyRelationshipRepositoryBase
// summary: Read-only base implementation that rejects relation updates.
// ---

package io.crnk.core.repository;

import io.crnk.core.exception.MethodNotAllowedException;

import java.util.Collection;

/**
 * Read-only implementation
 */
public abstract class ManyRelationshipRepositoryBase<T, I, D, J> implements ManyRelationshipRepository<T, I, D, J> {


    @Override
    public void setRelations(T source, Collection<J> targetIds, String fieldName) {
        throw new MethodNotAllowedException("cannot be updated");
    }

    @Override
    public void addRelations(T source, Collection<J> targetIds, String fieldName) {
        throw new MethodNotAllowedException("cannot be updated");
    }

    @Override
    public void removeRelations(T source, Collection<J> targetIds, String fieldName) {
        throw new MethodNotAllowedException("cannot be updated");
    }
}
