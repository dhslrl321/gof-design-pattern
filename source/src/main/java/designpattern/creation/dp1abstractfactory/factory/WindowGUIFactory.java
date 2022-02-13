package designpattern.creation.dp1abstractfactory.factory;

import designpattern.creation.dp1abstractfactory.product.Button;
import designpattern.creation.dp1abstractfactory.product.Menu;
import designpattern.creation.dp1abstractfactory.product.WindowButton;
import designpattern.creation.dp1abstractfactory.product.WindowMenu;

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
