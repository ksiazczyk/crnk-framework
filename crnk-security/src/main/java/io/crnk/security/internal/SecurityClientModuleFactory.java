// ---docerion
// type: source
// title: SecurityClientModuleFactory
// summary: Creates the client-side SecurityModule for the crnk security client integration.
// ---

package io.crnk.security.internal;

import io.crnk.client.module.ClientModuleFactory;
import io.crnk.security.SecurityModule;

public class SecurityClientModuleFactory implements ClientModuleFactory {

	@Override
	public SecurityModule create() {
		return SecurityModule.newClientModule();
	}
}