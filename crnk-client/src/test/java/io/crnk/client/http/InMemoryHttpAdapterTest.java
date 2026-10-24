// ---docerion
// type: test
// title: In-memory HTTP adapter test
// summary: Runs the repository access client test suite against the in-memory HTTP adapter.
// ---

package io.crnk.client.http;

import io.crnk.client.CrnkClient;
import io.crnk.client.http.inmemory.InMemoryHttpAdapter;
import io.crnk.client.suite.RepositoryAccessClientTest;

public class InMemoryHttpAdapterTest extends RepositoryAccessClientTest {


    @Override
    protected void setupClient(CrnkClient client) {
        super.setupClient(client);

        InMemoryHttpAdapter adapter = new InMemoryHttpAdapter(testContainer.getBoot(), client.getServiceUrlProvider().getUrl());
        client.setHttpAdapter(adapter);
    }
}
