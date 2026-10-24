// ---docerion
// type: test
// title: In-memory mock repository for Schedule
// summary: An in-memory mock repository for Schedule entities extending InMemoryResourceRepository.
// ---

package io.crnk.validation.mock.repository;

import io.crnk.core.repository.InMemoryResourceRepository;
import io.crnk.validation.mock.models.Schedule;

public class ScheduleRepository extends InMemoryResourceRepository<Schedule, Long> {

	public ScheduleRepository() {
		super(Schedule.class);
	}
}
