package dev.rama27.App;

import dev.rama27.App.ConfigurationProperties.BoatProperties;
import dev.rama27.App.ConfigurationProperties.CarProperties;
import dev.rama27.App.ConfigurationProperties.CompanyProperties;
import dev.rama27.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {

    @Autowired
    private CarProperties carProperties;
    @Autowired
    private BoatProperties boatProperties;
    @Autowired
    private CompanyProperties companyProperties;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("CarProperties: " + carProperties);
        System.out.println("BoatProperties: " + boatProperties);
        System.out.println("CompanyProperties: " + companyProperties);
    }
}