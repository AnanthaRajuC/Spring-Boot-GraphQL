package io.github.anantharajuc.sbgql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot GraphQL.
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@ComponentScan({"io.github.anantharajuc.sbgql.api",
	            "io.github.anantharajuc.sbgql.service",
	            "io.github.anantharajuc.sbgql.infra.config"})
@SpringBootApplication
public class SpringBootGraphQlApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootGraphQlApplication.class, args);
	}
}
