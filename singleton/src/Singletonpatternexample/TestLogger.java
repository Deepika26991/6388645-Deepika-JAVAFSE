package Singletonpatternexample;

public class TestLogger {
    public static void main(String[] args) {
        // Getting Logger instance the first time
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        // Getting Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("Continuing application...");

        // Checking if both instances are same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton works!");
        } else {
            System.out.println("Different logger instances. Singleton failed!");
        }
    }
}
