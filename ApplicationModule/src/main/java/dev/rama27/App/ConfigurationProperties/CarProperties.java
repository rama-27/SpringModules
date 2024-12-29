package dev.rama27.App.ConfigurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app.config.car")
public class CarProperties {
    private String name;

    public CarProperties() {
    }
    public CarProperties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarProperties{" +
                "name='" + name + '\'' +
                '}';
    }

}
