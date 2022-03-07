package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.Menu;
import designpattern.creation.abstractfactory.product.OsxButton;
import designpattern.creation.abstractfactory.product.OsxMenu;

public class OsxGUIFactory implements AbstractGUIFactory {
    @Override
    public Button createButton() {
        return new OsxButton();
    }

    @Override
    public Menu createMenu() {
        return new OsxMenu();
    }
}
