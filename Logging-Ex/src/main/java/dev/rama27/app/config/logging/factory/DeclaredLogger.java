package dev.rama27.app.config.logging.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public class DeclaredLogger implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DeclaredLogger.class);
    @Override
    public void run(String... args) throws Exception {

        logger.info("Declared SL4J Logger message");
    }
}
