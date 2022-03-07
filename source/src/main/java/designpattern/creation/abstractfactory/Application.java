package designpattern.creation.abstractfactory;

import designpattern.creation.abstractfactory.factory.AbstractGUIFactory;
import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.Menu;
import lombok.Getter;
import lombok.Setter;

public class Application {

    private AbstractGUIFactory factory;

    @Setter
    @Getter
    private Button button;

    @Setter
    @Getter
    private Menu menu;

    public Application(AbstractGUIFactory factory) {
        this.button = factory.createButton();
        this.menu = factory.createMenu();
    }
}
