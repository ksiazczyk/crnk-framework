// ---docerion
// type: source
// title: UntypedRelationshipRepository
// summary: Deprecated interface for untyped relationship repositories that exposes source and target resource types.
// ---

package io.crnk.core.repository;

/**
 * @deprecated make use of RelationshipRepository.getMatcher()
 */
@Deprecated
public interface UntypedRelationshipRepository<T, I, D, J>
        extends RelationshipRepository<T, I, D, J> {

    String getSourceResourceType();

    String getTargetResourceType();

}