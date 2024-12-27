package dev.rama27.App;

import dev.rama27.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {

    @Value("${app.commonProperty: not supplied}")
    private String commonProperty;
    @Value("${app.appProperty: not supplied}")
    private String appProperty;
    @Value("${app.defaultProperty: not supplied}")
    private String defaultProperty;
    @Value("${app.site1Property: not supplied}")
    private String site1Property;
    @Value("${app.site2Property: not supplied}")
    private String site2Property;


    private final Hello greeter;
    @Value("${app.audience: Default World}")
    private String audience;

    public AppCommand(Hello greeter) {
        this.greeter = greeter;
    }

    @Override
    public void run(String... args) throws Exception {
        greeter.sayHello(audience);
        System.out.println("commonProperty: " + commonProperty);
        System.out.println("appProperty: " + appProperty);
        System.out.println("defaultProperty: " + defaultProperty);
        System.out.println("site1Property: " + site1Property);
        System.out.println("site2Property: " + site2Property);
    }
}