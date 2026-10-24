// ---docerion
// type: source
// title: JpaEntityRepository
// summary: Exposes a JPA entity as a ResourceRepository by extending the JPA entity repository base class.
// ---

package io.crnk.data.jpa;

/**
 * Exposes a JPA entity as ResourceRepository.
 */
public class JpaEntityRepository<T, I > extends JpaEntityRepositoryBase<T, I> {

    public JpaEntityRepository(JpaRepositoryConfig<T> config) {
        super(config);
    }
}
