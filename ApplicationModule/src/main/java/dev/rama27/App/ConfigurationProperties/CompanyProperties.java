package dev.rama27.App.ConfigurationProperties;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties("app.config.company")
@Data
@Validated
public class CompanyProperties {
    @NotNull
    private final String name;
    @NestedConfigurationProperty
    @NotNull
    private final List<AddressProperties> address;
}
