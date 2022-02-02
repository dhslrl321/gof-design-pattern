package p0;

public class Main {
    public static void main(String[] args) {
        Notificator notificator = new ToastNotificator();
        Notifier notifier = new Notifier();

        notifier.notify(notificator);
    }
}
