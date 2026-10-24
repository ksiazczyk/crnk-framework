// ---docerion
// type: source
// title: Meta interface model and query path
// summary: Meta model and query path for an interface resource extending a data object in the CRNK meta schema.
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

export interface MetaInterface extends MetaDataObject {
}
export interface MetaInterfaceResult extends OneQueryResult {
	data?: MetaInterface;
}
export interface MetaInterfaceListResult extends ManyQueryResult {
	data?: Array<MetaInterface>;
}
export class QMetaInterface extends BeanPath<MetaInterface> {
	metaId = 'resources.meta.interface';
	id: StringPath = this.createString('id');
	type: StringPath = this.createString('type');
	relationships: QMetaDataObject.QRelationships = new QMetaDataObject.QRelationships(this, 'relationships');
	attributes: QMetaDataObject.QAttributes = new QMetaDataObject.QAttributes(this, 'attributes');
}
export let createEmptyMetaInterface = function(id: string): MetaInterface {
	return {
		id: id,
		type: 'meta/interface',
	};
};