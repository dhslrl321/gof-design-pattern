package designpattern.creation.dp1abstractfactory.factory;

import designpattern.creation.dp1abstractfactory.product.Button;
import designpattern.creation.dp1abstractfactory.product.Menu;
import designpattern.creation.dp1abstractfactory.product.OsxButton;
import designpattern.creation.dp1abstractfactory.product.OsxMenu;

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
