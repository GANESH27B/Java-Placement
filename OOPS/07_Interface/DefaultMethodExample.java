interface LoggerFeature {
    void log(String message);

    default void info(String message) {
        log("INFO: " + message);
    }
}

class ConsoleLogger implements LoggerFeature {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        LoggerFeature logger = new ConsoleLogger();
        logger.info("Application started");
    }
}