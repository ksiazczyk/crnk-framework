// ---docerion
// type: source
// title: Application routes
// summary: Defines the application routes, mapping the root path to the browse component.
// ---

import {Routes} from "@angular/router";
import {BrowseComponent} from "./browse";

export const ROUTES: Routes = [
	{path: '', component: BrowseComponent},
];


