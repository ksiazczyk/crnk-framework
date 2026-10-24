// ---docerion
// type: source
// title: RelationshipRepositoryInformationImpl
// summary: Implementation of the relationship repository information interface that stores the method access and relationship matcher.
// ---

package io.crnk.core.engine.internal.information.repository;

import io.crnk.core.engine.information.repository.RelationshipRepositoryInformation;
import io.crnk.core.engine.information.repository.RepositoryMethodAccess;
import io.crnk.core.repository.RelationshipMatcher;

public class RelationshipRepositoryInformationImpl implements
		RelationshipRepositoryInformation {


	private final RepositoryMethodAccess access;

	private final RelationshipMatcher matcher;

	public RelationshipRepositoryInformationImpl(RelationshipMatcher matcher, RepositoryMethodAccess access) {
		this.matcher = matcher;
		this.access = access;
	}

	@Override
	public RepositoryMethodAccess getAccess() {
		return access;
	}

	@Override
	public RelationshipMatcher getMatcher() {
		return matcher;
	}
}
