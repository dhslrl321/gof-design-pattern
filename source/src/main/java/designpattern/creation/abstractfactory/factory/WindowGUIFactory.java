package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.Menu;
import designpattern.creation.abstractfactory.product.WindowButton;
import designpattern.creation.abstractfactory.product.WindowMenu;

public class WindowGUIFactory implements AbstractGUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowMenu();
    }
}
