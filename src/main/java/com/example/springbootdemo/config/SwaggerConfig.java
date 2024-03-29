package com.example.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)////是否开启 (true 开启  false隐藏。生产环境建议隐藏)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootdemo.controller"))//扫描的路径包,设置basePackage会将包下的所有被@Api标记类的所有方法作为api
                .paths(PathSelectors.any())//指定路径处理PathSelectors.any()代表所有的路径
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot模板接口文档")//设置文档标题(API名称)
                .description("接口说明")//文档描述
                .termsOfServiceUrl("http://localhost:8081/")//服务条款URL
                .version("1.0.0")
                .build();
    }
}
