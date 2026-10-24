// ---docerion
// type: source
// title: PersistenceRollbackExceptionMapper
// summary: Maps a JPA RollbackException to an error response by extending the shared JPA exception mapper base class.
// ---

package io.crnk.data.jpa.internal;

import io.crnk.core.module.Module;

import javax.persistence.RollbackException;

/**
 * RollbackException can hide the more interesting causes.
 */
public class PersistenceRollbackExceptionMapper extends AbstractJpaExceptionMapper<RollbackException> {


	public PersistenceRollbackExceptionMapper(Module.ModuleContext context) {
		super(context);
	}
}
