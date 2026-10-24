// ---docerion
// type: source
// title: Meta JSON object model and query path
// summary: Meta model and query path for a JSON object resource extending a data object in the CRNK meta schema.
// ---

import {
	BeanPath,
	StringPath
} from '../expression/';
import {
	MetaDataObject,
	QMetaDataObject
} from './meta.data.object';
import {
	ManyQueryResult,
	OneQueryResult
} from 'ngrx-json-api';

export interface MetaJsonObject extends MetaDataObject {
}
export interface MetaJsonObjectResult extends OneQueryResult {
	data?: MetaJsonObject;
}
export interface MetaJsonObjectListResult extends ManyQueryResult {
	data?: Array<MetaJsonObject>;
}
export class QMetaJsonObject extends BeanPath<MetaJsonObject> {
	metaId = 'resources.meta.jsonObject';
	id: StringPath = this.createString('id');
	type: StringPath = this.createString('type');
	relationships: QMetaDataObject.QRelationships = new QMetaDataObject.QRelationships(this, 'relationships');
	attributes: QMetaDataObject.QAttributes = new QMetaDataObject.QAttributes(this, 'attributes');
}
export let createEmptyMetaJsonObject = function(id: string): MetaJsonObject {
	return {
		id: id,
		type: 'meta/jsonObject',
	};
};