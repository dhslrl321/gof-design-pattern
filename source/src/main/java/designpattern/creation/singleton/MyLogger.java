package designpattern.creation.singleton;

public class MyLogger {
    private static MyLogger INSTANCE = new MyLogger();

    private int line = 0;

    private MyLogger() {}

    public static MyLogger getInstance() {
        return INSTANCE;
    }

    public void loggingToFile(String action) {
        System.out.println(line + " : " + action);
        line++;
    }
}
