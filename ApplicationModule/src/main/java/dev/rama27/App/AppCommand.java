package dev.rama27.App;

import dev.rama27.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {
    private final Hello greeter;

    @Value("${app.audience: Default World}")
    private String audience;

    public AppCommand(Hello greeter) {
        this.greeter = greeter;
    }

    @Override
    public void run(String... args) throws Exception {
        greeter.sayHello(audience);
    }
}