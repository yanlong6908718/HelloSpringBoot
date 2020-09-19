package com.makotojava.learn.hellospringboot.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean

    public Docket docket(){
    ParameterBuilder builder =new ParameterBuilder();
    builder.parameterType("header").name("token")
            .description("token value")
            .required(true)
            .modelRef(new ModelRef("String"));
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Webtest_interface")
                .apiInfo(apiInfo())
                .globalOperationParameters(Lists.newArrayList(builder.build()))
                .select().paths(PathSelectors.any()).build();
    }

private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Webtest-mini系统")
                .description("Webtest-mini接口文档")
                .contact(new Contact("tlibn","","yy@qq.com"))
                .version("1.0")
                .build();

}

}
