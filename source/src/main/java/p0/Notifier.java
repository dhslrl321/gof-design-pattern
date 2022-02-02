package p0;

public class Notifier {
    void notify(Notificator notificator) {
        if (notificator.getClass().equals(ToastNotificator.class)) {
            notificator.execute();
        }
    }
}
