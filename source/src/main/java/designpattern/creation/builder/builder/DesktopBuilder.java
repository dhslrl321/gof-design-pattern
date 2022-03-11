package designpattern.creation.builder.builder;

import designpattern.creation.builder.CPU;
import designpattern.creation.builder.GraphicCard;
import designpattern.creation.builder.Monitor;
import designpattern.creation.builder.OS;
import designpattern.creation.builder.product.Desktop;


public class DesktopBuilder implements ItemBuilder {

    private Desktop desktop = new Desktop();

    @Override
    public void reset() {
        desktop = new Desktop();
    }

    @Override
    public void monitor(Monitor part) {

    }

    @Override
    public void graphicCard(GraphicCard part) {
        desktop.setGraphicCard(part);
    }

    @Override
    public void cpu(CPU part) {
        desktop.setCpu(part);
    }

    @Override
    public void os(OS os) {
        desktop.setOs(os);
    }

    public Desktop getProduct() {
        return desktop;
    }
}
