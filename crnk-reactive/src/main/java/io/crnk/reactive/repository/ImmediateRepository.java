// ---docerion
// type: source
// title: ImmediateRepository annotation
// summary: Java annotation marking a non-reactive repository as immediate so calls are not moved to worker threads.
// ---

package io.crnk.reactive.repository;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows to mark a non-reactive repository as being immediate/non-blocking. Calls will then not be moved to worker threads.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ImmediateRepository {
}
