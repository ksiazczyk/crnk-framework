// ---docerion
// type: source
// title: DefaultJpaRepositoryFactory
// summary: Implements JpaRepositoryFactory to create the default JPA entity repository for a given module and configuration.
// ---

package io.crnk.data.jpa;

public class DefaultJpaRepositoryFactory implements JpaRepositoryFactory {

    @Override
    public <T, I> JpaEntityRepository<T, I> createEntityRepository(JpaModule module,
                                                                   JpaRepositoryConfig<T> config) {

        return new JpaEntityRepository<>(config);
    }
}
