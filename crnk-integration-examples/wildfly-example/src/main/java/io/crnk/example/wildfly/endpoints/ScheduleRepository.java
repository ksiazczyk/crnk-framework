// ---docerion
// type: source
// title: ScheduleRepository
// summary: A CRnK JPA entity repository for ScheduleEntity that exposes schedule resources backed by JPA persistence.
// ---

package io.crnk.example.wildfly.endpoints;

import io.crnk.example.wildfly.model.ScheduleEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;

public class ScheduleRepository extends JpaEntityRepositoryBase<ScheduleEntity, Long> {

    public ScheduleRepository() {
        super(ScheduleEntity.class);
    }
}