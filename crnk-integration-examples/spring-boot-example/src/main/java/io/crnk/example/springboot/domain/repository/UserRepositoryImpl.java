// ---docerion
// type: source
// title: UserRepositoryImpl wraps UserEntity with JPA
// summary: A JPA entity repository for UserEntity backed by the CRNK JPA base class.
// ---

package io.crnk.example.springboot.domain.repository;

import io.crnk.example.springboot.domain.model.UserEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl extends JpaEntityRepositoryBase<UserEntity, String> implements UserRepository {

    public UserRepositoryImpl() {
        super(UserEntity.class);
    }
}