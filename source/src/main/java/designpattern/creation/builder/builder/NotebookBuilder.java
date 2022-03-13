package designpattern.creation.builder.builder;

import designpattern.creation.builder.product.*;
import designpattern.creation.builder.product.component.CPU;
import designpattern.creation.builder.product.component.GraphicCard;
import designpattern.creation.builder.product.component.OS;

public class NotebookBuilder implements ItemBuilder {

    private Notebook notebook = new Notebook();

    public Notebook getProduct() {
        return notebook;
    }

    @Override
    public void graphicCard(GraphicCard graphicCard) {
        notebook.setGraphicCard(graphicCard);
    }

    @Override
    public void cpu(CPU cpu) {
        notebook.setCpu(cpu);
    }

    @Override
    public void os(OS os) {
        notebook.setOs(os);
    }
}

