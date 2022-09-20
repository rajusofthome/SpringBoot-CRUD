
package com.example.crud.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {

	/*
	 * @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
	 * .select()
	 * .apis(RequestHandlerSelectors.basePackage("com.example.crud.controller"))
	 * .paths(PathSelectors.any()) .build(); }
	 */

	@Bean
	public GroupedOpenApi api() {
		return GroupedOpenApi.builder()
				.group("Crud API")
				.pathsToMatch("/*")
				.build();
	}

	@Bean
	public OpenAPI openapi()
	{
		return new OpenAPI().info(
				new Info().title("CRUD APP API")
						  .description("API documentation of CRUD App")
						  .version("v1")
						  .license(new License().name("Apache 2.0").url("http://springdoc.org"))
						  .summary("Summary of Crud App API")
						  .termsOfService("Crud App Terms and Service"));
	
	}

}
