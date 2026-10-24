// ---docerion
// type: test
// title: End-to-end test for the movie management app
// summary: Protractor Jasmine end-to-end test that navigates to the app and asserts the welcome message displays.
// ---

import {MoapMovieMgmtCliPage} from "./app.po";

describe('moap-movie-mgmt-cli App', function () {
	let page: MoapMovieMgmtCliPage;

	beforeEach(() => {
		page = new MoapMovieMgmtCliPage();
	});

	it('should display message saying app works', () => {
		page.navigateTo();
		expect(page.getParagraphText()).toEqual('app works!');
	});
});
