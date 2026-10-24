// ---docerion
// type: source
// title: AppComponent Dagger component interface
// summary: Dagger component interface that wires together the application module and exposes the AppServer for dependency injection.
// ---

package io.crnk.example.vertx;


import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {


    AppServer server();

    // void inject(MyFragment fragment);
    // void inject(MyService service);
}