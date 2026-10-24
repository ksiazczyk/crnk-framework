// ---docerion
// type: source
// title: ValidationClientModuleFactory source code
// summary: Client module factory that creates and returns the crnk validation module for client-side usage.
// ---

package io.crnk.validation.internal;

import io.crnk.client.module.ClientModuleFactory;
import io.crnk.validation.ValidationModule;

public class ValidationClientModuleFactory implements ClientModuleFactory {

	@Override
	public ValidationModule create() {
		return ValidationModule.create();
	}
}