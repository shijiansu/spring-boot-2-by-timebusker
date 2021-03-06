package cn.timebusker.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(information()).select()
        .apis(RequestHandlerSelectors.basePackage("cn.timebusker"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo information() {
    Contact contact = new Contact("timebusker", "mail://xxx@gmail.com", "xxx@gmail.com");
    return new ApiInfoBuilder()
        .title("Spring Boot中使用Swagger2构建RESTful APIs")
        .description("More information：https://github.com/timebusker/spring-boot")
        .termsOfServiceUrl("https://www.apache.org/licenses/LICENSE-2.0")
        .contact(contact)
        .version("2.0.0")
        .build();
  }

}