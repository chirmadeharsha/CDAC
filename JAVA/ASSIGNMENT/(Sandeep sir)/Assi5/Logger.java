public class Logger {
    // Singleton instance
    private static Logger instance;
    private StringBuilder logMessages;

    // Private constructor to prevent instantiation
    private Logger() {
        logMessages = new StringBuilder();
    }

    // Method to get the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    // Method to get all log messages
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear log messages
    public void clearLog() {
        logMessages.setLength(0);
    }
}
