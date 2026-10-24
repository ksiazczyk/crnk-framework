// ---docerion
// type: source
// title: TransactionRunner interface
// summary: Java interface that defines a method to execute a callable within a transactional context and return its result.
// ---

package io.crnk.core.engine.transaction;

import java.util.concurrent.Callable;

public interface TransactionRunner {

	<T> T doInTransaction(Callable<T> callable);
}
