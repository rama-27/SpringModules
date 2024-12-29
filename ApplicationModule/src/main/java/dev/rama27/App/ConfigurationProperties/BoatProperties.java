package dev.rama27.App.ConfigurationProperties;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app.config.boat")
public class BoatProperties {
    @NotBlank
    private final String name;
    private final String year;

    @ConstructorBinding
    public BoatProperties(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public String getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "BoatProperties{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
