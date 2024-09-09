class AnotherClass {
    public static void performTask() {
        // Access the singleton logger instance from another class
        Logger logger = Logger.getInstance();
        logger.log("AnotherClass is performing a task");
    }
}