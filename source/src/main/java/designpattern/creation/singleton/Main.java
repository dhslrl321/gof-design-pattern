package designpattern.creation.singleton;

public class Main {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getInstance();

        logger.loggingToFile("해해");
        logger.loggingToFile("해해");
        logger.loggingToFile("해해");
        MyLogger logger2 = MyLogger.getInstance();

        logger2.loggingToFile("해해");
    }
}
