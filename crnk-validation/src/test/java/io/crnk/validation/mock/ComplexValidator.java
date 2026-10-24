// ---docerion
// type: test
// title: ComplexValidator for the ComplexValid constraint
// summary: Implements the ConstraintValidator for ComplexValid, rejecting Project and Task objects named invalid.
// ---

package io.crnk.validation.mock;

import io.crnk.validation.mock.models.Project;
import io.crnk.validation.mock.models.Task;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ComplexValidator implements ConstraintValidator<ComplexValid, Object> {

	public static final String INVALID_NAME = "invalid";

	@Override
	public void initialize(final ComplexValid a) {
	}

	@Override
	public boolean isValid(final Object t, final ConstraintValidatorContext cvc) {
		if (t instanceof Project) {
			Project p = (Project) t;
			return !INVALID_NAME.equals(p.getName());
		}
		if (t instanceof Task) {
			Task p = (Task) t;
			return !INVALID_NAME.equals(p.getName());
		}
		return true;
	}
}