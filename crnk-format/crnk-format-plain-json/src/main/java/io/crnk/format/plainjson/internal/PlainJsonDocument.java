// ---docerion
// type: source
// title: PlainJsonDocument
// summary: A lightweight PlainJsonDocument subclass that copies data, included, links, meta, errors and jsonapi fields from another Document.
// ---

package io.crnk.format.plainjson.internal;

import io.crnk.core.engine.document.Document;

public class PlainJsonDocument extends Document {

	public PlainJsonDocument() {

	}

	public PlainJsonDocument(Document document) {
		super();
		setData(document.getData());
		setIncluded(document.getIncluded());
		setLinks(document.getLinks());
		setMeta(document.getMeta());
		setErrors(document.getErrors());
		setJsonapi(document.getJsonapi());
	}
}
