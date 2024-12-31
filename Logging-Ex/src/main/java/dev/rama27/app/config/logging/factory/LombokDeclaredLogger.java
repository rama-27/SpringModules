package dev.rama27.app.config.logging.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
public class LombokDeclaredLogger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Lombok Logger");
    }
}
