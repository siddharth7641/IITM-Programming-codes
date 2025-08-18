import java.util.logging.*;

/*
Logger logger = Logger.getLogger("MyLoggerName");
private static final Logger logger =Logger.getLogger("com.myapp.calculator");
If a logger for com.example.myapp is configured with a specific logging level, 
all loggers within that package e.g., com.example.myapp MyClass, com.example.myapp.AnotherClass) will inherit that level unless explicitly
 */
public class logging {

    private static final Logger logger = Logger.getLogger("MyLogger");
    public static void process(){
        logger.info("Application started.");
        try {
            int result =divide(10, 0); // This will cause a divide-by-zero exception
            logger.info("Result is:" + result);
        } catch (ArithmeticException e) {
            logger.severe("Exception occurred:" + e.getMessage());
        }
        logger.warning("This is a warning message.");
        logger.info("Application finished."); // OR logger.log(Level.INFO, "Application finished.")
        }
        // Method to divide two numbers
        public static int divide(int a, int b) {
        return a / b;
    }
    public static void endProcess(){
        logger.log(Level.WARNING, "This is warning message");
        logger.log(Level.INFO,"Application finished");
    }
    public static void main(String[] args) {
        logger.setLevel(Level.ALL); 
        process();
        endProcess();
        test t = new test();
        t.run();
        System.out.println(logger.getLevel());
    }
    
}

class test {
    private static final Logger logger = Logger.getLogger("MyLogger");
    public void run(){
        logger.warning("This is warning message from run()");
    }
}
