package designpattern.creation.dp1abstractfactory.factory;

import designpattern.creation.dp1abstractfactory.product.Button;
import designpattern.creation.dp1abstractfactory.product.Menu;

public interface AbstractGUIFactory {
    Button createButton();
    Menu createMenu();
}
