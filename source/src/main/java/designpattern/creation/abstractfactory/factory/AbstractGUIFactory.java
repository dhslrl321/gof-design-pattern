package designpattern.creation.abstractfactory.factory;

import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.Menu;

public interface AbstractGUIFactory {
    Button createButton();
    Menu createMenu();
}
