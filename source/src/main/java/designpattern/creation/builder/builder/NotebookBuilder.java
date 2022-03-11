package designpattern.creation.builder.builder;

import designpattern.creation.builder.*;
import designpattern.creation.builder.product.Notebook;

public class NotebookBuilder implements ItemBuilder {

    private Notebook notebook = new Notebook();

    @Override
    public void reset() {
        notebook = new Notebook();
    }

    @Override
    public void monitor(Monitor part) {
        notebook.setMonitor(part);
    }

    @Override
    public void graphicCard(GraphicCard part) {
        notebook.setGraphicCard(part);
    }

    @Override
    public void cpu(CPU part) {
        notebook.setCpu(part);
    }

    @Override
    public void os(OS os) {
        notebook.setOs(os);
    }

    public Notebook getProduct() {
        return notebook;
    }
}
