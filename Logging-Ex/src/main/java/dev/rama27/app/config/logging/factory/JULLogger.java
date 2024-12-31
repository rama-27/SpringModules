package dev.rama27.app.config.logging.factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

public class JULLogger implements CommandLineRunner {
    private static final Logger logger= Logger.getLogger(JULLogger.class.getName());

    @Override
    public void run(String ... args) throws Exception {
        logger.info("JUL Logger");

    }

}
