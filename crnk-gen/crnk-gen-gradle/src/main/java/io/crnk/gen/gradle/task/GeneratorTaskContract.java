// ---docerion
// type: source
// title: GeneratorTaskContract interface
// summary: An interface shared by generator tasks that defines how a GeneratorModule is injected into a Gradle task.
// ---

package io.crnk.gen.gradle.task;

import io.crnk.gen.base.GeneratorModule;

public interface GeneratorTaskContract {


    void setModule(GeneratorModule module);
}
