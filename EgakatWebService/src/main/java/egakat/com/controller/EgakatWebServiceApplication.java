package egakat.com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "egakat.com")
@EntityScan(basePackages = "egakat.com.model")
@EnableJpaRepositories("egakat.com.repository")
public class EgakatWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgakatWebServiceApplication.class, args);
	}

}
