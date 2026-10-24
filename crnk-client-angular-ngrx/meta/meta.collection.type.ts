// ---docerion
// type: source
// title: Meta collection type model and query path
// summary: Meta model and query path for a collection type resource in the CRNK meta schema.
// ---

import {
	BeanPath,
	StringPath
} from '../expression/';
import {QMetaElement} from './meta.element';
import {
	MetaType,
	QMetaType
} from './meta.type';
import {
	ManyQueryResult,
	OneQueryResult
} from 'ngrx-json-api';

export interface MetaCollectionType extends MetaType {
}
export interface MetaCollectionTypeResult extends OneQueryResult {
	data?: MetaCollectionType;
}
export interface MetaCollectionTypeListResult extends ManyQueryResult {
	data?: Array<MetaCollectionType>;
}
export class QMetaCollectionType extends BeanPath<MetaCollectionType> {
	metaId = 'resources.meta.collectionType';
	id: StringPath = this.createString('id');
	type: StringPath = this.createString('type');
	relationships: QMetaType.QRelationships = new QMetaType.QRelationships(this, 'relationships');
	attributes: QMetaElement.QAttributes = new QMetaElement.QAttributes(this, 'attributes');
}
export let createEmptyMetaCollectionType = function(id: string): MetaCollectionType {
	return {
		id: id,
		type: 'meta/collectionType',
	};
};