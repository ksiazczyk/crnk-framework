// ---docerion
// type: source
// title: UserRepository interface for UserEntity resources
// summary: An interface for the User repository extending the CRNK ResourceRepository with a String id.
// ---

package io.crnk.example.springboot.domain.repository;

import io.crnk.core.repository.ResourceRepository;
import io.crnk.example.springboot.domain.model.UserEntity;

public interface UserRepository extends ResourceRepository<UserEntity, String> {

}
