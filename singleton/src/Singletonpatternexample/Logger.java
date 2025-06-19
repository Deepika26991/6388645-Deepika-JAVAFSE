package Singletonpatternexample;

public class Logger {
    // Step 1: Private static instance of the same class
    private static Logger singleInstance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger(); // create only once
        }
        return singleInstance;
    }

    // Method to simulate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
