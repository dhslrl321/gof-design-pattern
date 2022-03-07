package designpattern.creation.abstractfactory;

import designpattern.creation.abstractfactory.factory.AbstractGUIFactory;
import designpattern.creation.abstractfactory.factory.OsxGUIFactory;
import designpattern.creation.abstractfactory.factory.WindowGUIFactory;
import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.Menu;

public class Client {
    public static void main(String[] args) {

        String type = "OSX";

        AbstractGUIFactory factory; // 해당 Factory 의 Type 만 알면 특정 Type 의 Product 를 알 수 있다.

        if ("OSX".equals(type)) {
            factory = new OsxGUIFactory();
        } else if ("WINDOWS".equals(type)) {
            factory = new WindowGUIFactory();
        } else {
            throw new IllegalArgumentException();
        }

        Application application = new Application(factory);

        Button button = application.getButton();
        Menu menu = application.getMenu();

        button.paint();
        menu.onClick();
    }
}
