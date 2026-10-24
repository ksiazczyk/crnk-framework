// ---docerion
// type: source
// title: Angular application bootstrap
// summary: Bootstraps the Angular AppModule in the browser and enables production mode when the environment requires it.
// relations:
//   - references /crnk-ui/src/polyfills.ts
// ---

import "./polyfills.ts";
import {platformBrowserDynamic} from "@angular/platform-browser-dynamic";
import {enableProdMode} from "@angular/core";
import {environment} from "./environments/environment";
import {AppModule} from "./app/app.module";

if (environment.production) {
	enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule);
