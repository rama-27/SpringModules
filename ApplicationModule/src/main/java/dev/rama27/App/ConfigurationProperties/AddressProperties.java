package dev.rama27.App.ConfigurationProperties;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddressProperties {
    private final String street;
    @NotNull
    private final String city;
    @NotNull
    private final String state;
}
