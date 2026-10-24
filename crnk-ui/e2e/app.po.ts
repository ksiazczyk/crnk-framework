// ---docerion
// type: test
// title: Page object for the movie management app
// summary: Protractor page object that navigates to the app and reads the heading text for e2e tests.
// ---

import {browser, element, by} from "protractor";

export class MoapMovieMgmtCliPage {
	navigateTo() {
		return browser.get('/');
	}

	getParagraphText() {
		return element(by.css('app-root h1')).getText();
	}
}
