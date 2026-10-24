// ---docerion
// type: source
// title: JpaQueryFactoryContext for factory initialization
// summary: Interface providing context with the entity manager and meta partition to a JpaQueryFactory.
// ---

package io.crnk.data.jpa.query;

import io.crnk.meta.provider.MetaPartition;

import javax.persistence.EntityManager;

public interface JpaQueryFactoryContext {

	EntityManager getEntityManager();

	MetaPartition getMetaPartition();

}
