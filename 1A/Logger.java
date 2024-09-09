public class Logger {
    // Step 1: Create a private static instance of the Logger class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation from other classes
    private Logger() {
        // Private constructor logic, if needed
    }

    // Step 3: Provide a public static method to get the single instance of the Logger
    public static Logger getInstance() {
        if (instance == null) {
            // Lazy initialization: Create the instance if it doesn't exist
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Logging method that can be accessed through the singleton instance
    public void log(String message) {
        // Simulate logging by printing to the console (could be to a file or other destination)
        System.out.println("[LOG] " + message);
    }
}