// ---docerion
// type: test
// title: Project patch strategy repository
// summary: In-memory repository for ProjectPatchStrategy that assigns generated ids on save.
// ---

package io.crnk.core.mock.repository;

import io.crnk.core.mock.models.ProjectPatchStrategy;
import io.crnk.core.repository.InMemoryResourceRepository;

public class ProjectPatchStrategyRepository extends InMemoryResourceRepository<ProjectPatchStrategy, Long> {


    public ProjectPatchStrategyRepository() {
        super(ProjectPatchStrategy.class);
    }

    @Override
    public <S extends ProjectPatchStrategy> S save(S entity) {
        entity.setId((long) (resources.size() + 1));
        return super.save(entity);
    }
}
