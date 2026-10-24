// ---docerion
// type: source
// title: MetaDataObjectProviderBase
// summary: Abstract base class that builds meta attributes from bean information and wires them to getter and setter methods.
// ---

package io.crnk.meta;

import io.crnk.client.module.ClientModuleFactory;
import io.crnk.core.module.Module;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MetaClientModuleFactoryTest {

	@Test
	public void test() {
		ServiceLoader<ClientModuleFactory> loader = ServiceLoader.load(ClientModuleFactory.class);
		Iterator<ClientModuleFactory> iterator = loader.iterator();
		Assert.assertTrue(iterator.hasNext());
		ClientModuleFactory moduleFactory = iterator.next();
		Assert.assertFalse(iterator.hasNext());
		Module module = moduleFactory.create();
		Assert.assertTrue(module instanceof MetaModule);
	}
}
