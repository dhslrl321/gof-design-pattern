package designpattern.creation.dp1abstractfactory;

import designpattern.creation.dp1abstractfactory.factory.WindowGUIFactory;
import designpattern.creation.dp1abstractfactory.product.Button;
import designpattern.creation.dp1abstractfactory.product.OsxButton;
import designpattern.creation.dp1abstractfactory.product.WindowButton;
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