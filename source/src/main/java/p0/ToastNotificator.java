package p0;

public class ToastNotificator implements Notificator {
    @Override
    public void execute() {
        System.out.println("Toast 를 이용하여 notify");
    }
}
