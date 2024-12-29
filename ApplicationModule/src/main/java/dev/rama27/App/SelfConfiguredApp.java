package dev.rama27.App;

import dev.rama27.Hello;
import dev.rama27.StdOutHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SelfConfiguredApp {
    public static void main(String...args) {
        SpringApplication.run(SelfConfiguredApp.class, args);
    }
    @Bean
    public Hello greeter() {
        return new StdOutHello("Application @BEAN SAYSSSS");
    }
}