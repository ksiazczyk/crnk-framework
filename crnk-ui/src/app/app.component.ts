// ---docerion
// type: source
// title: Root component class
// summary: Angular root component class that implements AfterViewInit.
// relations:
//   - references /crnk-ui/src/app/app.component.html
//   - references /crnk-ui/src/app/app.component.scss
// ---

import {Component, ElementRef, AfterViewInit} from "@angular/core";


@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.scss']
})
export class AppComponent implements AfterViewInit {
	title = 'app works!';

	constructor(private el: ElementRef) {
	}

	ngAfterViewInit() {
	}
}
