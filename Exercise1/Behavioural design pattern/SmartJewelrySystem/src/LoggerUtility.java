import java.util.logging.*;

public class LoggerUtility {
    private static Logger logger = Logger.getLogger(LoggerUtility.class.getName());

    static {
        LogManager.getLogManager().reset();
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        logger.addHandler(ch);
        logger.setLevel(Level.ALL);
    }

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }

    public static void logError(String message, Throwable t) {
        logger.log(Level.SEVERE, message, t);
    }
}
