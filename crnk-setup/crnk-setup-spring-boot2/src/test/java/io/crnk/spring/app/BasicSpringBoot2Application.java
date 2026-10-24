// ---docerion
// type: test
// title: Basic Spring Boot 2 test application
// summary: Minimal Spring Boot application used as a test fixture that imports Crnk core and JPA auto-configurations and exposes a custom API endpoint.
// ---

package io.crnk.spring.app;

import io.crnk.spring.setup.boot.core.CrnkCoreAutoConfiguration;
import io.crnk.spring.setup.boot.jpa.CrnkJpaAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration
@Import({CrnkCoreAutoConfiguration.class, CrnkJpaAutoConfiguration.class, ModuleConfig.class})
public class BasicSpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBoot2Application.class, args);
	}

	@RequestMapping("/api/custom")
	public String customMethod() {
		return "hello";
	}
}
