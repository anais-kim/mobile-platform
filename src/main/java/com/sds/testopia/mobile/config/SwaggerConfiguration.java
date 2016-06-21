package com.sds.testopia.mobile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket api(){
	    return new Docket(DocumentationType.SWAGGER_2)
	    .select()
	    .apis(RequestHandlerSelectors.any())
	    .paths(springfox.documentation.builders.PathSelectors.regex("/rest/.*"))
	    .build()
	    .apiInfo(apiInfo());
	}
	
	
	private ApiInfo apiInfo() {
	    ApiInfo apiInfo = new ApiInfo("Mobile Test Platform", "Api Documentation", "0.1", "urn:tos",
	            "Test Tech. Lab", "", "");
	    return apiInfo;
	}
	
	@Bean
	UiConfiguration uiConfig() {
	    return UiConfiguration.DEFAULT;
	}
}