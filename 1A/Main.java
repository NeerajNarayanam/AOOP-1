public class Main {
    public static void main(String[] args) {
        // Step 5: Access the singleton instance and log messages
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("Performing some operation");
        logger.log("Application finished");

        // Another class accessing the same logger instance
        AnotherClass.performTask();
    }
}