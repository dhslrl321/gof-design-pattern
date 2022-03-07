package designpattern.creation.abstractfactory;

import designpattern.creation.abstractfactory.factory.WindowGUIFactory;
import designpattern.creation.abstractfactory.product.Button;
import designpattern.creation.abstractfactory.product.OsxButton;
import designpattern.creation.abstractfactory.product.WindowButton;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WindowGUIFactoryTest {

    WindowGUIFactory sut = new WindowGUIFactory();

    @Test
    void create() {
        Button button = sut.createButton();

        assertThat(button).isInstanceOf(Button.class);
        assertThat(button).isNotExactlyInstanceOf(OsxButton.class);

        assertThat(button).isExactlyInstanceOf(WindowButton.class);
    }
}