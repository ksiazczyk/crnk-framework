// ---docerion
// type: source
// title: PATCH HTTP method annotation for JAX-RS
// summary: Declares a PATCH HTTP method annotation bound to JAX-RS methods and types for partial update operations.
// ---

package io.crnk.operations.internal;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.NameBinding;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@HttpMethod("PATCH")
@Documented
@NameBinding
public @interface PATCH {

}
