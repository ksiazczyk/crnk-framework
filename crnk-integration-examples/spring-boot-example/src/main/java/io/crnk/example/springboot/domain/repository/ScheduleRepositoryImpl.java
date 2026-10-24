// ---docerion
// type: source
// title: ScheduleRepositoryImpl wraps ScheduleEntity with JPA
// summary: A JPA entity repository for the ScheduleEntity backed by the CRNK JPA base class.
// ---

package io.crnk.example.springboot.domain.repository;

import io.crnk.example.springboot.domain.model.ScheduleEntity;
import io.crnk.data.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;

@Component
public class ScheduleRepositoryImpl extends JpaEntityRepositoryBase<ScheduleEntity, Long> {

    public ScheduleRepositoryImpl() {
        super(ScheduleEntity.class);
    }
}