// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `angular-cli.json`.

// ---docerion
// type: source
// title: environment.ts
// summary: Development environment configuration exporting the production flag and frontend and backend ports.
// relations:
//   - references /crnk-ui/src/environments/environment.prod.ts
//   - references /crnk-ui/angular-cli.json
// ---

export const environment = {
	production: false,

	ports: {
		frontend: 4200,
		backend: 18080
	}
};
