package cn.timebusker;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

  public static void main(String[] args) {
    // set spring.devtools.restart.enabled to false to disable.
    // System.setProperty("spring.devtools.restart.enabled","false");
    ApplicationContext ctx = SpringApplication.run(App.class, args);
    System.out.println("Let's inspect the beans provided by Spring Boot:");
    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
  }
}
