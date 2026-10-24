// ---docerion
// type: source
// title: HelloWorldService JAX-RS resource
// summary: A JAX-RS resource exposing a GET endpoint at /hello that returns a simple HTML greeting.
// ---

package io.crnk.example.wildfly;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldService {

	@GET
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}

}