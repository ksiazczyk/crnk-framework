// ---docerion
// type: source
// title: PersistenceExceptionMapper
// summary: Maps a JPA PersistenceException to an error response by extending the shared JPA exception mapper base class.
// ---

package io.crnk.data.jpa.internal;

import io.crnk.core.module.Module;

import javax.persistence.PersistenceException;

/**
 * PersistenceExceptions can hide the more interesting causes.
 */
public class PersistenceExceptionMapper extends AbstractJpaExceptionMapper<PersistenceException> {


	public PersistenceExceptionMapper(Module.ModuleContext context) {
		super(context);
	}
}
