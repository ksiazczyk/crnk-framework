// ---docerion
// type: source
// title: FancyProject extending Project
// summary: Subclass of Project registered as a fancy-projects JSON API resource.
// ---

package io.crnk.core.mock.models;

import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "fancy-projects")
public class FancyProject extends Project {
}
