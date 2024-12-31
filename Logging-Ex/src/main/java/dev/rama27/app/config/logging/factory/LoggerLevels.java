package dev.rama27.app.config.logging.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggerLevels implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        log.trace("Trace message");
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warn message");
        log.error("Error message");
        ExpensiveToLog expensiveToLog = new ExpensiveToLog();
        if(log.isDebugEnabled()) {
            log.debug("debug for expensiveToLog: {}", expensiveToLog, " !");
        }

    }
}

class ExpensiveToLog{
    public String toString(){
        try{
            Thread.sleep(1000);
        }
        catch (Exception ignored){
        }
        return "hello!!";
    }
}