// ---docerion
// type: source
// title: LibertyApp
// summary: JAX-RS application entry point that maps the API to the /api path.
// ---

package io.crnk.example.openliberty.microprofile;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class LibertyApp extends Application {

}