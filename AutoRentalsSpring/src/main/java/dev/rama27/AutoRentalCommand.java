package dev.rama27;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoRentalCommand implements CommandLineRunner {
    public void run(String ... args) throws Exception {
        System.out.println("Auto Rental HAS STARTED!! ARGS ARE "+ List.of(args));

    }
}
