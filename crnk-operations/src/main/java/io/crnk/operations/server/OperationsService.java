// ---docerion
// type: source
// title: OperationsService
// summary: JAX-RS interface exposing an operations endpoint that executes multiple requests via JSON Patch.
// ---

package io.crnk.operations.server;

import io.crnk.operations.internal.PATCH;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Allows to execute multiple requests with a single using http://jsonpatch.com/.
 */
@Path("/operations")
public interface OperationsService {

	@PATCH
	@Path("/")
	@Consumes("application/json-patch+json")
	@Produces("application/json-patch+json")
	Response patch(String operations) throws IOException;

}
